package ParameterTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassing {
	@Parameters({"param1", "param2"})
    @Test
    public void t(String p1, String p2) {
        System.out.println("t( " + p1 + ", " + p2 + " )" );
    }    
	 /**
     * Following method takes one parameter as input. Value of the
     * said parameter is defined at test level.
     */
    @Parameters({ "test-two-param" })
    @Test
    public void prameterTestTwo(String param) {
        System.out.println("Test two param is: " + param);
    }}
