package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void openBrowser() {

        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");

    }

    @AfterClass
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void login() throws Throwable {
        //Get the username text box
        WebElement username = driver.findElement(By.id("user_name"));


        //Get the password text box
        WebElement password = driver.findElement(By.id("username_password"));

        //Get the Login button
        WebElement loginButton = driver.findElement(By.id("bigbutton"));

        username.sendKeys("admin");

        password.sendKeys("pa$$w0rd");

        loginButton.click();

        wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toolbar")));

    }
    @Test(dependsOnMethods = {"login"})
        public void activityMenu() {

        WebElement activity = driver.findElement(By.cssSelector("a[id='grouptab_3']"));

        if (activity.isDisplayed()) {
            System.out.println("Activity menu is present");
        }
        else {
            System.out.println("Activity is not present");
        }
    }
}