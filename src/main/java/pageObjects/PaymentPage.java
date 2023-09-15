package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class PaymentPage extends TestBase{
	
	@FindBy(xpath="//input[@name='name_on_card']")
	public WebElement  input_NameOnCard;
	
	@FindBy(xpath="//input[@name='card_number']")
	public WebElement  input_CardNumber;
	
	@FindBy(xpath="//input[@name='cvc']")
	public WebElement  input_CVCNumber;
	
	@FindBy(xpath="//input[@name='expiry_month']")
	public WebElement  input_ExpiryMonth;
	
	@FindBy(xpath="//input[@name ='expiry_year']")
	public WebElement  input_ExpiryYear;
	
	@FindBy(xpath="//button[text()='Pay and Confirm Order']")
	public WebElement  btn_PayAndConfirmOrder;
	
	@FindBy(xpath="//p[text()='Congratulations! Your order has been confirmed!']")
	public WebElement  txt_OrderConfrim;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

}
