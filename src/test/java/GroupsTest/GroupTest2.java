package GroupsTest;

import org.testng.annotations.Test;

public class GroupTest2 {
	
	@Test(groups="low")
	public void TestTwo(){
		System.out.println("Test low TestTwo GroupTest2...");
	}
	@Test(groups="mid")
	public void TestThree(){
		System.out.println("Test mid TestThree GroupTest2...");
	}
	
}
