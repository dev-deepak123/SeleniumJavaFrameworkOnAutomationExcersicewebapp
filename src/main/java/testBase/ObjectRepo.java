package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.AccountPage;
import pageObjects.CratPage;
import pageObjects.DeletePage;
import pageObjects.HomePage;
import pageObjects.PaymentPage;
import pageObjects.SignUpLoginPage;
import reusableMethods.CommonMethodsAndWebElement;


public class ObjectRepo {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;
	public static CommonMethodsAndWebElement methods;
	public static AccountPage accountPage;
	public static CratPage cartPage;
	public static DeletePage deletePage;
	public static HomePage homePage;
	public static PaymentPage paymentPage;
	public static SignUpLoginPage signUpLOginPage;
    
	
}
