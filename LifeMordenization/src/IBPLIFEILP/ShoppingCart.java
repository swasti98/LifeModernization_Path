package IBPLIFEILP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		
		driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		dropdown.selectByValue("consult");

		driver.findElement(By.xpath("//input[@id='terms']")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"nav-link btn btn-primary\"]")));
		
		List<WebElement> products = driver.findElements(By.xpath("//button[@class=\"btn btn-info\"]"));
		
	    for(int i= 0; i<products.size();i++)
	    {
	    	products.get(i).click();
	    	
	    }
	    driver.findElement(By.partialLinkText("Checkout")).click();
	    driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]")).click();
	    driver.findElement(By.xpath("//input[@id=\"country\"]")).sendKeys("India");
	    driver.findElement(By.xpath("//label[@for=\"checkbox2\"]")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type=\"submit\"]")));
	    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	    System.out.println(driver.findElement(By.cssSelector(".alert")).getText());
	    }
}
		
	

