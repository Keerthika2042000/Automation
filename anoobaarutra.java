package automationFramework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class anoobaarutra {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.anoobaarutra.com/";
		long startTime = System.currentTimeMillis();
		driver.get("https://www.anoobaarutra.com/");
		long endTime = System.currentTimeMillis();
		long loadTime = (endTime - startTime) / 1000;
		System.out.println("Page load time for " + url + ": " + loadTime + " seconds");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String url1 = "https://www.anoobaarutra.com/";

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
		driver.close();

	}


	}

