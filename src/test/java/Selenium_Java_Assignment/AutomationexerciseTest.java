package Selenium_Java_Assignment;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import reusableMethods.CommonMethodsAndWebElement;
import reusableMethods.PropertiesOperation;
import testBase.TestBase;


public class AutomationexerciseTest extends TestBase{

	@Test
	public static void automationTest() throws Exception {

		//		launchBrowserAndNavigate();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,PropertiesOperation.getPropertyValueByKey("homePageTitle"), "Home page title is incorrect.");
		CommonMethodsAndWebElement.wait(driver, TestBase.homePage.txt_CartLink, 10);
        WebElement element = TestBase.homePage.txt_CartLink;
        CommonMethodsAndWebElement.scroll(element);
		element.click();
		
		//click on cart
		CommonMethodsAndWebElement.clickOn(driver, TestBase.homePage.txt1_ViewCartLink, 10);	
		
	   //assert title of card
		String carttitle = driver.getTitle();
		Assert.assertEquals(carttitle,PropertiesOperation.getPropertyValueByKey("cartPageTitle"), "Home page title is incorrect.");
		//click on checkout page and sign up
		CommonMethodsAndWebElement.clickOn(driver, TestBase.cartPage.txt1_ProceedToCheckoutLinkTxt, 10);
		CommonMethodsAndWebElement.clickOn(driver, TestBase.cartPage.txt1_RegisterLoginLink, 10);
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.signUpLOginPage.input_nameField, 10, PropertiesOperation.getPropertyValueByKey("name"));
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.signUpLOginPage.input_signupEmailField, 10, (int)(Math.random()*100)+""+PropertiesOperation.getPropertyValueByKey("email"));
		CommonMethodsAndWebElement.clickOn(driver, TestBase.signUpLOginPage.radio_gender, 10);
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.signUpLOginPage.input_PasswordField, 10, PropertiesOperation.getPropertyValueByKey("password"));
		CommonMethodsAndWebElement.clickOn(driver, TestBase.signUpLOginPage.select_days_DOB, 10);
		CommonMethodsAndWebElement.clickOn(driver, TestBase.signUpLOginPage.select_Months_DOB, 10);
		CommonMethodsAndWebElement.clickOn(driver, TestBase.signUpLOginPage.select_Year_DOB, 10);
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.signUpLOginPage.input_FirstName, 10, PropertiesOperation.getPropertyValueByKey("first_name"));
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.signUpLOginPage.input_LastName, 10, PropertiesOperation.getPropertyValueByKey("last_name"));
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.signUpLOginPage.input_Address, 10, PropertiesOperation.getPropertyValueByKey("address"));
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.signUpLOginPage.input_State, 10, PropertiesOperation.getPropertyValueByKey("state"));
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.signUpLOginPage.input_City, 10, PropertiesOperation.getPropertyValueByKey("city"));
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.signUpLOginPage.input_Zipcode, 10, PropertiesOperation.getPropertyValueByKey("zipcode"));
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.signUpLOginPage.input_MobileNumber, 10, PropertiesOperation.getPropertyValueByKey("mobile_number"));
		CommonMethodsAndWebElement.clickOn(driver, TestBase.signUpLOginPage.btn_sumbit, 10);
		//assert that account is created or not
		String accountTitle = driver.getTitle();
		Assert.assertEquals(accountTitle,PropertiesOperation.getPropertyValueByKey("account_created_Titile"), "Account not created yet.");	

		//click to continue button
		CommonMethodsAndWebElement.clickOn(driver, TestBase.methods.txt_Continue, 10);

		//assert that name is visible on homepage or not
		String nOH =CommonMethodsAndWebElement.wait(driver, TestBase.homePage.txt1_UsernameOnHomePage, 10).getText(); 
		Assert.assertEquals(nOH, "Logged in as Deepak");
		
		//click on cart and proceed to checkout
		CommonMethodsAndWebElement.clickOn(driver, TestBase.homePage.link_Cart, 10);
		CommonMethodsAndWebElement.clickOn(driver, TestBase.cartPage.txt1_ProceedToCheckoutLinkTxt, 10);
		
	    //scroll till the place order
		CommonMethodsAndWebElement.wait(driver, TestBase.cartPage.link_PlaceOrder, 10);
        WebElement element12 = TestBase.cartPage.link_PlaceOrder;
        CommonMethodsAndWebElement.scroll(element12);
		element12.click();
		
		//fill account details
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.paymentPage.input_NameOnCard, 10, PropertiesOperation.getPropertyValueByKey("name"));
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.paymentPage.input_CardNumber, 10, PropertiesOperation.getPropertyValueByKey("cardNumber"));
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.paymentPage.input_CVCNumber, 10, "131");
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.paymentPage.input_ExpiryMonth, 10, "06");
		CommonMethodsAndWebElement.sendkeys(driver, TestBase.paymentPage.input_ExpiryYear, 10,"2000");

		
		//assert that order is placed or not
		String orderConfimationTitle = CommonMethodsAndWebElement.wait(driver, TestBase.paymentPage.txt_OrderConfrim, 10).getText();
		Assert.assertEquals(PropertiesOperation.getPropertyValueByKey("order_confirmation_title"), orderConfimationTitle);
		
		//for testing purpose 
		CommonMethodsAndWebElement.clickOn(driver, TestBase.methods.txt_Continue, 10);
		//delete account and verify that account is deleted or not
		CommonMethodsAndWebElement.clickOn(driver, TestBase.homePage.link_DeleteAccount, 10);
		Assert.assertEquals(PropertiesOperation.getPropertyValueByKey("deletion_title"), CommonMethodsAndWebElement.deletePage.txt1_DeleteAccount.getText());
		
	//click on continue button
		CommonMethodsAndWebElement.clickOn(driver, TestBase.methods.txt_Continue, 10);
		
	}

	
	
}
