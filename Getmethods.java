
package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com/");
		driver.findElement(By.id("signin_button")).click();
		String loginpagetitle=driver.getTitle();
		System.out.println(loginpagetitle);
		String loginpageurl=driver.getCurrentUrl();
		System.out.println(loginpageurl);
		String forgot=driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).getText();
		System.out.println(forgot);
		String login=driver.findElement(By.xpath("//h3[contains(text(),'Log')]")).getText();
		System.out.println(login);
		String tagname=driver.findElement(By.name("submit")).getTagName();
		System.out.println(tagname);
		String attrname=driver.findElement(By.name("submit")).getAttribute("tabindex");
		System.out.println(attrname);
		String Cssvalue=driver.findElement(By.name("submit")).getCssValue("font-size");
		System.out.println(Cssvalue);
		
		
		
		
		
		
		
		

	}

}
