package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement DoubleClickButton=driver.findElement(By.xpath("//button[contains(text(),'See')]"));
		Actions act=new Actions(driver);
		act.doubleClick(DoubleClickButton).build().perform();
		Alert abc=driver.switchTo().alert();
		String PoPText=abc.getText();
		System.out.println(PoPText);
		abc.accept();
		
		

	}

}
