package step_definition;


import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Glue_methods {
	
	WebDriver driver;
	
	@Before public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaman.preet\\git\\cucumber.maven\\cucumber.maven\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in/");
	}
	
	@Given("^Chrome is opened$")
	public void chrome_is_opened() throws Throwable {
//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
  System.out.println("Chrome is getting opened");
//driver=new FirefoxDriver();
  
//driver.get("http://www.google.co.in/");
	}

	@When("^I Enter a \"([^\"]*)\" and press search$")
	public void i_Enter_a_keyword_and_press_search(String key) throws Throwable {
	  driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(key);
	  driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	}

	@Then("^Search results appear$")
	public void search_results_appear() throws Throwable {
	    System.out.println("Data is searched");
	}
	
	/*@Then("^Application should be closed$")
	public void application_should_be_closed() throws Throwable {
	   driver.quit();}*/
	
	@Given("^User navigate to Linkedin$")
	public void user_navigate_to_Linkedin() throws Throwable {
	      driver.navigate().to("https://www.linkedin.com/"); 
	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("login-email")).sendKeys(arg1);
		driver.findElement(By.id("login-password")).sendKeys(arg2);
		driver.findElement(By.id("login-submit")).click();
	}
	
	@When("^I enter valid data$")
	public void i_enter_valid_data(DataTable table) throws Throwable {
		java.util.List<java.util.List<String>> data = table.raw();
	      driver.findElement(By.id("login-emai")).sendKeys("test1");
	      driver.findElement(By.id("login-password")).sendKeys("xyz");
	      driver.findElement(By.id("login-submit")).click();
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	}
	@Then("^login should be unsuccessful$")
	public void login_should_be_unsuccessful() throws Throwable {
		 if(driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/uas/login-submit"))
		 { 
		            System.out.println("Test Pass"); 
		      } else { 
		         System.out.println("Test Failed"); 
		      }
	}
/*
	@Then("^Browser should be closed$")
	public void browser_should_be_closed() throws Throwable {
	    driver.close();
	}
*/
	@After public void cleanUp(){ 
	      driver.close(); 
	}
	
	
	
}
