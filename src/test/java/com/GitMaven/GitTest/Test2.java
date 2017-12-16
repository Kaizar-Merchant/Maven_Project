package com.GitMaven.GitTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {

	@BeforeClass()
	public void Setup()
	{
		System.out.println("This is befire class : Test2");
	}
	@Test(priority =1, groups= {"Sanity","Smoke"})
	public void Test1()
	{
		System.out.println("This is Test1 : Test2");
	}
	
	@Test(priority =2,groups={"Sanity"})
	public void Test12()
	{
		System.out.println("This is Test2 of  Test12 class ");
	}
	
	@AfterClass
	public void TearDown()
	{
		System.out.println("This is TearDown of  Test2 class ");
	}
	
}