package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class CratPage extends TestBase{
	
	@FindBy(xpath="//a[text()='Proceed To Checkout']")
	public WebElement  txt1_ProceedToCheckoutLinkTxt;
	
	@FindBy(xpath="//u[text()='Register / Login']")
	public WebElement  txt1_RegisterLoginLink;
	
	@FindBy(xpath="//a[text()='Place Order']")
	public WebElement  link_PlaceOrder;
	
	public CratPage() {
		PageFactory.initElements(driver, this);
	}
	

}
