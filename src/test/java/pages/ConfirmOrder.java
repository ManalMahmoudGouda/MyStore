package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ConfirmOrder {
    WebDriver driver;

    public ConfirmOrder(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmOrderBySelectingWireBank() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//span[text()='I confirm my order']")));
        driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//a[text()='Back to orders']")));
        driver.findElement(By.xpath("//a[text()='Back to orders']")).click();

    }
}
