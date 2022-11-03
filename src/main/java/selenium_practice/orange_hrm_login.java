package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class orange_hrm_login {

	@Test(invocationCount = 2)
	@Parameters({"username","password"})
	public void login(String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.quit();
		
	}

}
