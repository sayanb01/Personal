package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice3 {

	
	@DataProvider(name = "getdata")
	public String[] provide()
	{
		String data[] = new String[3];
		data[0] = "Seleneium";
		data[1] = "is";
		data[2] = "fucked";
		return data;
	}
	
	@DataProvider(name = "mixed")
	public Object[][] dpmethod()
	{
		Object [][] i = new Object[3][2];
		i[0][0] = 1;
		i[0][1] = "one";
		i[1][0] = 2;
		i[1][1] = "two";
		i[2][0] = 3;
		i[2][1] = "three";
		return i;
		
		
		
	}
	
	@Test(dataProvider = "getdata" , groups = {"only"})
	public void method(String str)
	{
		System.out.println(str);
	}
	
	@Test(dataProvider = "mixed" , groups = {"lonely"})
	public void method2(int a, String b)
	{
		System.out.println("number is:"+a+" ; String is :"+b);
	}
}
