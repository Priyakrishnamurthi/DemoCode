//package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GoogleDemo {
    public static void main(String[] args) {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2D.02.12\\Desktop\\Priya\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
      // String baseUrl = "www.google.com";
        driver.get("https://www.allstate.com/");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String sText = js.executeScript("return document.title;").toString();
        System.out.println(sText);
        
        WebElement contactIcon =driver.findElement(By.linkText("Contact Us"));
        JavascriptExecutor exe = (JavascriptExecutor)driver;
        exe.executeScript("arguments[0].click();",contactIcon);
        
        JavascriptExecutor exe1 = (JavascriptExecutor)driver; 
        //js.executeScript("alert('Welcome to Guru99');");  
       exe1.executeScript("alert('hello world');",driver.findElement(By.xpath(".//*[@id='s_Text']"))); 
    }
    
    }