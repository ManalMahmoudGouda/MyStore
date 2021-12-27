package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MyAccountPage {
    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveToBlouses() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.className("sf-with-ul"))).perform();
        driver.findElement(By.xpath("(//a[contains(.,\"Blouses\")])[1]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.className("product-count")));
        driver.findElement(By.className("product-container")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(.,\"Add to cart\")]")).click();
        driver.findElement(By.xpath("//span[contains(.,\"Proceed to checkout\")]")).click();


    }
}
