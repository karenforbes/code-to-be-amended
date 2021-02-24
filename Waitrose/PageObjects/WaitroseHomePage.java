package uk.co.Waitrose.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WaitroseHomePage extends AbstractBasePage {

    public WaitroseHomePage (WebDriver webDriver) {
        super(webDriver);
    }

       public RegisterAccountPage navigateToRegisterAccountPage(String linkText) {
        webDriver.findElement(By.xpath("//a[normalize-space()=\"" + linkText + "\"]")).click();
        return new RegisterAccountPage(webDriver);
    }

}


