package stepDefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	private static WebDriver driver = null;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://www.store.demoqa.com");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a/span[1]")).click();		
	    driver.findElement(By.id("login")).click();
	}

	@When("^User enters credentials to login$")
	public void user_enters_credentials_to_login(DataTable userCredentials) throws Throwable {
	   for(Map<String, String> data : userCredentials.asMaps(String.class, String.class)){
	   driver.findElement(By.id("log")).clear();
	   driver.findElement(By.id("log")).sendKeys(data.get("username"));
	   driver.findElement(By.id("pwd")).clear();
	   driver.findElement(By.id("pwd")).sendKeys(data.get("password"));
	   driver.findElement(By.id("login")).click();
	   }
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    System.out.println("Login Successfully");
	}
}
