package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProceedToCheckOut {
    WebDriver driver;

    public ProceedToCheckOut(WebDriver driver) {
        this.driver = driver;
    }
    public void proceedToCheckOut(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h4[text()='Follow us']")));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h4[text()='Follow us']")));
        driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
        driver.findElement(By.id("uniform-cgv")).click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h4[text()='Follow us']")));
        driver.findElement(By.name("processCarrier")).click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//span[text()='(order processing will be longer)']")));
        driver.findElement(By.className("bankwire")).click();




    }
}
