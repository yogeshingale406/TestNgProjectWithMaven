package PriorityAndDependancy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyAndPriorityTest {
	
	//Dependency is more important than priority in TestNg
	//Hard dependency --> dependsOnMethods, dependsOnGroup
	//Soft dependency --> alwaysRun=true/false
	@Test(priority=1)
	public void TestLogin(){
		System.out.println("Test one...");
		//Assert.fail();		 
	}
	@Test(priority=-2, dependsOnMethods="TestLogin")
	public void TestRegistration(){
		System.out.println("Test Two...");
	}
	@Test(priority=-3)
	public void TestThree(){
		System.out.println("Test Three...");
	}
	@Test(priority=4)
	public void Testfour(){
		System.out.println("Test four...");
	}
}
