package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    private WebDriver driver;

    @BeforeClass
    public void openBrowser() {

        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");

    }
    @AfterClass
    public void closeBrowser(){
        driver.close();

    }
    @Test
    public void verifyFirstCopyRightText() {
        String firstcopyrighttext = driver.findElement(By.id("admin_options")).getText();
        System.out.println("The first copyright text in the footer is " + firstcopyrighttext);
    }
}