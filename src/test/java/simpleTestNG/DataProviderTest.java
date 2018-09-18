package simpleTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider = "getData")
	public void Printing(String firstName, String lastName, String password, int age){
		System.out.println(firstName+" "+lastName+" "+password+" "+age);
	}

	@DataProvider
	public Object[][] getData() {
		Object data[][]= new Object[2][4];
		data[0][0] = "mary";
		data[0][1] = "john";
		data[0][2] = "ra342ra";
		data[0][3] = 22;

		data[1][0] = "Matt";
		data[1][1] = "Scout";
		data[1][2] = "ms9009ms";
		data[1][3] = 25;

		return data;
	}
}



