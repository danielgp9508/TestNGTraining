package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {
	
	@BeforeSuite
	public void dataSetup() {
		System.out.println("common dataSetup");
	}
	
	@AfterSuite
	public void dataTearDown() {
		System.out.println("Data tearDown");
	}
}
