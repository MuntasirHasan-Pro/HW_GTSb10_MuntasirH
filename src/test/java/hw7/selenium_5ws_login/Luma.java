package hw7.selenium_5ws_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Luma {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//input[@name='login[username]']")).
		sendKeys("dummypractice.qa@gmail.com");
		driver.findElement(By.xpath("//input[@name='login[password]']")).
		sendKeys("Abc@2023");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
