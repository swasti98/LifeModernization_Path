package IBPLIFEILP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.findElement(By.id("inputUsername")).sendKeys("Swati@98");
		 driver.findElement(By.name("inputPassword")).sendKeys("wertyui");
		 driver.findElement(By.id("chkboxOne")).click();
		 driver.findElement(By.className("signInBtn")).click();
		 System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		 driver.findElement(By.id("inputUsername")).sendKeys("Swati@98");
		 driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		 driver.findElement(By.className("signInBtn")).click();
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
		 
		 
		 
		 
		 
		 

	}

}
