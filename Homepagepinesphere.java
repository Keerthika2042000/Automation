package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepagepinesphere {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pinesphere.com/");
		driver.findElement(By.xpath("//a[normalize-space()='WHY US']")).click();
		String url = "https://pinesphere.com/";
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		long loadTime = (endTime - startTime) / 1000;
		System.out.println("Page load time for " + url + ": " + loadTime + " seconds");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String url1 = "https://pinesphere.com/";

		Long statusCode = (Long) js.executeScript("" +
		  "var xhr = new XMLHttpRequest();" +
		  "xhr.open('GET', arguments[0], false);" +
		  "xhr.send(null);" +
		  "return xhr.status;" +
		"", url1);

		if (statusCode == 200) 
		{
		  System.out.println("URL is reachable (status code: 200)");
		} 
		else 
		{
		  System.err.println(statusCode);
		}
		driver.findElement(By.xpath("//a[normalize-space()='ABOUT US']")).click();
		
		System.out.println("Page load time for " + url + ": " + loadTime + " seconds");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		

		Long statusCode1 = (Long) js1.executeScript("" +
		  "var xhr = new XMLHttpRequest();" +
		  "xhr.open('GET', arguments[0], false);" +
		  "xhr.send(null);" +
		  "return xhr.status;" +
		"", url1);

		if (statusCode1 == 200) 
		{
		  System.out.println("URL is reachable (status code: 200)");
		} 
		else 
		{
		  System.err.println(statusCode1);
		}
		driver.findElement(By.xpath("//a[normalize-space()='SERVICES']")).click();
		
		System.out.println("Page load time for " + url + ": " + loadTime + " seconds");
		
		

		if (statusCode == 200) 
		{
		  System.out.println("URL is reachable (status code: 200)");
		} 
		else 
		{
		  System.err.println(statusCode);
		}
		driver.findElement(By.xpath("//a[normalize-space()='PRODUCTS']")).click();
		System.out.println("Page load time for " + url + ": " + loadTime + " seconds");
		if (statusCode == 200) 
		{
		  System.out.println("URL is reachable (status code: 200)");
		} 
		else 
		{
		  System.err.println(statusCode);
		}
		driver.findElement(By.xpath("//a[normalize-space()='CAREERS']")).click();
		driver.findElement(By.linkText("INTERNSHIP")).click();
		String url7 = "https://pinesphere.com/";
		
		System.out.println("Page load time for " + url7 + ": " + loadTime + " seconds");
		

		if (statusCode == 200) 
		{
		  System.out.println("URL is reachable (status code: 200)");
		} 
		else 
		{
		  System.err.println(statusCode);
		}
		driver.findElement(By.xpath("//a[normalize-space()='CAREERS']")).click();
		driver.findElement(By.linkText("WORK WITH US")).click();
		
		System.out.println("Page load time for " + url + ": " + loadTime + " seconds");
		if (statusCode == 200) 
		{
		  System.out.println("URL is reachable (status code: 200)");
		} 
		else 
		{
		  System.err.println(statusCode);
		}
		
		
		
		
		
		
		
		 

}
}
