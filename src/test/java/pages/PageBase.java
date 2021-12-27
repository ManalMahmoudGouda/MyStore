package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    public WebDriver driver;
    protected String URL;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Waits until the element is visible
     *
     * @param element
     */
    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 2, 5000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void setInputValue(WebElement input, String value) {
        this.waitUntilVisible(input);
        input.sendKeys(value);
    }

    /**
     * It waits until the Text Box appear and Press Key passed in the parameter
     *
     * @param element WebElement
     * @param key     Key to be pressed
     */
    public void setInputValue(WebElement element, Keys key) {
        this.waitUntilVisible(element);
        element.sendKeys(key);
    }

    /**
     * It waits until the Buttons appear, then Click on it
     *
     * @param btn
     */
    public void clickBtn(WebElement btn) {
        this.waitUntilVisible(btn);
        btn.click();
    }

}
