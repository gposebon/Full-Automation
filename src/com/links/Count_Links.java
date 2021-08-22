package com.links;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement driverFooter = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(driverFooter.findElements(By.tagName("a")).size());
		
		WebElement driverFooterColum = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
		
		System.out.println(driverFooterColum.findElements(By.tagName("a")).size());
		
		for(int i = 1; i < driverFooterColum.findElements(By.tagName("a")).size(); i++) 
		{
			String clicks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			driverFooterColum.findElements(By.tagName("a")).get(i).sendKeys(clicks);
		}
	}

}
