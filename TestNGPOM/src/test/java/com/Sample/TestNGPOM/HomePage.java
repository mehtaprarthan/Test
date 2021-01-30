package com.Sample.TestNGPOM;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;



public class HomePage {

	
	WebDriver driver;
	
	By userName = By.name("customerName");
	
	By password = By.name("password");
	
	By email = By.name("email");
	
	By rePassword = By.name("passwordCheck");
	
	By creatAccount = By.xpath("//span/span/input[@id='continue']");
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void setUserName(String strUserName) {
		
		driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']")).click();
		
		driver.findElement(By.xpath("//span/span/a[@id='createAccountSubmit']")).click();
				
		
		driver.findElement(userName).sendKeys(strUserName);
		
		
	}
	
	public void setPassword(String strPassword) {
		
		driver.findElement(password).sendKeys(strPassword);
		
		driver.findElement(rePassword).sendKeys(strPassword);
		
	}
	
	public void setEmail(String strEmail) {
		
		driver.findElement(email).sendKeys(strEmail);
	}
	
	public void createAcc() {
		
		driver.findElement(creatAccount).click();
		
	}

	
	public void createAmazonAccount (String strUserName, String strPassword, String strEmail ) {
		
		this.setUserName(strUserName);
		
		this.setPassword(strPassword);
		this.setEmail(strEmail);
		
		this.createAcc();
		
		
		
		
		
	}
	
	
	
	
	

}
