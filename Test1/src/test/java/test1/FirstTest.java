package test1;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import org.apache.log4j.*;


public class FirstTest {
	
	@Test
	
	public void Test1() throws IOException {
		
	
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LD\\Desktop\\JAVA_Codes\\geckodriver-v0.28.0-win64\\geckodriver.exe" );	
		
		WebDriver driver = new FirefoxDriver();	
		
		
		//	System.out.println("This is before Test");
			
		
		//System.out.println("This is Test");
				       
		  //   System.out.println("launching firefox browser"); 
		      driver.get("https://www.prairiemobile.com/");
		      
		      try {
		      driver.findElement(By.xpath("//*li/a/span[@class='fa fa-search'")).click();
		      driver.findElement(By.xpath("//*div/div/input[@id='site-search'")).sendKeys("Hows your day?");
		      
		      driver.findElement(By.xpath("//*span/button[@id='site-search-btn'")).click();
		      
		      driver.findElement(By.xpath("//*li/a[@class='nav-link'")).click();
		      
		      //String Expected = "Solution";
		      
		      //String Actual = driver.getTitle();
		      
		      Assert.assertEquals("Solution", driver.getTitle());
		      
		      
		      
		      }
		      
		      catch (Exception e){
		    	  
		    	  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				    FileUtils.copyFile(screenshotFile, new File("C:\\Users\\LD\\Desktop\\JAVA_Codes\\SoftwareTestingMaterial.png"));  
		      }
		      
		      finally {
		    	  
		    	  driver.close();  
		    	  
		      }
		      
		      
		      
		  }	
	}

	

