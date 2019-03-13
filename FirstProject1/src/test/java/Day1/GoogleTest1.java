package Day1;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class GoogleTest1 {
	private static final String ExpectedResult = "Home";
	WebDriver driver;
/*	@Test
	public void f() {
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).submit();
		String actualTitle = driver.getTitle();
		String expectedTitle = "selenium - Google Search";
      
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
	}*/
	@BeforeTest
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2D.02.12\\Desktop\\Priya\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
		driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@AfterTest
	public void afterMethod() {
		driver.close();
	}
	@Test(priority=1)
	public void signIn()
	{
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.linkText("userName")).sendKeys("lalitha");
		driver.findElement(By.linkText("password")).sendKeys("Password123");
		driver.findElement(By.linkText("Login")).click();
		AssertJUnit.assertEquals(ExpectedResult, driver.getTitle());
	}
	@Test(priority=2)
	public void CartValidation()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement menu1 = driver.findElement(By.linkText("All Categories"));
		Actions act = new Actions(driver);
		act.moveToElement(menu1).click().build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"))).click().build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"))).click().build().perform();
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add to cart")));
		act.moveToElement(addToCart).click().build().perform();
		
		driver.findElement(By.partialLinkText("Cart")).click();
		
		WebElement quantity =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b")));
		String value = quantity.getAttribute("value");
		Assert.assertEquals(value,1);
		
		
		
		
		
	}
}
