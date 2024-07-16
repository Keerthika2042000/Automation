package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rajinikanth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\eclipse-jee-oxygen-3a-win32-x86_64\\\\eclipse\\\\chromedriver.new\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.skillrary.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
				
		
		
		
		
		}
}
