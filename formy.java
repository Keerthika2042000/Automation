package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class formy {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.id("first-name")).sendKeys("keerthi");
		driver.findElement(By.id("last-name")).sendKeys("ganapathi");
		driver.findElement(By.id("job-title")).sendKeys("test engineer");
		//driver.findElement(By.id("radio-button-2")).click();
		WebElement Education=driver.findElement(By.id("radio-button-2"));
		Education.click();
		//driver.findElement(By.id("checkbox-3")).click();
				WebElement Gender =driver.findElement(By.id("checkbox-3"));
				Gender.click();
				Select experience=new Select(driver.findElement(By.id("select-menu")));
				experience.selectByVisibleText("5-9");
				
				driver.findElement(By.id("datepicker")).sendKeys("20/04/2000");
				driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();				

	}

}
