package TestNG.CourseT;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	@BeforeTest
	public void beforeLogin() {
		System.out.println("start login");
	}
	
	@AfterTest
	public void afterLogout() {
		System.out.println("start logout");
	}
	
	@Test(priority=1, description = "metodo login", groups = "regression")
	public void loginTest() {
		System.out.println("login sucess");
	}
	
	@Test(priority=2, description = "metodo logout")
	public void logOutTest() {
		System.out.println("Logout Success");
	}
}
