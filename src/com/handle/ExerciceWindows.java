package com.handle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciceWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.cssSelector(".example a")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> window = windows.iterator();
		String firstWindow = window.next();
		String secondWindow = window.next();
		
		driver.switchTo().window(secondWindow);
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		
		driver.switchTo().window(firstWindow);
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());

	}

}
