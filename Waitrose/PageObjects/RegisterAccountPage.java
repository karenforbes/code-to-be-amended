package uk.co.Waitrose.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class RegisterAccountPage extends AbstractBasePage {

    public RegisterAccountPage (WebDriver webDriver) {
        super(webDriver);
    }

    public String confirmRegisterAccount (String linkText) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()=\"" + linkText + "\"]"))).getText();

    }

    public RegisterAccountPage selectTitle() {
        webDriver.findElement(By.xpath("//select[@id='title']")).click();
        Select s = new Select(webDriver.findElement(By.xpath("//select[@id='title']")));
        s.selectByIndex(2);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public RegisterAccountPage inputFirstName(String linkText) {
        webDriver.findElement(By.xpath("//input[@id='firstName']")).sendKeys( linkText);
        return this;
    }

    public RegisterAccountPage inputLastName(String linkText) {
        webDriver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(linkText);
        return this;
    }

    public RegisterAccountPage inputContactNumber(String linkText) {
        webDriver.findElement(By.xpath("//input[@id='contactNumber']")).sendKeys(linkText);
        return this;
    }

    public RegisterAccountPage findAddress() {
        webDriver.findElement(By.xpath("//input[@id='address-search']")).sendKeys("PR25 4ZB");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        webDriver.findElement(By.xpath("//p[normalize-space()='4 Murray Street, Leyland, PR25 4ZB']")).click();
        return this;
    }

    public RegisterAccountPage continueToCompleteRegistration(String linkText) {
        webDriver.findElement(By.xpath("//p[normalize-space()=\"" + linkText + "\"")).click();
        return this;
    }

    public String confirmAccountAccepted (String linkText) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[normalize-space()='We deliver to']" + "//div[@class=\"" + linkText + "\""))).getText();
    }
}
