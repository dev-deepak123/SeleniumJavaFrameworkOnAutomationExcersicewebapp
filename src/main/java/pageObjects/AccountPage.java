package pageObjects;

import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class AccountPage extends TestBase{
	
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}

	

}
