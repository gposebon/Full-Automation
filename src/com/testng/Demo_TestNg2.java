package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_TestNg2 {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Antes de los metodos en testng2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Despues de los metodos en testng2");
	}
	
	@Test(groups={"smoke"})
	public void test3() {
		System.out.println("Good !!!!");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("El test empieza");
	}
}
