package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contact {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\eclipse-jee-oxygen-3a-win32-x86_64\\\\eclipse\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe"); // Replace with your actual ChromeDriver path

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pinesphere.com/");
		driver.findElement(By.linkText("CONTACT")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("      ");
		WebElement phone= driver.findElement(By.id("phone"));
		phone.sendKeys("          ");
		WebElement mail = driver.findElement(By.name("email-568"));
		mail.sendKeys("keerthika@pinesphere.co.in");
		WebElement tellus= driver.findElement(By.id("comments"));
		tellus.sendKeys("          ");
		WebElement paragraphElement = driver.findElement(By.xpath("//p[contains(text(), 'No.22, Kalapatti Main Rd,')]"));
		String paragraphText = paragraphElement.getText();
		System.out.println("Text from the paragraph: " + paragraphText);
		driver.findElement(By.linkText("Check Location")).click();
		
		
		
		
		
		

	}

}
