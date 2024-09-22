package IBPLIFEILP;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindowTAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handels = driver.getWindowHandles();
		Iterator<String>it = handels.iterator();
		String Parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		driver.get("https://rahulshettyacademy.com/");
		
		String text = driver.findElement(By.xpath("//span[text() = \"why we are\"]")).getText();
		driver.switchTo().window(Parentwindow);
		
		driver.findElement(By.name("name")).sendKeys(text);
		
		driver.quit();
		
	}

}
