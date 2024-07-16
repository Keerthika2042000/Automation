package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verificationcommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.id("first-name")).sendKeys("keerthi");
		driver.findElement(By.id("last-name")).sendKeys("ganapathi");
		driver.findElement(By.id("job-title")).sendKeys("test engineer");
		WebElement education=driver.findElement(By.id("radio-button-2"));
		education.click();
		System.out.println(education.isEnabled());
		WebElement gender=driver.findElement(By.id("checkbox-3"));
		gender.click();
		System.out.println(gender.isSelected());
		
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Form')]")).isDisplayed());
		


		
		
		

	}

}
