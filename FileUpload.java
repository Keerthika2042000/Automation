package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/");
		Thread.sleep(20000);
		//driver.findElement(By.id("uploadfile_0")).click();
		WebElement UploadButton=driver.findElement(By.id("uploadfile_0"));
		UploadButton.sendKeys("C:/Users/keert/Downloads/RAGAVIMEERA.pdf");
		
		
		

	}

}
