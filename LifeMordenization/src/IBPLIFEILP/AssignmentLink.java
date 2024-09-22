package IBPLIFEILP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
	     driver.get("http://qaclickacademy.com/practice.php");
	     driver.manage().window().maximize();

	     driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
	     
	     String option=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
	     WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

	     Select s=new Select(dropdown);
	     s.selectByVisibleText(option);
	     driver.findElement(By.name("enter-name")).sendKeys(option);

	     driver.findElement(By.id("alertbtn")).click();

	     String text=  driver.switchTo().alert().getText();

	     if(text.contains(option))

	     {

	    System.out.println("success Popup");

	     }

	     else

	    System.out.println("UnSuccessful");

	}
	       

}


