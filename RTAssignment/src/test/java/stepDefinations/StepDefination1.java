package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Cucumber.Automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination1 {
	public WebDriver driver;
	
	 @Given("^user is landing on application$")
	    public void user_is_landing_on_application() throws Throwable {
		 
		 driver = Base.getdriver();
		
		 
	 }

	    @When("^user enters the item \"([^\"]*)\" and hits enter$")
	    public void user_enters_the_item_something_and_hits_enter(String strArg1) throws Throwable {
	    	
	    	WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    	Search.sendKeys(strArg1);
	        WebElement submit = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	        submit.click();
	        Thread.sleep(5000);
	        
	    	
	      
	    }

	    @Then("^user should redirect to Item dispaly page$")
	    public void user_should_redirect_to_item_dispaly_page() throws Throwable {
	    	
	    	WebElement mobile = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span"));
	    	
	    	mobile.click();
	    	
	     
	    }

	    @And("^user should print the title of current page$")
	    public void user_should_print_the_title_of_current_page() throws Throwable {
	    	
	    	
	    	WebElement cart = driver.findElement(By.name("submit.add-to-registry.wishlist.unrecognized"));
	    	cart.click();
	        String title = driver.getTitle();
	        System.out.println(title);
	   
	    	
	       
	    }

}
