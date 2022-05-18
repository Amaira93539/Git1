package Data_Table;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefForTaggedHooks {
	
	@Before(order=0)
	public void setup() {
		System.out.println("launch the browser");
		System.out.println("user enter the url for crm app");
	}
	@After(order=1)
	public void teardown() {
		System.out.println("close the browser");
	}
	@Before(order=1)
	public void setup1() {
		System.out.println("launch the browser");
		System.out.println("user enter the url for crm app");
	}
	@After(order=2)
	public void teardown1() {
		System.out.println("close the browser");
	}
	
	@Given("user trying to check first scenario")
	public void user_trying_to_check_first_scenario() {
	   System.out.println("user is on first page");
	}

	@When("user is satisfied")
	public void user_is_satisfied() {
	   System.out.println("user enter the some value on first page");
	}

	@Then("user print the output")
	public void user_print_the_output() {
	   System.out.println("this is a first page");
	}

	@Before("@first")
	@Given("user in on second page")
	public void user_in_on_second_page() {
	   System.out.println("user is on second page");
	}

	@When("user enter the successfully on second page")
	public void user_enter_the_successfully_on_second_page() {
	    System.out.println("user evaluating the second page");
	}

	@Then("user display the outcome")
	public void user_display_the_outcome() {
	   System.out.println("welcome to second page");
	}

	@After("@second")
	@Given("user land on third page")
	public void user_land_on_third_page() {
	   System.out.println("user is on third page");
	}
	
	@When("user evaluating the third page")
	public void user_evaluating_the_third_page() {
	    System.out.println("user clicking some inputs on third page");
	}

	@Then("user out of the third page")
	public void user_out_of_the_third_page() {
	   System.out.println("thanks for visting the third page");
	}

}
