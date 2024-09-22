package IBPLIFEILP;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println((driver.findElements(By.tagName("a")).size()));
		
		WebElement footerlink = driver.findElement(By.id("gf-BIG"));
		System.out.println((footerlink.findElements(By.tagName("a")).size()));
		
		WebElement Firstcolumnfooter = footerlink.findElement(By.xpath(" //tbody/tr/td[1]/ul[1]"));
		System.out.println(Firstcolumnfooter.findElements(By.tagName("a")).size());
		
		//click on each link in the column and check if the pages are opening with grab the page title.
		
		for(int i =1 ; i<Firstcolumnfooter.findElements(By.tagName("a")).size();i++)
		{
			
		String clickoneachlinkforopeningitindifferenttab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		Firstcolumnfooter.findElements(By.tagName("a")).get(i).sendKeys(clickoneachlinkforopeningitindifferenttab);
		Thread.sleep(5000);
		}
		
		Set<String> abc= driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
	}
}


