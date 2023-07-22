package practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice1 {

	
	@Test
	public void mobile(String op)
	{
		System.out.println("Practice1 method1");
		System.out.println(op);
	}
	
	@Test(dependsOnMethods = {"mobile"})
	public void api()
	{
		System.out.println("Practice1 method2");
	}
	
	@Test(dependsOnMethods = {"api"})
	public void web()
	{
		System.out.println("Practice1 method3");
	}
	@AfterTest(enabled=false)
	public void after()
	{
		System.out.println("Practice1 aftertest statement");
	}
}
