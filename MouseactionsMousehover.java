package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseactionsMousehover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(text(),'Create')]/preceding::button[2]")).click();
		WebElement ElectronicsLink=driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		Actions act=new Actions(driver);
		act.moveToElement(ElectronicsLink).build().perform();
		
		

	}

}
