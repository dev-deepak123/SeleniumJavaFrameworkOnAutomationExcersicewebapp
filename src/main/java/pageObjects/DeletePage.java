package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class DeletePage extends TestBase{
	@FindBy(xpath="//p[text()='Your account has been permanently deleted!']")
	public WebElement  txt1_DeleteAccount;
	
	public DeletePage() {
		PageFactory.initElements(driver, this);
	}

}
