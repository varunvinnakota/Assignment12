  package stepDefinations;

import static org.testng.Assert.assertEquals;

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
		 
		 String Actualresult = driver.getTitle();
		 String Expectedresult = "Amazon.com. Spend less. Smile more.";
		Assert.assertTrue(Actualresult.contains(Expectedresult));
		System.out.println("User Landed on Verified Page");
		 
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
	    	
	    	WebElement mobile = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 11 Pro, 64GB, Space Gray - Unlocked (')]"));
	    	
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
