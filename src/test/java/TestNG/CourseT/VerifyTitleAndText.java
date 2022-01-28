package TestNG.CourseT;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class VerifyTitleAndText {
	
	String title = "Artículos electrónicos, autos, ropa, objetos de colección, cupones y más | eBay";
	String expectedText = "Buscar1";
	
	@Test
	public void titleTest() {
		
		SoftAssert softassert = new SoftAssert();
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		//Assert.assertEquals("Title validation Failed", title, actualTitle);
		softassert.assertEquals(title, actualTitle, "Title validation Failed");
		String actualText = driver.findElement(By.id("gh-btn")).getAttribute("value");
		//Assert.assertEquals("Text validation failed",expectedText, actualText);
		softassert.assertEquals(actualText, expectedText, "Text validation failed");
		System.out.println("Closing browser");
		driver.close();
		softassert.assertAll();
	}
}
