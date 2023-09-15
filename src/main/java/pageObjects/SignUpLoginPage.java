package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;


public class SignUpLoginPage extends TestBase{
	
	@FindBy(xpath="//input[@name ='name']")
	public WebElement  input_nameField;
	
	@FindBy(xpath="//input[@data-qa ='signup-email']")
	public WebElement  input_signupEmailField;
	
	@FindBy(xpath="//button[@data-qa ='signup-button']")
	public WebElement  signUp_Button;
	
	@FindBy(xpath="//*[@id='id_gender1']")
	public WebElement  radio_gender;
	
	@FindBy(xpath="//*[@id='password']")
	public WebElement  input_PasswordField;
	
	@FindBy(xpath="//*[@id='days']/option[11]")
	public WebElement  select_days_DOB;
	
	@FindBy(xpath="//*[@id='months']/option[9]")
	public WebElement  select_Months_DOB;
	
	@FindBy(xpath="//*[@id='years']/option[13]")
	public WebElement  select_Year_DOB;
	
	@FindBy(xpath="//input[@name='first_name']")
	public WebElement  input_FirstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	public WebElement  input_LastName;
	
	@FindBy(xpath="//input[@name='address1']")
	public WebElement  input_Address;
	
	@FindBy(xpath="//input[@name='state']")
	public WebElement  input_State;
	
	@FindBy(xpath="//input[@name='city']")
	public WebElement  input_City;
	
	@FindBy(xpath="//input[@name='zipcode']")
	public WebElement  input_Zipcode;
	
	@FindBy(xpath="//input[@name='mobile_number']")
	public WebElement  input_MobileNumber;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement  btn_sumbit;
	
	public SignUpLoginPage() {
		PageFactory.initElements(driver, this);
	}

	

}
