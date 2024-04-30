package Selenium.Practice.Selenium.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args)  {
		
		System.out.println("Hello");
		
//      Invoking the edge browser
//		System.setProperty("webdriver.edge.driver", "C:/Users/Nandini.Sheri/Downloads/msedgedriver.exe");
		
//		WebDriver driver = new EdgeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();  
		
	}

}
