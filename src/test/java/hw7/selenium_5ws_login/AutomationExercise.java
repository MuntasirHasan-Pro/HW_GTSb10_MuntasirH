package hw7.selenium_5ws_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExercise {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).
		sendKeys("vehej20950@eachart.com");
		driver.findElement(By.xpath("//input[@type='password']")).
		sendKeys("abc123");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(3000);
		driver.close();

	}
	
}
