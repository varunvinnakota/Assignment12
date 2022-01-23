package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDefination {
	
	public static WebDriver driver;
	
	  @Given("^User is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
		  
		 System.setProperty("WebDriver.gecko.driver","C:\\Users\\DELL\\Desktop\\selenium1\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("https://www.riotinto.com");
		 
	        
	    }

	  @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
   public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	       
	    	System.out.println(strArg1);
	    	System.out.println( strArg2);
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {

	    	System.out.println("Then is ok");
	    }


	    @And("^Cards are displayed are \"([^\"]*)\"$")
	    public void cards_are_displayed_are_something(String strArg1) throws Throwable {
	    	
	    	System.out.println(strArg1);
	    }
	    @When("^User signin with following details$")
	    public void user_signin_with_following_details(DataTable data) throws Throwable {
	    	List<List<String>> obj = data.asLists();
	    	System.out.println(obj.get(0).get(0));
	    	System.out.println(obj.get(0).get(1));
	    	System.out.println(obj.get(0).get(2));
	    	System.out.println(obj.get(0).get(3));
	    	System.out.println(obj.get(0).get(4));
	    	
	    	
	    }
	    
	    @When("^User login in to application with (.+) and (.+)$")
	    public void user_login_in_to_application_with_and(String username, String password) throws Throwable {
	       
	    	System.out.println(username);
	    	System.out.println(password);
	    }
	    
	    @Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
	    	
	    	System.out.println("Back1");
	    }
	        
	    

	    @When("^Browser is opened$")
	    public void browser_is_opened() throws Throwable {

	    	System.out.println("Background2");
	    }

	    @Then("^validate the display$")
	    public void validate_the_display() throws Throwable {
	        
	    


	    	System.out.println("Background3");
	    }
	    
	    @Given("^User is landing to amazon page$")
	    public void user_is_landing_to_amazon_page() throws Throwable {
	     
	    	 System.setProperty("WebDriver.gecko.driver","C:\\Users\\DELL\\Desktop\\selenium\\geckodriver.exe");
			 WebDriver driver = new FirefoxDriver();
			 driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			 driver.get("https://www.amazon.com");
			 
	    }

	    @When("^User entered iphone in search box$")
	    public void user_entered_iphone_in_search_box() throws Throwable {
	        WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	        search.sendKeys("iphone");
	        
	    }

	    @Then("^User able to see the iphone display page$")
	    public void user_able_to_see_the_iphone_display_page() throws Throwable {
	        
	    	
	    	String titile = driver.getTitle();
	    	System.out.println(titile);
	    }

	    @And("^user hitted the search button$")
	    public void user_hitted_the_search_button() throws Throwable {
	    	
	    	WebElement Hit = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    	Hit.click();
	        
	    }

	    
}


