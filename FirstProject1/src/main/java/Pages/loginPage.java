package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginPage {
	
	WebDriver driver;
	By firstname = By.name("userName");
	By lastname = By.name("password");
	By continueButton = By.name("login");
	

	public loginPage(WebDriver driver)
	{
		this.driver=driver;		
	}
	public void typeFirstName(String name)
	{
		driver.findElement(firstname).sendKeys(name);		
	}
	public void typePassword(String name)
	{
		driver.findElement(lastname).sendKeys(name);		
	}

	public void clickContinue()
	{
		driver.findElement(continueButton).click();
	}
	
}