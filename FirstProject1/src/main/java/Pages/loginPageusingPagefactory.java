package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class loginPageusingPagefactory {
	
	WebDriver driver;
	public loginPageusingPagefactory(WebDriver driver)
	{
		this.driver=driver;		
	}
	@FindBy(how=How.NAME,using="userName")
	WebElement userName;
	
	@FindBy(how=How.NAME,using="password")
	WebElement Password;
	
	@FindBy(how=How.NAME,using="login")
	WebElement continueButton;
	
	public void form(String name,String pwd)
	{
		userName.sendKeys(name);
		Password.sendKeys(pwd);
	}
	public void clickContinue()
	{
		continueButton.click();
	}
}