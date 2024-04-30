package Selenium.Practice.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E_Flow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();	
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXL']")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("divpaxinfo")).click();
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		WebElement dp = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select options = new Select(dp);
		options.selectByIndex(3);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		driver.quit();

	}

}
