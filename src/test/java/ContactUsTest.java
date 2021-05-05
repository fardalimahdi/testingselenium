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


class ContactUsTest extends PageBase {

    private By nameXpath = By.xpath("//*[@id='nom']");
    private By emailXpath = By.xpath("/html/body/div[7]/div/form/div[1]/div[2]/input");
    private By titleXpath = By.xpath("//*[@id='sujet']");
    private By contentXpath = By.xpath("//*[@id='message']");
    private By clickXpath = By.xpath("/html/body/div[7]/div/form/div[1]/div[6]/button");
    
    
    Faker faker = new Faker();
    private String name = faker.name().fullName(); 
    //private String email = faker.internet().safeEmailAddress();
    private String email = "wearekidding@cnxingye.com";
    private String title = faker.name().firstName();


    public ContactUsTest(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.wandaloo.com/contacter.html");
    }    
    public ContactUsResultPage contact()
    {
        this.waitAndReturnElement(nameXpath).click();
        this.waitAndReturnElement(nameXpath).sendKeys(name);

        this.waitAndReturnElement(emailXpath).click();
        this.waitAndReturnElement(emailXpath).sendKeys(email);

        this.waitAndReturnElement(titleXpath).click();
        this.waitAndReturnElement(titleXpath).sendKeys(title);

        this.waitAndReturnElement(contentXpath).click();
        this.waitAndReturnElement(contentXpath).sendKeys("I am testing your website,Just Chill bro Don't worry ! it is just a small test");

        this.waitAndReturnElement(clickXpath).click();
        
        return new ContactUsResultPage(this.driver);

    }
    
}
    