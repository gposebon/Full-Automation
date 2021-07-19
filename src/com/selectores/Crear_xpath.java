package com.selectores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crear_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(By.xpath("//input[@placeholder='Correo electrónico o número de teléfono']")).sendKeys("aaaaaaaa");
		driver.findElement(By.id("pass")).sendKeys("111111");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		

	}

}