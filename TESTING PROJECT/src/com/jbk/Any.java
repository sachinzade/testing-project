package com.jbk;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Any {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).click();
		driver.findElement(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[8]/a/span")).click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());

		String ActualRslt = "2";
		String ExpectRslt = "2";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}
}