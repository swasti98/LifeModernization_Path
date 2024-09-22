package IBPLIFEILP;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowHandels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows =  driver.getWindowHandles();
		Iterator<String>it = windows.iterator(); //(Parentscreen(0th index) ChildScreen(1st index))
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid); //go to child window
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String EmailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split("")[0];
		driver.switchTo().window(parentid); //back to parent window
		driver.findElement(By.id("username")).sendKeys(EmailId);
		
		
		
		

	}

}
