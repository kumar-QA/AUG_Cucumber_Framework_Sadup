package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo1 {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	System.out.println("I want to write a step with precondition");    
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("some other precondition");    
    
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("I complete action");    
	    
	}


}
