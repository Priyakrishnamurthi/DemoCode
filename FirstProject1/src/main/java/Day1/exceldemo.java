package Day1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class exceldemo {
    public static void main(String[] args) throws IOException {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2D.02.12\\Desktop\\Priya\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        //String baseUrl = "www.google.com";
      driver.get("https://www.google.com/");
     File src = new File("C://priya.xlsx");
     
     FileInputStream fis = new FileInputStream(src);
     XSSFWorkbook wb = new XSSFWorkbook(fis);
     XSSFSheet sheet1=wb.getSheetAt(0);
     
     for(int i=0;i<3;i++)
     {
    	 String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
    	 System.out.println("data from excel is :"+data0);
    	 
    	 String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
    	 System.out.println("data from excel is :"+data1);
    	 
    	 
     }
     
     
    }
    }