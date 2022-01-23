package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AirLinesNegative {
	
      public static WebDriver driver;
    @Given("^User will land to the SIA cargo Homepage$")
    public void user_will_land_to_the_sia_cargo_homepage() throws Throwable {
        
    	System.setProperty("WebDriver.gecko.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\geckodriver");
    	WebDriver driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.aacargo.com/AACargo/tracking");
    	
    }

    @When("^User enters Invalid Airway billnumbers$")
    public void user_enters_invalid_airway_billnumbers() throws Throwable {
    	
    
    	WebElement fst = driver.findElement(By.id("airwayBills0.awbCode"));
    	fst.sendKeys("458");
    	
         WebElement sec = driver.findElement(By.id("airwayBills0.awbNumber"));
         sec.sendKeys("147896325");
    }

    @Then("^user clicks on Submit Button$")
    public void user_clicks_on_submit_button() throws Throwable {
      
    	WebElement submit =  driver.findElement(By.name("track10Search"));
    	submit.click();
    	
    }

    @And("^User will see the Message Invalid$")
    public void user_will_see_the_message_invalid() throws Throwable {
       
    	String Title = driver.getTitle();
    	System.out.println(Title);
    }

}
