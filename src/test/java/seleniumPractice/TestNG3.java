package seleniumPractice;

import org.testng.annotations.Test;

public class TestNG3 {
	
	@Test (priority = 1)
	public void test3()
	{
		System.out.println("I am in Test3");
	}
	
	@Test (enabled = false)
	public void test2()
	{
		System.out.println("I am in Test2");
	}
	
	@Test (priority = 2)
	public void test1()
	{
		System.out.println("I am in Test1");
	}
	
	

}
