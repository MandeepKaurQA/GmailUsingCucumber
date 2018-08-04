package Stepdefinition;

import java.util.List;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import junit.framework.Assert;		

public class Steps {				

     
	 WebDriver driver;			
		
	    @Given("^Open chrome and launch gmail$")					
	    public void open_the_Firefox_and_launch_the_application() throws Throwable							
	    {		
	       System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");					
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	       driver.get("http://www.gmail.com");					
	    }		

	    @When("^the user enters username as \"([^\"]*)\"$")					
	    public void enter_the_Username(String username) throws Throwable 							
	    {		
	    	
	       driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);	
	       driver.findElement(By.xpath("//span[text()='Next']")).click();
	      					
	    }	
	    @And("^the user enters password as \"([^\"]*)\"$")
	    public void enter_passowrd(String password) throws Throwable {
	    	Thread.sleep(2000);
	    	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);	
	    	 driver.findElement(By.xpath("//span[text()='Next']")).click();
	    }

	    @Then("^the user can land on login page$")					
	    public void on_login_page() throws Throwable 							
	    {		
	    	Thread.sleep(5000);
	      equals("https://mail.google.com/mail/u/0/#inbox".equals(driver.getTitle()));		
	      driver.quit();
	    }		
	    @Then("^the warning is displayed$")					
	    public void on_password_warning() throws Throwable 							
	    {		
	    	Thread.sleep(5000);
	    	 driver.findElement(By.cssSelector("div.OabDMe.cXrdqd.Y2Zypf")).isDisplayed();
	    	 driver.quit();
	    }
	}		