package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Glue_methods {
	
	WebDriver driver;
	@Given("^Chrome is opened$")
	public void chrome_is_opened() throws Throwable {
//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
System.setProperty("webdriver.chrome.driver","C:\\Users\\chaman.preet\\Documents\\C data\\Test_workspace\\cucumber.maven\\ChromeDriver\\chromedriver.exe");
driver=new ChromeDriver();
System.out.println("Chrome is getting opened");
//driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.google.co.in/");
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
	
	@Then("^Application should be closed$")
	public void application_should_be_closed() throws Throwable {
	   driver.quit();}
}
