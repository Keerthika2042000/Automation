package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pinespherefunc {
	@Test

	public  void function() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pinesphere.com/");
		System.out.println(driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 4500)");
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("      ");
		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys("keerthika@pinesphere.co.in");
		WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
		phone.sendKeys("abcdefghij");
		driver.findElement(By.id("submit")).submit();
		
		
	}

}
