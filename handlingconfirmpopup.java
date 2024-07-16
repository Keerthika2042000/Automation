
package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingconfirmpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(10000);
		driver.findElement(By.id("confirmButton")).click();
		Alert abc=driver.switchTo().alert();
		String PopupText=abc.getText();
		System.out.println(PopupText);
		abc.dismiss();
		Thread.sleep(6000);
		String result=driver.findElement(By.id("confirmButton")).getText();
		System.out.println(result);
		

	}

}
