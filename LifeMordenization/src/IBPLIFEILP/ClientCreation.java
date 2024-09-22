package IBPLIFEILP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://target2.dxc-assure-policy.com/Life/FirstServlet");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("sranjan");
		driver.findElement(By.name("password")).sendKeys("underwr1");
		driver.findElement(By.className("loginBtn")).click();

		driver.switchTo().frame("topFrame");
		WebElement element = driver.findElement(By.id("openNav-btn"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		driver.switchTo().defaultContent();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("frameMenu")));
		
		driver.switchTo().frame("frameMenu");
		driver.findElement(By.id("sidebar-pin")).click();
		driver.findElement(By.xpath("//img[@src='screenFiles/eng/menu/Clients.png']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Client Maintenance')]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.id("A")).click();
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainForm");
		driver.findElement(By.xpath("//input[@id='lsurname']")).sendKeys("Ranjan");
		driver.findElement(By.xpath("//input[@id='lgivname']")).sendKeys("Swasti");
		driver.findElement(By.id("cltdobxDisp")).sendKeys("21/08/1998");
		driver.findElement(By.xpath("//select[@id='cltsex']")).sendKeys("Male");
		driver.findElement(By.id("addrtype")).sendKeys("Business Address");
		driver.findElement(By.id("cltaddr01")).sendKeys("DXC Technology, Noida");
		driver.findElement(By.id("cltaddr02")).sendKeys("GautamBudhha Nagar, UP");
		driver.findElement(By.xpath("//button[@id='continuebutton']")).click();
		
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("frameMenu")));
		driver.switchTo().frame("frameMenu");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'created')]")).getText());
		
		driver.close();
		
	}

}
