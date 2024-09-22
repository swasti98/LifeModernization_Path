package IBPLIFEILP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 driver.findElement(By.id("inputUsername")).sendKeys("Swati@98");
		 driver.findElement(By.name("inputPassword")).sendKeys("wertyui");
		 driver.findElement(By.id("chkboxOne")).click(); 
		 driver.findElement(By.className("signInBtn")).click();
		 
		 System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		 driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
		 driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Swasti@21");
		 driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("swasti.senapati@gmail.com");
		 driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("8249826368");
		 driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		 Thread.sleep(2000);
		 
		 System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		 driver.findElement(By.xpath("//button[contains(text(),'Go to Login')]")).click();
		 driver.findElement(By.id("inputUsername")).sendKeys("Swati@98");
		 driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.className("signInBtn")).click();
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		 System.out.println(driver.findElement(By.xpath("//p[contains(text(),'You are successfully')]")).getText());
		 Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'You are successfully')]")).getText(),"You are successfully logged in.");
		 driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
		
		 
		 
		 
		 
		
		
	}

}
