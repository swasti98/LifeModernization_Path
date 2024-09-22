package IBPLIFEILP;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

		public class LunchBrowser {

			public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				
				 WebDriver driver = new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.get("https://www.google.com/");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				 System.out.println(driver.getTitle());
				 System.out.println(driver.getCurrentUrl());
				 
				    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Sign in\"]")));
					WebElement loginMainPage = driver.findElement(By.xpath("//span[text()=\"Sign in\"]"));
					JavascriptExecutor LogMnPg = (JavascriptExecutor) driver;
					LogMnPg.executeScript("arguments[0].click();", loginMainPage);
					
				// driver.close();


	}

}
