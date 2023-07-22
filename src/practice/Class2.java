package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2 {
	

	@Test
	public void print()
	{
		System.out.println("Class2 method1");
	}
	
	@Test
	public void print2()
	{
		System.out.println("Class2 method2");
		
	}
	@Test
	public void provider()
	{
		System.out.println("Data Provider parameter:");
	}
}
