package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepDefinition {

	WebDriver driver;

	@Given("^user in on crm login page$")
	public void user_in_on_crm_login_page() {

		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\Selenium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.crmpro.com");

	}

	@When("^title of login page is CRM Software$")
	public void title_of_login_page_is_CRM_Software() {

		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);

	}

	@Then("^user enters crm username and password$")
	public void user_enters_username_and_password(DataTable Credentials) {

		List<List<String>> Value = Credentials.raw();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Value.get(0).get(0));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Value.get(0).get(1));
	}

	@And("^user clicks on page login button$")
	public void user_clicks_on_page_login_button() {
		WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbtn);
	}

	@Then("^user is directed to home page$")
	public void user_is_on_home_page() {
		String Title = driver.getTitle();
		System.out.println("Homepage title is: " + Title);
		Assert.assertEquals("CRMPRO", Title);
	}

	@And("^user moves to new deals$")
	public void user_moves_to_new_deals() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Deals']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Deal']")).click();
	}

	@And("^user enters new deal details$")
	public void user_enters_new_deal_details(DataTable dealData) {
		List<List<String>> dealValue = dealData.raw();
		driver.findElement(By.id("title")).sendKeys(dealValue.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(dealValue.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(dealValue.get(0).get(2));
		driver.findElement(By.id("commission")).sendKeys(dealValue.get(0).get(3));
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	}

	@And("^user close the browser$")
	public void user_close_the_browser() {
		driver.close();

	}

}
