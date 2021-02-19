package test2;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest {

	
//	WebDriver driver = new FirefoxDriver();

	@BeforeTest
	
	public void SetProp() {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\LD\\Desktop\\JAVA_Codes\\geckodriver-v0.28.0-win64\\geckodriver.exe" );
		
		System.out.println("This is before Test");
		
		
	}
	@Test
	
	public void Test2() {
		
	
	
	 /*driver.navigate().to("https://www.themobileshop.ca/en/");
	 
	 driver.findElement(By.xpath("//*nav/ul/li/a[@class='styles__NavLink-sc-1xmzr9n-10 hEOscP'")).click();
	
	 
	 driver.close();*/
		
		System.out.println("This is Test");
	 
	}

	


	
	
}
