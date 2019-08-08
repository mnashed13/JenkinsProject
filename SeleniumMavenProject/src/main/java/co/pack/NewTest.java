package co.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
		public void NewTestDemo() {
		
//		System.setProperty("webdriver.chrome.driver","C:\\New folder\\Selenium Web Driver\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike Shoes");
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().back();
		System.out.println("Amazon Test Complete");
		
		String title = driver.getTitle();
		System.out.println("Page Title is " + title);
		
		driver.get("https://www.facebook.com");
		driver.findElement( By.name("email")).sendKeys("mnashed13@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("$020613Mn");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Logged in successfully");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
		driver.quit();
	}

}
