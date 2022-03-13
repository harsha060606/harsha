package com.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compossmail {

	public static void main(String[] args) throws Exception{
		RemoteWebDriver driver;
		WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://www.gmail.co.in");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("testn2022");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@jsname='LgbsSe']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Testing@22");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@jsname='LgbsSe'])[1]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@jscontroller='eIu7Db']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("to")).sendKeys("sriharshnannuta@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("subjectbox")).sendKeys("Atomation progarm mail");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("hi\nThis is a automated program mail\nbye");
		Thread.sleep(5000);
		driver.findElement(By.name("Filedata")).sendKeys("D:\\Batch 258\\Screenshot_ (246).png");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Send ‪(Ctrl-Enter)‬']")).click();
		

	}

}
