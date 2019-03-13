package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FirstProject {
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2D.02.12\\Desktop\\Priya\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        //String baseUrl = "www.google.com";
       // driver.get("https://www.google.com/");
		
        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).submit();
		String actualTitle = driver.getTitle();
		String expectedTitle = "selenium - Google Search";
      
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
		
		driver.get("https://www.allstate.com");
		WebElement search = driver.findElement(By.linkText("Contact Us"));
		WebElement claimcon = driver.findElement(By.linkText("Claims"));
		Actions builder = new Actions(driver);
		builder.clickAndHold(search).release(search);
		builder.build().perform();
		
		//driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
		//WebElement resize = driver.findElement(By.xpath(".//*[@id='resiable))
		
		
		

    }
}