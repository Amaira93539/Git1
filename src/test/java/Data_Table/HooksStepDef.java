package Data_Table;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDef {
	@Before
	public void setup() {
		System.out.println("launch chrome browser");
		System.out.println("enter the url for free crm app");
		
	}
	
	@After
	public void teardown() {
		System.out.println("close the browser");
		
	}
	@Given("user is on deal page")
	public void user_is_on_deal_page() {
	    System.out.println("user is on deal page");
	}

	@When("user fills the deal form")
	public void user_fills_the_deal_form() {
	   System.out.println("create a deal");
	}

	@Then("deal is created")
	public void deal_is_created() {
	  System.out.println("deal is created");
	}

	@Given("user is on contact page")
	public void user_is_on_contact_page() {
	   System.out.println("user in on contact form");
	}

	@When("user fills the contact form")
	public void user_fills_the_contact_form() {
	    System.out.println("create a contact");
	    
	}

	@Then("contact is created")
	public void contact_is_created() {
	   System.out.println("contact is created");
	}

}
