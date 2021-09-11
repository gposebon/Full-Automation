package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo_TestNg3 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Me ejecutare antes de todos los metodos de testng3");
	}
	
	@Test
	public void testCelular1() {
		System.out.println("Test Web de tito");
	}
	
	@Test
	public void testCelular2() {
		System.out.println("Test Celular de tito");
	}
	
	@Test(groups={"smoke"})
	public void testCelular3() {
		System.out.println("Test API de tito");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Me ejecutare antes de todos los metodos de testng3");
	}
}
