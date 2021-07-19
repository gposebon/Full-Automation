package com.selectores;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Full_css_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		/* ---> XPATH <-----
		 * 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aaaaaa");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("111111");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		*/
		
		// ----> CSS <-----
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("aewdrthg");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("111111");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
