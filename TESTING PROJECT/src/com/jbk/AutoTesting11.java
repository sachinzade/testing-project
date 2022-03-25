package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoTesting11 {
	@Test
	public void loginPageBlank() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String ActualMsg = driver.findElement(By.id("email_error")).getText();
		String ExpectMsg = "Blank not allowed";
		driver.close();
		Assert.assertEquals(ActualMsg, ExpectMsg);

	}

	@Test
	public void LoginSpcialChar() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("@#$%^&");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String ActualMsg = driver.findElement(By.id("email_error")).getText();
		String ExpectMsg = "Alphbets are only allowed";
		driver.close();
		Assert.assertEquals(ActualMsg, ExpectMsg);
	}

	@Test
	public void LoginCorrectCredi() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		String ExpectRslt = "Dashboard Courses Offered";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}

	@Test
	public void UserShowsOnline() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div/aside/section/div/div[2]/a")).getText();
		String ExpectRslt = "Online";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}

	@Test
	public void userList() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/h3"))
				.getText();
		String ExpectRslt = "User List";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}

	@Test
	public void connectWithEmail() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[2]"))
				.click();
		String ActualRslt = driver
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[5]"))
				.getText();
		String ExpectRslt = "Email id";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}

	@Test
	public void checkSchedule() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[5]/a/span")).click();
		String ActualRslt = driver
				.findElement(
						By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]/a/span"))
				.getText();
		String ExpectRslt = "Schedule";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}

	@Test
	public void openjdksite() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).click();
		String ActualRslt = driver
				.findElement(
						By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span"))
				.getText();
		String ExpectRslt = "Official Website";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}

	@Test
	public void CheckSeleniumInfo() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div")).getText();
		String ExpectRslt = "Selenium\nAutomation Testing\nMore info";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}

	@Test
	public void chechLogoutButton() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a")).getText();
		String ExpectRslt = "LOGOUT";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}

}
