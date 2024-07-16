package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeQuit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://pinesphere.com/";
		long startTime = System.currentTimeMillis();
		driver.get("https://pinesphere.com/");
		long endTime = System.currentTimeMillis();
		long loadTime = (endTime - startTime) / 1000;
		System.out.println("Page load time for " + url + ": " + loadTime + " seconds");
		driver.close();
		
		
		
		
		

	}

}
