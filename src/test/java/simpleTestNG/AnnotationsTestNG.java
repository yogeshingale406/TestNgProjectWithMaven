package simpleTestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsTestNG{
  @Test
  public void TestNgTest1() {
	  
	  System.out.println("TEST 1: Testing Done...");
  }
  @Test
  public void TestNgTest2() {
	  
	  System.out.println("TEST 2: Testing Done...");
  }
  
  @Test(groups="feature1")
  public void unitTest2A() {
      System.out.println("TestA: unitTest2A, feature1 test");
  }    
  
  @Test(groups="feature2")
  public void unitTest4A() {
      System.out.println("TestA: unitTest4A, feature2 test");
  }    
  
  @BeforeGroups
  public void bGroup(){
	  System.out.println("BEFORE GROUP: execution of any method/test of same class");
  }
  @AfterGroups
  public void aGroup(){
	  System.out.println("After GROUP: execution of any method/test of same class");
  }
  @BeforeClass
  public void bClass(){
	  System.out.println("BEFORE CLASS: execution of any method/test of same class");
  }
  
  @AfterClass
  public void aClass(){
	  System.out.println("AFTER CLASS: execution of all method/test of same class");
  }
  @BeforeMethod
  public void browserOpened() {
	  System.out.println("BEFORE METHOD: Opening browser...(Before the execution of each test method.)");
  }

  @AfterMethod
  public void browserClosed() {
	  System.out.println("AFTER METHOD: Closing browser...(After 	the execution of each test method.)");
  }

 

  @BeforeTest
  public void OpenDBConnection(ITestContext textContext) {
	  System.out.println("BEFORE TEST: Creating db connection...("+textContext.getName()+")(Before each test section declared inside a TestNG suite.)");
  }

  @AfterTest
  public void closeDBConnection() {
	  System.out.println("AFTER TEST: Closing db connection...(After each test section declared inside a TestNG suite.)");

  }

  @BeforeSuite
  public void runSeleniumServer() {
	  System.out.println("BEFORE SUITE: Starting selenium...(Before any tests declared inside a TestNG suite.)");

  }

  @AfterSuite
  public void closeSeleniumServer() {
	  System.out.println("AFTER SUITE: Starting selenium...(After any tests declared inside a TestNG suite.)");

  }

}
