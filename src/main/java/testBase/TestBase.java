package testBase;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AccountPage;
import pageObjects.CratPage;
import pageObjects.DeletePage;
import pageObjects.HomePage;
import pageObjects.PaymentPage;
import pageObjects.SignUpLoginPage;
import reusableMethods.CommonMethodsAndWebElement;
import reusableMethods.PropertiesOperation;

public class TestBase extends ObjectRepo{
	
	
	public static void launchBrowserAndNavigate() throws Exception {
		
		String browser = PropertiesOperation.getPropertyValueByKey("browser");
		String url = PropertiesOperation.getPropertyValueByKey("url");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver  = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} 
		else {
			System.out.println("Please choose browser");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		driver.manage().window().maximize();
		
		driver.get(url);
	
	}
	

@BeforeMethod // it will execute before each test method whitin current class
//@Parameters("browser")
public void setupMethod() throws Exception {
	launchBrowserAndNavigate();
	methods = new CommonMethodsAndWebElement();
	accountPage = new AccountPage();
	cartPage = new CratPage();
	deletePage = new DeletePage();
	homePage = new HomePage();
	paymentPage = new PaymentPage();
	signUpLOginPage = new SignUpLoginPage();
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
