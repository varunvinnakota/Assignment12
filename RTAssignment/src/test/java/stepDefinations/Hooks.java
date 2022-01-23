package stepDefinations;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	
	
	@Before("@amazon")
	public void beforeopening() {
	
		System.out.println("Opening amazon");
	}
	
	@After("@amazon")
	public void Afteropening() {
		
	System.out.println("Sign-In to Continue");
		
	}

}
