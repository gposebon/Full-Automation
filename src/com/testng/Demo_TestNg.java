package com.testng;

import org.testng.annotations.*;

public class Demo_TestNg {

	@BeforeSuite
	public void afterSuite() {
		System.out.println("Antes de la suite");
	}
	
	@Test
	public void test1() {
		System.out.println("Hellooo !!!!!");
	}
	
	@Test
	public void test2() {
		System.out.println("Byeeee !!!!");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("El test termina");
	}

	@AfterSuite
	public void beforeSuite() {
		System.out.println("Despues de la suite");
	}
}
