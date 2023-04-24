package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobPositionPage {

        private final By btnInterested = By.xpath("//input[@name='BT_Apply']");

        private WebDriver driver;
        public JobPositionPage(WebDriver driver) {
            this.driver = driver;
        }

        public JobPositionPage clickBtnInterested(){
            driver.findElement((By) btnInterested).click();
            return this;
        }
}
