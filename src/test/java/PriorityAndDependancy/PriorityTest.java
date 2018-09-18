package PriorityAndDependancy;

import org.testng.annotations.Test;

public class PriorityTest {
	//by default priority is 0 if we want set higher priority 
	//than default(0) we can assign negative value to priority
	
	
	//Important: lesser the integer value higher the priority 
	@Test(priority=-2)
	public void TestOne(){
		System.out.println("Test one...(higher than Default)	priority=-2");
	}
	@Test(priority=-1)
	public void TestTwo(){
		System.out.println("Test Two...(higher than Default)	priority=-1");
	}
	@Test(priority=0)
	public void TestThree(){
		System.out.println("Test Three...(Default)			priority=0");
	}
	@Test(priority=1)
	public void Testfour(){
		System.out.println("Test four...(Less than Default)		priority=1");
	}

}
