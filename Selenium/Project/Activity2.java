package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
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
    public void printHeaderImageURL() {
        String imgUrl = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[1]/div[1]/img"))
                .getAttribute("src");
        System.out.println("The URL of the header image is" + imgUrl);

    }
}