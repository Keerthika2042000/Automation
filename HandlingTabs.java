package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\eclipse-jee-oxygen-3a-win32-x86_64\\\\eclipse\\\\chromedriver.new\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[contains(text(),'Services')]")).click();
		Thread.sleep(7000);
		ArrayList <String> NaukriTabs=new ArrayList <String> (driver.getWindowHandles());
		for(String output:NaukriTabs) {
			System.out.println(output);
			
		}
		
		driver.switchTo().window(NaukriTabs.get(0));
		System.out.println(NaukriTabs);
		driver.close();

	}

}
