package practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice2 {

	@Test(groups= {"nothing"})
	public void method1()
	{
		System.out.println("Practice2 method1");
	}
	@Test(groups= {"nothing"})
	public void method2()
	{
		System.out.println("Practice2 method2");
	}
	@Test
	public void method3()
	{
		System.out.println("Practice2 method3");
	}
	@Test(groups= {"nothing"})
	public void method4()
	{
		System.out.println("Practice2 method4");
	}
	@BeforeMethod(enabled=false)
	public void before()
	{
		System.out.println("This is a Before method statement");
	}
	
	@BeforeClass(enabled=false)
	public void classy()
	{
		System.out.println("This is a before class statement for Practice2");
	}
}
