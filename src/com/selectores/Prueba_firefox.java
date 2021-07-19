package com.selectores;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prueba_firefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");

	}

}
