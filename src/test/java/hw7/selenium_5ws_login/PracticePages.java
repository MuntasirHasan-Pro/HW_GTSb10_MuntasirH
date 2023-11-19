package hw7.selenium_5ws_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticePages {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='firstname']")).
		sendKeys("MOONTHASEER");
		driver.findElement(By.xpath("//input[@id='surname']")).
		sendKeys("HAAAAASAAAAAN");
		driver.findElement(By.xpath("//input[@id='age']")).
		sendKeys("50");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.close();

	}
	
}
