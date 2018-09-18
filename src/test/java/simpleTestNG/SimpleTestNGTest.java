package simpleTestNG;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class SimpleTestNGTest {

	@Test
	public void testCaptureScreen() {
		System.out.println("Capturing test screen from Test 2");
		//throw new SkipException("Skipping Test from Test2...");
	}
	@Test(groups="One")
	public void test1(ITestContext testc) {
		System.out.println("Test 1 "+testc.getName());
	}

	@Test(groups="two")
	public void test2(ITestContext testc) {
		System.out.println("Test 2 "+testc.getName());
	}

	@Test(groups="One")
	public void test3(ITestContext testc) {
		System.out.println("Test 3 "+testc.getName());
	}

	@Test(groups="two")
	public void test4(ITestContext testc) {
		System.out.println("Test 4 "+testc.getName());
	}

}
