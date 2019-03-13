package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.loginPage;
import Pages.loginPageusingPagefactory;

public class LoginTestDemoUsingPagefactory {
	WebDriver driver;
	  @Test
	  public void f() {		  
		  loginPageusingPagefactory login = PageFactory.initElements(driver, loginPageusingPagefactory.class);
		  login.form("tutorial","tutorial");
		  login.clickContinue();		  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {		  
			System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2D.02.12\\Desktop\\Priya\\chromedriver.exe");
			driver = new ChromeDriver();
			 driver.get("http://www.newtours.demoaut.com/");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

}
