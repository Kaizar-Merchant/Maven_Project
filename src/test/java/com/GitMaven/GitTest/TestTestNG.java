package com.GitMaven.GitTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTestNG {
	@BeforeMethod
	public void Setup()
	{
		System.out.println("Tihs is before Method");
	}
	@Test(description = "Test1")
	public void Test1()
	{
		System.out.println("This is Test1");
	}
	
	@Test(description = "Test2")
	public void Test2()
	{
		System.out.println("This is Test1");
		Assert.assertEquals("Kaizar", "Kaizar");
	}
	
	
	@Test(description = "Test3",groups= {"Regression"})
	public void Test3()
	{
		System.out.println("Test3 from TestNGTest : ");
		Assert.assertEquals("Kaizar", "Kaizar");
	}
	@Test(description = "YahooTest")
	public void Yahoo()
	{
		System.out.println("YahooTest");
	}

}
