package IBPLIFEILP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("name")).sendKeys("Swati");
		driver.findElement(By.name("email")).sendKeys("swati98@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Swati@98");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement gendersel = driver.findElement(By.id("exampleFormControlSelect1"));
		Select sel = new Select(gendersel);
		sel.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio2")).click();
		
		System.out.println(driver.findElements(By.xpath("//input[@type=\"radio\"]")).size());
		
		driver.findElement(By.name("bday")).sendKeys("21-08-1998");
		
		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText());

	}

}
