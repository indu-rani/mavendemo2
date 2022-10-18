package harsha;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {
	String url="https://demo.guru99.com/test/newtours";
	  WebDriver driver;
	 @BeforeTest
	 public void beforetest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			String beforelogin=driver.getCurrentUrl();
			System.out.println(beforelogin);
			String afterlogin=driver.getCurrentUrl();
			System.out.println(afterlogin);
			//Thread.sleep(3000);
	 }
			@Test
			public void Testcase2() throws InterruptedException {
				List<WebElement>ch= driver.findElements(By.tagName("a"));
				ch.addall
				System.out.println("Total no of checkboxes:"+ch.size());
				List<WebElement>ch1=new ArrayList<WebElement>();
				
				for(int i=0;i<=ch.size();i++)
				{
					if (ch.get(i).getAttribute("href")!=null){
						ch.add(ch1.get(i));
					}
				
				//System.out.println(ch.get(i).getText());
				//System.out.println(ch.get(i).getAttribute("href"));
				}
				}
			@AfterTest
			public void AT() throws InterruptedException {
				Thread.sleep(3000);
				//driver.close();
				

}
}
