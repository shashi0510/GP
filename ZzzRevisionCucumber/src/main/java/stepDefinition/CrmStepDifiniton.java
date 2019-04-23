/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CrmStepDifiniton {

	WebDriver driver;

	@Given("^user is on login crm page$")
	public void user_is_on_login_page() {

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

	@Then("^user enters his crm \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String pwd) {

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	}

	@Then("^user clicks on crm login button$")
	public void user_clicks_on_login_button() {
		//driver.findElement(By.xpath("//input[@type='submit']")).click();;
		WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbtn);
	}

	@And("^user in on home page$")
	public void user_in_on_home_page() {

		String Title = driver.getTitle();
		System.out.println("Homepage title is: " + Title);
		Assert.assertEquals("CRMPRO", Title);

	}
	
	@Then("^user moves to new contact$")
	public void user_moves_to_new_contact() {
		driver.switchTo().frame("mainpanel");
		//WebElement ct=driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]"));
		//WebElement ct=driver.findElement(By.xpath("//a[@title='Contacts']"));
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'New Contacts')]")).click();
		}
	
	@And("^user enters crm contacts \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_crm_contacts(String name, String title, String post) {
		driver.findElement(By.id("first_name")).sendKeys(name);
		driver.findElement(By.id("surname")).sendKeys(title);
		driver.findElement(By.id("company_position")).sendKeys(post);
	}
	@Then("^user clicks on contacts save button$")
	public void user_clicks_on_contacts_save_button() {
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	}

	@And("^user closes the browser$")
	public void user_close_the_browser() {
		driver.close();

	}
}*/
