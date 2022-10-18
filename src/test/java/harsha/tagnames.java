package harsha;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tagnames { 
	String address="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String URL="https://www.youtube.com";
WebDriver driver;
@BeforeTest
public void beforetest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(address);
		driver.manage().window().maximize();
		String beforelogin=driver.getCurrentUrl();
		System.out.println(beforelogin);
		//Thread.sleep(3000);
}
@Test(priority=0)
	public void Testcase1() throws InterruptedException {
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);		
				
	}
@Test(priority=1)
public void Testcase2() throws InterruptedException{
	List<WebElement>ch= driver.findElements(By.tagName("a"));
	System.out.println("Total no of checkboxes:"+ch.size());
	for(int i=0;i<=ch.size();i++)
	{
	
	System.out.println(ch.get(i).getText());
	System.out.println(ch.get(i).getAttribute("href"));
	}
	}
	@Test(priority=2)
	public void Testcase3() throws InterruptedException{
		driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(URL);
	
	
		//ch.get(i).click();
}
@AfterTest
public void AT() throws InterruptedException {
	Thread.sleep(3000);
	//driver.close();


}
}
