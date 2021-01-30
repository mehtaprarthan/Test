package com.Sample.TestNGPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class FirstPage {

	
	WebDriver driver;

	By searchItem = By.xpath("//div/div/input[@id='twotabsearchtextbox\']");
	
	By searchButton = By.xpath("//div/div/span/input[@id='nav-search-submit-button\']");
	
	public FirstPage(WebDriver driver) {
		
	this.driver=driver;
		
	}
	
	public void itemSearch(String strSearchItem) {
		
		driver.findElement(searchItem).sendKeys(strSearchItem);
		
		
	}
	
	public void clickSearch() {
		
		driver.findElement(searchButton).click();
		
	}
	
	public void searchSomeItem(String strSearchItem) {
		
		this.itemSearch(strSearchItem);
		this.clickSearch();
		
	}
	
	
}



