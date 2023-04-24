package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CareersPage {

    private final By btnSearchJob = By.xpath("//div[@id='hero-banner']//a[@aria-label='Learn more about Careers']");

    private WebDriver driver;
    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    public CareersPage clickBtnCareers(){
        driver.findElement((By) btnSearchJob).click();
        return this;
    }
}



