
import org.example.CareersPage;
import org.example.HomePage;
import org.example.JobPositionPage;
import org.example.NjoynPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AppTest {

    private HomePage homePage;
    private CareersPage careersPage;
    private NjoynPage njoynPage;

    private JobPositionPage jobPositionPage;

    @Before
    public void precondition() {
        ChromeDriver driver = new ChromeDriver();
        homePage = new HomePage(driver);
        careersPage = new CareersPage(driver);
        njoynPage = new NjoynPage(driver);
        jobPositionPage = new JobPositionPage(driver);

    }

    @org.junit.Test
    public void Test() throws InterruptedException {

        homePage.openHomePage()
                .clickBtnCookieAll();
        homePage.clickBtnCareers();

        careersPage.clickBtnCareers();

        njoynPage.explWait();
        njoynPage.enterFldKeywords("SDET")
                 .enterFldCity("Halifax")
                 .clickBtnSearch();

        njoynPage.clickJobPosition();
        jobPositionPage.clickBtnInterested();

    }

    @After
    public void postcondition(){
        //driver.quit();
    }


}
