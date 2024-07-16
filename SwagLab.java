package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLab {
	WebDriver driver;
	@Test(invocationCount=2,invocationTimeOut=30000)
	public void a_pageload() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	}
}
		
	
		
		
		

	



