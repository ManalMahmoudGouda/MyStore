package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ValidateOderHistory {
    WebDriver driver;

    public ValidateOderHistory(WebDriver driver) {
        this.driver = driver;
    }
    public void checkOrderPrice(){
        String actualValue=driver.findElement(By.className("history_price")).getText();
        String ExpectedValue="$30.16";
        Assert.assertEquals(ExpectedValue, actualValue);
    }
    public void checkPaymentMethod(){
        String actualValue=driver.findElement(By.className("history_method")).getText();
        String ExpectedValue="Bank wire";
        Assert.assertEquals(ExpectedValue, actualValue);



    }



}
