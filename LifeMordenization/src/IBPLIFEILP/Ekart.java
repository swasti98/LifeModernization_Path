package IBPLIFEILP;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ekart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Productneeded[] = {"Cucumber","Corn","Almonds", "Carrot"};
		int j = 0;
		
	  List<WebElement> products	= driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
	  for(int i= 0; i<products.size();i++)
	  {
		 String name[] = products.get(i).getText().split("-");
		 String afternamechange = name[0].trim();
		 List itemsneeded = Arrays.asList(Productneeded);
		 if(itemsneeded.contains(afternamechange))
		 {
			 j++;
			 driver.findElements(By.xpath("//div[@class=\"product-action\"]")).get(i).click();
			 if(j==Productneeded.length)
			 {
				 break;
			 }
		 }
		 
	  }
	  driver.findElement(By.xpath("//a[@class=\"cart-icon\"]/img")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	  
	 
		
	  driver.findElement(By.xpath("//input[@placeholder=\"Enter promo code\"]")).sendKeys("rahulshettyacademy");
	  driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
	  
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Code applied ..!')]")));
	  
	  System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	  
	  driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	  
	  
	  
	  
	  
	  
	  
		
		

	}

}
