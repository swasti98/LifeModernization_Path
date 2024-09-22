package IBPLIFEILP;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ContactModule {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\swast\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qat-soe.dxc-assure-policy.com/SOELandingPortal/SOE-LandingPage");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//Thread.sleep(5000);
		/*Implicit Wait/*
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.xpath("(//span[contains(text(),'Login')])[2]")).click();
		
		 * Explicit Wait*/
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Login\"]")));
		WebElement loginMainPage = driver.findElement(By.xpath("//span[text()=\"Login\"]"));
		JavascriptExecutor LogMnPg = (JavascriptExecutor) driver;
		LogMnPg.executeScript("arguments[0].click();", loginMainPage);
		
		/*
		 Fluent Wait */
		
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-header/div[1]/div[3]/div[1]/div[3]/dxc-button[1]/button[1]/span[1]/img[1]"))).click();
		*/
		
	}

}
