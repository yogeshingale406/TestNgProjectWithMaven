package GroupsTest;

import org.testng.annotations.Test;

public class GroupTest1 {
	@Test(groups="high")
	public void TestOne(){
		System.out.println("Test high TestOne GroupTest1...");
	}
	@Test(groups="low")
	public void TestTwo(){
		System.out.println("Test low TestTwo GroupTest1...");
	}
	@Test(groups="mid")
	public void TestThree(){
		System.out.println("Test mid TestThree GroupTest1...");
	}
	@Test(groups="high")
	public void Testfour(){
		System.out.println("Test high Testfour GroupTest1...");
	}
}
