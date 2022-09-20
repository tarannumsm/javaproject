package Cucumbar_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login_demo {
	WebDriver driver;

	@Given("^I am on the demo website \"([^\"]*)\"$")
	public void i_am_on_the_demo_website(String arg1) throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get(arg1);
	}
		
		@When("^I type login = \"([^\"]*)\" and password = \"([^\"]*)\"$")
		public void i_type_login_and_password(String arg1, String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			WebElement username = driver.findElement(By.name("Email"));
			WebElement password = driver.findElement(By.name("Password"));
			username.clear();
			username.sendKeys(arg1);
			password.clear();
			password.sendKeys(arg2);
		}

		@When("^I click sign-in button$")
		public void i_click_sign_in_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
			submitBtn.click();
  
		}

		@Then("^I should get \"([^\"]*)\" text$")
		public void i_should_get_text(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			String actualValue=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
			Assert.assertEquals(actualValue,arg1);

		}

}
	