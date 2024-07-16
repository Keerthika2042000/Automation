package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseActionrightclick {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\eclipse-jee-oxygen-3a-win32-x86_64\\\\eclipse\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void rightclick() {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClickButton = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
        Actions act = new Actions(driver);
        act.contextClick(rightClickButton).build().perform();
        // Rest of your right-click functionality here...
    }

    @Test(dependsOnMethods= {"rightclick"})
    public void doubleClick() {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'See')]"));
        Actions act = new Actions(driver);
        act.doubleClick(doubleClickButton).build().perform();
        // Rest of your double-click functionality here...
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

	

	