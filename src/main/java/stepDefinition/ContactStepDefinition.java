package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactStepDefinition {

WebDriver driver;
	
	@Given("user is on Home Page and clicks on Login button")
	public void user_is_on_Home_Page_and_clicks_on_Login_button() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "/Users/kataria99/Desktop/QA/SeleniumJars/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		Thread.sleep(3000);
	}
	
	@When("title of page is STORE")
	public void title_of_page_is_STORE(){
		String expectedTitle = "STORE";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		}
	
	@Then("user enters username and password")
	public void user_enters_username_and_password(DataTable credentials) throws Throwable {	
		List<List<String>> data = credentials.cells();
		driver.findElement(By.id("loginusername")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("loginpassword")).sendKeys(data.get(0).get(1));
	
	}

	@Then("user clicks on Login button")
	public void user_clicks_on_login_button() throws Throwable { 
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		Thread.sleep(3000);
	}
	
	@Then("user is logged in")
	public void user_is_logged_in() {
		driver.findElement(By.xpath("//a[@id='nameofuser']")).isDisplayed();
	}
	
	@Then("user click on Contact link")
	public void user_click_on_Contact_link() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		Thread.sleep(3000);
	}
	
	@Then("user enters new message details")
	public void user_enters_new_message_details(DataTable message) {
		List<List<String>> messageData = message.cells();
		driver.findElement(By.id("recipient-email")).sendKeys(messageData.get(0).get(0));
		driver.findElement(By.id("recipient-name")).sendKeys(messageData.get(0).get(1));
		driver.findElement(By.id("message-text")).sendKeys(messageData.get(0).get(2));
	}
	
	@Then("Send Message button is clicked by user")
	public void Send_Message_button_is_clicked_by_user() throws Throwable {
		driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
		Thread.sleep(3000);
	}
	
	@Then("user quit")
	public void user_quit() throws Throwable {	
		driver.quit();
	} 
}
