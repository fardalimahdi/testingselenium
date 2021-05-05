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


class LoginTest extends PageBase {

    private By emailXpath = By.xpath("/html/body/div[2]/div[1]/form/div[1]/input");
    private By passwordXpath = By.xpath("/html/body/div[2]/div[1]/form/div[2]/input");
    private By clickXpath = By.xpath("/html/body/div[2]/div[1]/form/button");

    private String email = "patoxes327@animex98.com";
    private String password = "123456abc";


    public LoginTest(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.wandaloo.com/login.html");
    }    
    public void login()
    {

        this.waitAndReturnElement(emailXpath).click();
        this.waitAndReturnElement(emailXpath).sendKeys(email);

        this.waitAndReturnElement(passwordXpath).click();
        this.waitAndReturnElement(passwordXpath).sendKeys(password);

        this.waitAndReturnElement(clickXpath).click();
        
    
}
}

    