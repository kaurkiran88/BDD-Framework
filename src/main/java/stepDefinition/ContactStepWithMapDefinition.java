package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactStepWithMapDefinition {
	
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
		for (Map<String,String> data : credentials.asMaps()) {
		driver.findElement(By.id("loginusername")).sendKeys(data.get("username"));
		driver.findElement(By.id("loginpassword")).sendKeys(data.get("password"));
		}
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
	
	@Then("user enters new message details and click on Send Message button")
	public void user_enters_new_message_details_and_click_on_Send_Message_button(DataTable message) throws InterruptedException {
		for (Map<String,String> messageData : message.asMaps()) {
		driver.findElement(By.id("recipient-email")).sendKeys(messageData.get("email"));
		driver.findElement(By.id("recipient-name")).sendKeys(messageData.get("name"));
		driver.findElement(By.id("message-text")).sendKeys(messageData.get("message"));
		
		driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		Thread.sleep(3000);
		}
	}
	
	
	@Then("user quit")
	public void user_quit() throws Throwable {	
		driver.quit();
	} 

}
