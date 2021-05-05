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


class SearchTest extends PageBase {
//*[@id="header"]/div[1]/div/div[2]/form/img
    private By nameXpath = By.xpath("/html/body/div[6]/div[1]/form/div[5]/select");
    private By brandXpath = By.xpath("/html/body/div[6]/div[1]/form/div[5]/select/option[2]");
    private By budgetXpath = By.xpath("/html/body/div[6]/div[1]/form/div[6]/select");
    private By mybudgetXpath = By.xpath("/html/body/div[6]/div[1]/form/div[6]/select/option[4]");
    private By categoryXpath = By.xpath("/html/body/div[6]/div[1]/form/div[7]/select");
    private By mycategoryXpath = By.xpath("/html/body/div[6]/div[1]/form/div[7]/select/option[8]");
    private By clickXpath = By.xpath("//*[@id='GoBox']");

    public SearchTest(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.wandaloo.com");
    }    
    public SearchResultPage search()
    {
        this.waitAndReturnElement(nameXpath).click();
        this.waitAndReturnElement(brandXpath).click();
        this.waitAndReturnElement(budgetXpath).click();
        this.waitAndReturnElement(mybudgetXpath).click();
        this.waitAndReturnElement(categoryXpath).click();
        this.waitAndReturnElement(mycategoryXpath).click();
        this.waitAndReturnElement(clickXpath).click();

        return new SearchResultPage(this.driver);

    }
    
}
    