package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.loginPage;

public class LoginTestDemo {
	WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
	  
	  File src = new File("C://priya//ExcelDemo.xlsx");
	     
	     FileInputStream fis = new FileInputStream(src);
	     XSSFWorkbook wb = new XSSFWorkbook(fis);
	     XSSFSheet sheet1=wb.getSheetAt(0);
	     
	     for(int i=0;i<3;i++)
	     {
	    	 String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
	    	 System.out.println("data from excel is :"+data0);
	    	 
	    	 String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
	    	 System.out.println("data from excel is :"+data1);
	    	 
	   	  loginPage login = new loginPage(driver);
		  login.typeFirstName(data0);
		  login.typePassword(data1);
		  login.clickContinue();  
		  Thread.sleep(2000);
		  driver.navigate().back();			
		  Thread.sleep(2000);	    	 
	     } 	  
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
