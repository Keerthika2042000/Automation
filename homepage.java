package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pinesphere.com/");
		driver.findElement(By.linkText("Need Help? Request A Callback")).click();
		driver.findElement(By.xpath("//a[normalize-space()='WHY US']")).click();
		WebElement imageElement = driver.findElement(By.xpath("//img[@class='logo logo-display']"));
		if (imageElement.isDisplayed() && imageElement.getSize().getHeight() > 0 && imageElement.getSize().getWidth() > 0) {
		      System.out.println("Image is present on the page");
		    } else {
		      System.out.println("Image is not present or not displayed");
		    }
		driver.findElement(By.xpath("//a[normalize-space()='Get A Quote']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='WHY US']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Previous slide']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@aria-label='Next slide']")).click();
		
		WebElement imageElement1 = driver.findElement(By.xpath("//img[@alt='Digital Solutions, IT Services & Consulting']"));
		if (imageElement1.isDisplayed() && imageElement1.getSize().getHeight() > 0 && imageElement1.getSize().getWidth() > 0) {
		      System.out.println("Image is present on the page");
		    } else {
		      System.out.println("Image is not present or not displayed");
		    }
		System.out.println(driver.getTitle());
		driver.findElement(By.className("button")).click();
		
		
		
		
		

	}
	

}
