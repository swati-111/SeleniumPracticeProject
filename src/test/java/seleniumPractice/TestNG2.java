package seleniumPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I am in BeforeSuit annotation");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("I am in BeforeTest annotation");
		
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I am in AfterSuite annotation");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("I am in AfterTest annotation");
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I am in BeforeMethod annotation");
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I am in AfterMethod annotation");
	}
	@Test
	public void test3()
	{
		System.out.println("I am in Test3");
	}
	
	@Test
	public void test2()
	{
		System.out.println("I am in Test2");
	}
	
	@Test
	public void test1()
	{
		System.out.println("I am in Test1");
	}

}
