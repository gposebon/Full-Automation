package com.elementos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sugerencias_Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		
		List<WebElement> opciones = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement opcion :opciones) 
		{
			if(opcion.getText().equalsIgnoreCase("India")) {
				opcion.click();
				break;
			}
		}
		
		

	}

}
