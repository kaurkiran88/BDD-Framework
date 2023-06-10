package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("user is on Home Page and clicks on Login button")
	public void user_is_on_Home_Page_and_clicks_on_Login() throws Throwable {
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
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		}
	
	@Then("user enters {string} and {string}")
	public void user_enters_and(String username, String password) throws Throwable {	
		driver.findElement(By.id("loginusername")).sendKeys(username);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
	
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
	
	@Then("user enters new message {string} and {string} and {string}")
	public void user_enters_new_message(String email, String name, String message) {
		driver.findElement(By.id("recipient-email")).sendKeys(email);
		driver.findElement(By.id("recipient-name")).sendKeys(name);
		driver.findElement(By.id("message-text")).sendKeys(message);
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
