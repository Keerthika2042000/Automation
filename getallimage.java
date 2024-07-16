package automationFramework; // Replace with your package name

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getallimage {

    public static void main(String[] args) {
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
	



