package com.handle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
			.click()
			.keyDown(Keys.SHIFT)
			.sendKeys("Hola")
			.doubleClick()
			.build()
			.perform();
		
		WebElement account = driver.findElement(By.cssSelector("a[id=nav-link-accountList]"));
		
		a.moveToElement(account)
		.contextClick()
		.build()
		.perform();

	}

}
