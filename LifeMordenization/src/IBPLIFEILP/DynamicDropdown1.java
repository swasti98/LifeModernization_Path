package IBPLIFEILP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Hyderabad (HYD)')]")).click();
	    System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Hyderabad (HYD)')]")).getText());
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),' Bengaluru (BLR)')]")));
		
	    driver.findElement(By.xpath("//a[contains(text(),' Bengaluru (BLR)')]")).click();
	    System.out.println(driver.findElement(By.xpath("//a[contains(text(),' Bengaluru (BLR)')]")).getText());
	   
		/* //div[@id="glsctl00_mainContent_ddl_destinationStation1_CTNR"]//a[text()=' Chennai (MAA)'] */
		

	}

}
