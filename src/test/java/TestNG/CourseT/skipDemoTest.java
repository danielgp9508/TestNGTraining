package TestNG.CourseT;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipDemoTest {
	
	@Test(enabled = false)
	public void skipTest1() {
		System.out.println("Skipping this test as it is not completed");
	}
	
	@Test
	public void skipTest2() {
		System.out.println("this test is completed");
		throw new SkipException("using throws skipping method");
	}
	
	@Test
	public void skipTest3() {
		boolean setup = false;
		if(setup) {
			System.out.println("Executing Test");
		}else {
			throw new SkipException("Skipping test based on condition");
		}
	}
}
