package automationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gettext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pinesphere.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
        StringBuilder allText = new StringBuilder();
        allText.append(getAllTextUsingFindElements(driver));
        
        System.out.println(allText.toString());
    }

	private static Object getAllTextUsingFindElements(WebDriver driver) {
		StringBuilder text = new StringBuilder();
		java.util.List<WebElement> allElements = driver.findElements(By.xpath("//*"));
		for (WebElement element : allElements) {
	        
	        String elementText = element.getText().trim();
	        if (!elementText.isEmpty() && !text.toString().contains(elementText)) {
	            text.append(elementText).append("\n");
	        }
	    }

	    return text.toString();
		
	}

	

	

}

