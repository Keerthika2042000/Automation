package testNGFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class priority {
	@Test(priority=2)

	public void loadtime() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://pinesphere.com/";
		long startTime = System.currentTimeMillis();
		driver.get("https://pinesphere.com/");
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
		driver.close();

	}


	

@Test(priority=1)


	public void Images() {
    System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\eclipse-jee-oxygen-3a-win32-x86_64\\\\eclipse\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe"); // Replace with your actual ChromeDriver path

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    try {
        driver.get("https://pinesphere.com/"); // Replace with your target URL

        // Find all image elements using tag name
        List<WebElement> images = driver.findElements(By.tagName("img"));

        System.out.println("Found " + images.size() + " images:");

        // Loop through images and print their source URLs (if available)
        for (WebElement image : images) {
            String imageUrl = image.getAttribute("src");
            if (imageUrl != null) {
                System.out.println(imageUrl);
            } else {
                System.out.println("Image without source attribute");
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        driver.quit();
    }
}

	

      
      }

		