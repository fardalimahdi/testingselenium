import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import java.util.*;  


public class SeleniumTest {
    public WebDriver driver;
    
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @Test
    public void testContact() {
        ContactUsTest cut = new ContactUsTest(this.driver);
        ContactUsResultPage result = cut.contact();
        LoginTest lg = new LoginTest(this.driver);
        lg.login();
        ProfilDataTest pdt = new ProfilDataTest(this.driver);
        pdt.profil();
        SearchTest rgt = new SearchTest(this.driver);
        SearchResultPage result2 = rgt.search();
        LogoutTest lgt = new LogoutTest(this.driver);
        lgt.logout();
    }
    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
