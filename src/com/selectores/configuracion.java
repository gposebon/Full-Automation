package com.selectores;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class configuracion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
