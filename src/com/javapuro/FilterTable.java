package com.javapuro;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement> vegetales = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> vegetalesFiltrados = vegetales.stream().filter(vegetal -> vegetal.getText()
				.contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(vegetales.size(), vegetalesFiltrados.size());
	}

}
