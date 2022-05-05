package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
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
    public void verifyPageTitle() {
        String title = driver.getTitle();
        System.out.println("The title of the page is"  +title);
        try{
            Assert.assertEquals("SuiteCRM", title);
            System.out.println("Page title matches");
        } catch (AssertionError e){
            System.out.println("The page title is not correct");
        }
    }
}