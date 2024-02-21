package OrangeHrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class lanchApp {
	WebDriver driver = new ChromeDriver();
	@Test
	public void hrmlunch() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	public void login() {
		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	        usernameField.sendKeys("Admin");

	        WebElement passwordField = driver.findElement(By.name("password"));
	        passwordField.sendKeys("admin123");;

	        WebElement login = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	        login.submit();
		
	}
	@Test
	public void AdminPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Admin = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
		Admin.click();
	}
}