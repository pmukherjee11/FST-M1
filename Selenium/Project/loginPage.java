package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginPage {
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
    //@Parameters ({"pUserName","pPassword"})
    public void login() throws InterruptedException {
        //Get the username text box
        WebElement username = driver.findElement(By.id("user_name"));


        //Get the password text box
        WebElement password = driver.findElement(By.id("username_password"));

        //Get the Login button
        WebElement loginButton = driver.findElement(By.id("bigbutton"));

        username.sendKeys("admin");

        password.sendKeys("pa$$w0rd");

        loginButton.click();

        String dashboard = driver.findElement(By.id("tab0")).getText();

        try{
            Assert.assertEquals("SUITECRM DASHBOARD", dashboard);
            System.out.println("Dashboard title matches");
        } catch (AssertionError e){
            System.out.println("The Dashboard title is not correct");
        }

    }

}
