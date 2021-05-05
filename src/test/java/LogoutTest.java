import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.github.javafaker.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


class LogoutTest extends PageBase {

    private By click1Xpath = By.xpath("/html/body/div[2]/div[1]/nav/ul/li[1]/a/img");
    private By click2Xpath = By.xpath("/html/body/div[2]/div[1]/nav/ul/li[1]/ul/li[5]/a");

    


    public LogoutTest(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.wandaloo.com");
    }    
    public void logout()
    {
        this.waitAndReturnElement(click1Xpath).click();
        this.waitAndReturnElement(click2Xpath).click();

}
}

    