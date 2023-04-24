import org.example.JobPositionPage;
import org.example.NjoynPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class CareerTest {

    private NjoynPage njoynPage;

    private JobPositionPage jobPositionPage;

    @Before
    public void preconditionCareer() {
        ChromeDriver driver = new ChromeDriver();

        njoynPage = new NjoynPage(driver);
        jobPositionPage = new JobPositionPage(driver);

    }

    @org.junit.Test
    public void TestCarrer() throws InterruptedException {

        njoynPage.openNjoynPage();
        njoynPage.enterFldKeywords("SDET")
                 .enterFldCity("Halifax")
                 .clickBtnSearch()
                 .clickJobPosition();

        jobPositionPage.clickBtnInterested();
        jobPositionPage.enterFldEmail("MyHerasymov@gmail.com")
                .enterFldPass("MyNewJ0b!)")
                .enterBtnApply();
    }

    @After
    public void postconditionCareer(){
        //driver.quit();
    }


}
