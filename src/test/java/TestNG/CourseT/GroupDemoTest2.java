package TestNG.CourseT;

import org.testng.annotations.Test;

import common.CommonDataSetup;

public class GroupDemoTest2 extends CommonDataSetup {
	
	
	
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
