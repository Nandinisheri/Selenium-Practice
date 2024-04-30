package Selenium.Practice.Selenium.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver
				.findElements(By.xpath("//li[@class='ui-menu-item'] //a[@class='ui-corner-all']"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india")) {
				System.out.println(option);
				option.click();
				break;
			}
		}

		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

			System.out.println("its enabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}

		driver.close();

	}

}
