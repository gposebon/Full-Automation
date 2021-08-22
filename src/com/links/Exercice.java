package com.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption1")).click();
		
		String option = "";

		if (driver.findElement(By.id("checkBoxOption1")).isSelected()) {
			option = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
			System.out.println(option);
		} else if (driver.findElement(By.id("checkBoxOption2")).isSelected()) {
			option = driver.findElement(By.xpath("//label[@for='benz']")).getText();
			System.out.println(option);
		} else {
			option = driver.findElement(By.xpath("//label[@for='honda']")).getText();
			System.out.println(option);
		}
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select selectOption = new Select(dropdown);
		
		selectOption.selectByVisibleText(option);
		
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		
		
	}

}
