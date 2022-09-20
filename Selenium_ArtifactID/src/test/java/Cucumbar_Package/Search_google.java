package Cucumbar_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Search_google {

	WebDriver driver;
    @Given("^I am on google page \"([^\"]*)\"$")
    public void i_am_on_google_page(String urls) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(urls);
    }
    @When("^I type login = \"([^\"]*)\"$")
    public void i_type_login(String keywordsearch) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(keywordsearch);
        
    }
    @When("^I click on google search button$")
    public void i_click_on_google_search_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("btnK")).submit();	
	driver.close();
	
    }
	
	
	
	
}
