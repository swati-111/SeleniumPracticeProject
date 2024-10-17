package seleniumPractice;

import org.testng.annotations.Test;

public class TestNG4 {
	
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
	
	@Test (dependsOnMethods = "test2" )
	public void test1()
	{
		System.out.println("I am in Test1");
	}

}
