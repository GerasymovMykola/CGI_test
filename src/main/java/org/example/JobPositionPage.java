package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JobPositionPage {

        private final By btnInterested = By.xpath("//input[@name='BT_Apply']");
        private final By fldEmail = By.xpath("//input[@id = 'Inp_Login_email']");
        private final By fldPass = By.xpath("//input[@id = 'Inp_Login_password']");
        private final By btnApply = By.xpath("//input[@class = 'NjnButton'][@value = 'Apply']");

        private WebDriver driver;
        public JobPositionPage(WebDriver driver) {
            this.driver = driver;
        }

        public JobPositionPage clickBtnInterested(){
            driver.findElement((By) btnInterested).click();
            return this;
        }

        public JobPositionPage enterFldEmail(String strEmail) {

            WebElement elFldEmail = driver.findElement(fldEmail);

            Actions action= new Actions(driver);
            action.moveToElement(elFldEmail).build().perform();
            elFldEmail.click();
            elFldEmail.sendKeys(strEmail);
            return this;

        }

        public JobPositionPage enterFldPass(String strPass) {

            WebElement elFldPass = driver.findElement(fldPass);

            Actions action= new Actions(driver);
            action.moveToElement(elFldPass).build().perform();
            elFldPass.click();
            elFldPass.sendKeys(strPass);
            return this;

        }

    public JobPositionPage enterBtnApply() {

        WebElement elBtnAplly = driver.findElement(btnApply);

        Actions action= new Actions(driver);
        action.moveToElement(elBtnAplly).build().perform();
        elBtnAplly.click();

        return this;

    }
    }

