package com.GitMaven.GitTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SomeTests {
	
	@BeforeSuite
	public void Setup()
	{
		System.out.println("I'm the first");
	}
	@Test(priority= 1,groups= {"Sanity"})
	public void Test1()
	{
		System.out.println("This is Test1 of SomeTests in Package : NewPack");
	}
	
	@Test(priority= 2)
	public void Test2()
	{
		System.out.println("This is Test2 of SomeTests in Package : NewPack");
	}
	
	@AfterSuite
	public void TearDown()
	{
		System.out.println("This is Last test of Suite");
	}
	

}
