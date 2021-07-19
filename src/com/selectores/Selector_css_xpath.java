package com.selectores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selector_css_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=mx");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("aaaaaaa");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("111111");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());

	}

}
