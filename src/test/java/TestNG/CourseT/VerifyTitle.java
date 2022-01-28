package TestNG.CourseT;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {
	
	String title = "Artículos electrónicos, autos, ropa, objetos de colección, cupones y más | eBay";
	
	@Test
	public void titleTest() {
		
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		assertEquals(actualTitle, title);
		driver.close();
	}
}
