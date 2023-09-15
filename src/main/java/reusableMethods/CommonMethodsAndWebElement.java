package reusableMethods;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TestBase;
public class CommonMethodsAndWebElement extends TestBase{
	@FindBy(xpath="//a[text()='Continue']")
	public WebElement  txt_Continue;
	
	public CommonMethodsAndWebElement() {
		PageFactory.initElements(driver, this);
	}
	public void scrollDownandClick(WebElement webElement) {
		 Actions actions = new Actions(driver);
	     actions.moveToElement(webElement);
	     actions.perform();
    }
	
	public static void clickOn(WebDriver driver, WebElement element, int timeout ) {
		new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));
		element.click();	
	}
	
	
	public static void sendkeys(WebDriver driver, WebElement element, int timeout, String value ) {
		new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value+ Keys.ENTER);
	}
	
	public static WebElement wait(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public static void scroll(WebElement element) {
		String scrollScript = "arguments[0].scrollIntoView();";
		((JavascriptExecutor) driver).executeScript(scrollScript, element);
	}

}
