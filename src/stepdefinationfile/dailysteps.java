package stepdefinationfile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class dailysteps {
	

	@When ("^I meet([^\"]*)$")
	
	public void imeet(String str){
		
		System.out.println ("First Class");
	}
	
	@Given ("^I work in  ([^\"]*)$")
	public void in(String str){
		System.out.println ("First Class");
		
		}

}
