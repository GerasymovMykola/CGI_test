package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private final By btnAgreeCookie = By.xpath("//Button[@class ='agree-button eu-cookie-compliance-default-button']");
    private final By btnCareers = By.xpath( "//ul[@class = 'menu menu-level-0']//a[@href='/en/careers']");
    private final By btnMobileIcon = By.xpath( "//button[@class='mobile-icon-btn mobile-icon--collapse']");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage openHomePage(){
        driver.get("https://www.cgi.com");
        driver.manage().window().maximize();
        return this;
    }

    public HomePage clickBtnCookieAll(){

//        WebDriverWait wait = new WebDriverWait (driver, 5);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(btnAgreeCookie));
        driver.findElement((By) btnAgreeCookie).click();
        return this;

    }

    public HomePage clickBtnMobileIcon(){

        if (driver.findElement((By) btnMobileIcon).isEnabled())
        {
            driver.findElement((By) btnMobileIcon).click();
        }
        return this;
    }
    public HomePage clickBtnCareers(){
        driver.findElement((By) btnCareers).click();
        return this;
    }

}
