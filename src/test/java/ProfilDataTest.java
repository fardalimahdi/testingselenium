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


class ProfilDataTest extends PageBase {

    private By femaleXpath = By.xpath("/html/body/div[8]/div/form/div/div[3]/div[2]/input");
    private By  maleXpath = By.xpath("/html/body/div[8]/div/form/div/div[3]/div[1]/input");
    private By addressXpath = By.xpath("/html/body/div[8]/div/form/div/div[10]/input");
    private By activityXpath = By.xpath("/html/body/div[8]/div/form/div/div[13]/div/select");
    private By myactivityXpath = By.xpath("/html/body/div[8]/div/form/div/div[13]/div/select/option[15]");
    private By ageXpath = By.xpath("/html/body/div[8]/div/form/div/div[14]/div/select");
    private By myageXpath = By.xpath("/html/body/div[8]/div/form/div/div[14]/div/select/option[3]");
    private By brandXpath = By.xpath("/html/body/div[8]/div/form/div/div[15]/div/select");
    private By mybrandXpath = By.xpath("/html/body/div[8]/div/form/div/div[15]/div/select/option[3]");
    private By modelXpath = By.xpath("/html/body/div[8]/div/form/div/div[16]/div/select");
    private By mymodelxpath = By.xpath("/html/body/div[8]/div/form/div/div[16]/div/select/option[3]");
    private By dateXpath = By.xpath("/html/body/div[8]/div/form/div/div[17]/div/select");
    private By mydateXpath = By.xpath("/html/body/div[8]/div/form/div/div[17]/div/select/option[2]");
    private By yearXpath = By.xpath("/html/body/div[8]/div/form/div/div[18]/div/select");
    private By myearXpath = By.xpath("/html/body/div[8]/div/form/div/div[18]/div/select/option[28]");
    private By clickXpath = By.xpath("/html/body/div[8]/div/form/div/div[24]/button");

    Faker faker = new Faker();
    private String address = faker.address().streetAddress();


    public ProfilDataTest(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.wandaloo.com/espace-membre/profil.html");
    }    
    public void profil()
    {

        this.waitAndReturnElement(femaleXpath).click();
        this.waitAndReturnElement(maleXpath).click();

        this.waitAndReturnElement(addressXpath).click();
        this.waitAndReturnElement(addressXpath).sendKeys(address);
        this.waitAndReturnElement(activityXpath).click();
        this.waitAndReturnElement(myactivityXpath).click();
        this.waitAndReturnElement(ageXpath).click();
        this.waitAndReturnElement(myageXpath).click();
        this.waitAndReturnElement(brandXpath).click();
        this.waitAndReturnElement(mybrandXpath).click();
        this.waitAndReturnElement(modelXpath).click();
        this.waitAndReturnElement(mymodelxpath).click();
        this.waitAndReturnElement(dateXpath).click();
        this.waitAndReturnElement(mydateXpath).click();
        this.waitAndReturnElement(yearXpath).click();
        this.waitAndReturnElement(myearXpath).click();
        this.waitAndReturnElement(clickXpath).click();   
}
}
