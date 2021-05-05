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


class ContactUsResultPage extends PageBase {

    public ContactUsResultPage(WebDriver driver) {
        super(driver);
    }    
    public String getContactUsConfirmation() {
        WebElement bodyElement = this.waitAndReturnElement(By.tagName("/html/body/div[4]/div/div[4]/div[1]/p/font/a"));
        return bodyElement.getText();
    }
           
}
