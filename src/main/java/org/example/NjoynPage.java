package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NjoynPage {

    private final By fldKeywords = By.xpath("//input[@id='Inp_Keywords']");
    private final By fldCity = By.xpath("//input[@id='Inp_City']");
    private final By btnSearch = By.xpath("//input[@id='joblistingsearchbutton]");
    private final By btnJobPosition = By.xpath("//div[@class='table-wrapper']//a[@href='XWeb.asp?NTKN=c&clid=21001&Page=JobDetails&Jobid=J0323-1740&BRID=1045234&lang=1']");
    private WebDriver driver;

    public NjoynPage(WebDriver driver) {
        this.driver = driver;
    }

    public NjoynPage enterFldKeywords(String keywords){
        driver.findElement(fldKeywords).click();
        driver.findElement(fldKeywords).sendKeys(keywords);
        return this;
    }

    public NjoynPage enterFldCity(String citi){
        driver.findElement(fldCity).click();
        driver.findElement(fldCity).sendKeys(citi);
        return this;
    }

    public NjoynPage clickBtnSearch() {
        driver.findElement((By) btnSearch).click();
        return this;
    }

    public NjoynPage explWait() {
        try{
            Thread.sleep(15000);}
        catch(InterruptedException ie){
        }
        return this;
    }

    public NjoynPage clickJobPosition() {
        driver.findElement((By) btnJobPosition).click();
        return this;
    }

}




