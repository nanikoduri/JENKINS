package jenkins_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testjenkins {
	@Test
	public void testAddition(){
		System.out.println("Welcome to jenkins world");
		int i=1;
        int j=2;
        int q=i+j;
       System.out.println("the value of q is  "  +q);
       Assert.assertEquals(q, 3);
       	System.out.println("Hello Nani!!");			
       System.setProperty("webdriver.chrome.driver","C://Selenium/chromedriver.exe"); 
   	 WebDriver driver = new ChromeDriver();
   	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
   	 driver.get("http://eenadu.net");
   	 System.out.println(driver.getTitle()); 
   		String pagetitle = driver.getTitle();
   		Assert.assertEquals(pagetitle, "EENADU Online Edition - Telugu news paper");
   			driver.quit();
    }
   		
		  @AfterTest      
		public void verifytitle(){
		  System.setProperty("webdriver.chrome.driver","C://Selenium/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://gmail.com");
			System.out.println(driver.getTitle());
			String pagetitle = driver.getTitle();
			Assert.assertEquals(pagetitle, "Gmail");
			driver.quit();	              
                 		
	}
	  @BeforeTest
	  	public void OpenPage(){
		System.setProperty("webdriver.chrome.driver","C://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com");
		System.out.println(driver.getTitle());
		String p = driver.getTitle();
		Assert.assertEquals(p, "Yahoo");
		driver.quit();
	  		}
	  }
