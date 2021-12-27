package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class TestBase {
    public static WebDriver driver;
    private static HomePage home;
    private static CreateAnAccountPage createacc;
    private static MyAccountPage accountPage;
    private static ProceedToCheckOut proceedCheckout;
    private static ConfirmOrder confirmOrder;
    private static ValidateOderHistory orderHistory;
    String email = "Manal.mahmoud.gouda" + (int) Math.floor(Math.random() * (200 - 20 + 1) + 20) + "@gmail.com";
    ;
    String password = "Ma12342";
    String history = "$30.16";

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        home = new HomePage(driver);
        createacc = new CreateAnAccountPage(driver);
        accountPage = new MyAccountPage(driver);
        proceedCheckout = new ProceedToCheckOut(driver);
        confirmOrder = new ConfirmOrder(driver);
        orderHistory = new ValidateOderHistory(driver);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void createAnUserAccount() {
        home.signUp();
        home.fillMailAddress(email);
        createacc.fillFormToCreateNewAccount();
    }

    @Test(priority = 2)
    public void login() {
        home.signin(email, password);
        accountPage.moveToBlouses();
        System.out.println(email);
    }

    @Test(priority = 3)
    public void setProceedCheckout() {
        proceedCheckout.proceedToCheckOut();
    }

    @Test(priority = 4)
    public void ConfirmMyOrder() {
        confirmOrder.confirmOrderBySelectingWireBank();
    }

    @Test(priority = 5)
    public void checkOrderHistory() {
        orderHistory.checkOrderPrice();
        orderHistory.checkPaymentMethod();
    }

    @AfterClass
    public void stopDriver() {
        driver.quit();
    }


}
