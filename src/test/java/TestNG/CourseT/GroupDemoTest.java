package TestNG.CourseT;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "userRegistration")
public class GroupDemoTest {
	
	@BeforeGroups(value = "regression")
	public void testBeforeGroups() {
		System.out.println("Before group execution");
	}
	
	@AfterGroups(value = "bvt")
	public void testAfterGroups() {
		System.out.println("After group execution");
	}
	
	@BeforeClass
	public void testBeforeClass() {
		System.out.println("Before class execution");
	}
	
	@AfterClass
	public void testAfterClass() {
		System.out.println("After class execution");
	}
	
	@Test(priority=1, groups = "regression")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=2, groups = "regression")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups = {"regression", "bvt"})
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(groups = {"bvt"})
	public void test4() {
		System.out.println("test4");
	}
	

}
