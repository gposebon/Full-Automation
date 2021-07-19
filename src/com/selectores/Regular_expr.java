package com.selectores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regular_expr {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'login')]")).sendKeys("aaaaaaa");
		driver.findElement(By.xpath("//input[contains(@id, 'pass')]")).sendKeys("1111111");
		driver.findElement(By.cssSelector("input[value*='Sign in']")).click();
		
		

	}

}
