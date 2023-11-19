package hw7.selenium_5ws_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='user-name']")).
		sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).
		sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.close();

	}
	
}
