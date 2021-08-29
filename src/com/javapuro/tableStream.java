package com.javapuro;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class tableStream {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//Captura all webelements on the list
		List<WebElement> listaUno = driver.findElements(By.xpath("//tr/td[1]"));
		//Capture text into to the list
		List<String> listaOriginal = listaUno.stream().map(l -> l.getText()).collect(Collectors.toList());
		// Sorted text captured
		List<String> listaSorted = listaOriginal.stream().sorted().collect(Collectors.toList());
		// compare first list whit sorted list
		Assert.assertTrue(listaOriginal.equals(listaSorted));
		
		

	}

}
