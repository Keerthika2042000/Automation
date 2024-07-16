package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingpromptpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		Alert abc=driver.switchTo().alert();
		String PopupText=abc.getText();
		System.out.println(PopupText);
		abc.sendKeys("keerthi");
		abc.accept();
		String Result=driver.findElement(By.id("promptResult")).getText();
		System.out.println(Result);

	}

}
