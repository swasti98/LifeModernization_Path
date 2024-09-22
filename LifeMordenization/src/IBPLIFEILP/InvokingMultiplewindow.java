package IBPLIFEILP;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultiplewindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handels = driver.getWindowHandles();
		Iterator<String> it = handels.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com/");
		
		String text = driver.findElement(By.xpath("//span[text() = \"why we are\"]")).getText();
		System.out.println((text));
		
		driver.switchTo().window(parentwindow);
		
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("text");
		
		//capturing partial screen shot
		
		File file = name.getScreenshotAs(OutputType.FILE) ;
		FileUtils.copyFile(file, new File("ScreenShot.png"));
		
		//get height and width
		
	    System.out.println(name.getRect().getDimension().getHeight());
	    System.out.println(name.getRect().getDimension().getWidth());
	    
		driver.quit();

	}

}
