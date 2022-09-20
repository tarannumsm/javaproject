package Cucumbar_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class assertexample {
	
	WebDriver driver;
	WebElement googlelogo;
	
	@Given("^I am on the google page \"([^\"]*)\"$")
    public void i_am_on_the_google_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(arg1);
    }
    @When("^I search for Google Logo webelement$")
    public void i_search_for_Google_Logo_webelement() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        googlelogo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
        System.out.println("find and stor the web element for the Google Logo");
    }
    @Then("^I should get webelement isDisplayed$")
    public void i_should_get_webelement_isDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(true, googlelogo.isDisplayed());
        System.out.println("Google logo is displayed – Assert passed");
    }
}
