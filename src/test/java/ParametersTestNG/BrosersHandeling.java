package ParametersTestNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

@Test
public class BrosersHandeling {
	@Test
	@Parameters({"browserName","Nametext","Nametext1"})

	public void LunchBroser(String browserNames,String name,String Names) throws InterruptedException{
		WebDriver driver;
		if(browserNames.equals("Chrome")) {
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(name);
		Thread.sleep(1000);
		driver.quit();
	}
	else if(browserNames.equals("Edge")){
		driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(Names);
		Thread.sleep(1000);
	}
}}