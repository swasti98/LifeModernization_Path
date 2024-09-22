package IBPLIFEILP;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://ft2.dxc-assure-policy.com/SOELandingPortal/SOE-LandingPage");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		// driver.close();
	}

}
