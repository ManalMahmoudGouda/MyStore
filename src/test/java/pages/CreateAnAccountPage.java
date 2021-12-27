package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateAnAccountPage {
    WebDriver driver;

    public CreateAnAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillFormToCreateNewAccount() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Manal");
        driver.findElement(By.id("customer_lastname")).sendKeys("Mahmoud");
        driver.findElement(By.id("passwd")).sendKeys("Ma12342");
        driver.findElement(By.id("days")).sendKeys("28" + Keys.ENTER);
        driver.findElement(By.id("months")).sendKeys("November" + Keys.ENTER);
        driver.findElement(By.id("years")).sendKeys("1993" + Keys.ENTER);
        driver.findElement(By.id("uniform-newsletter")).click();
        driver.findElement(By.id("company")).sendKeys("EsriNea");
        driver.findElement(By.id("address1")).sendKeys("Banha");
        driver.findElement(By.id("address2")).sendKeys("16st,Building5,floor2");
        driver.findElement(By.id("city")).sendKeys("Banha");
        driver.findElement(By.id("id_state")).sendKeys("Alabama" + Keys.ENTER);
        driver.findElement(By.id("postcode")).sendKeys("12345");
        // driver.findElement(By.id("uniform-id_country")).sendKeys("United States"+Keys.ENTER);
        driver.findElement(By.id("other")).sendKeys("Additional Info");
        driver.findElement(By.id("phone")).sendKeys("01017075069");
        driver.findElement(By.id("phone_mobile")).sendKeys("010647520550");
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("Cairo");
        driver.findElement(By.id("submitAccount")).click();
        driver.findElement(By.className("logout")).click();


        System.out.println(driver.getCurrentUrl());


    }
}
