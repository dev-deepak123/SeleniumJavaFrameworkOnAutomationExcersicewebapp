package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//a[@data-product-id='1' and contains(@class, 'btn') ]")
	public WebElement  txt_CartLink;
	
	@FindBy(xpath="//u[text()='View Cart']")
	public WebElement  txt1_ViewCartLink;
	
	@FindBy(xpath="//a[text()=' Logged in as ']")
	public WebElement  txt1_UsernameOnHomePage;
	
	@FindBy(xpath="//a[text()=' Cart']")
	public WebElement  link_Cart;
	
	@FindBy(xpath="//a[@href='/delete_account']")
	public WebElement  link_DeleteAccount;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

}
