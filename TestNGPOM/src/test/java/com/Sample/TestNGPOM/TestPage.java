package com.Sample.TestNGPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import org.testng.Assert;

public class TestPage {

	
	String driverPath = "C:\\Users\\LD\\Desktop\\JAVA_Codes\\geckodriver-v0.28.0-win64\\geckodriver.exe";
	
	WebDriver driver;
	
	FirstPage objFirstPage;
	
	HomePage objHomePage;
	
	TestPage objTestPage;
	
	@BeforeTest
	
	
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.ca/");
		
	}
	
	@Test
	
	public void test_HomePage() {
		
		objHomePage = new HomePage(driver);
		
		objHomePage.createAmazonAccount("This is a Test", "Abcd_#1234" , "abcd12345@gmail.com");
		
		
		
		objFirstPage = new FirstPage(driver);
		
		objFirstPage.searchSomeItem("iPhone11");
		
		
	}
	
	
		
		
		
		
		
		
		
	}
	
	
	
	
