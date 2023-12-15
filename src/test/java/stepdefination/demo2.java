package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class demo2 {

@Given("yet another action")
public void yet_another_action() {
	System.out.println("yet another action");
   }

@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
	System.out.println("I validate the outcomes");
   }

@Then("check more outcomes")
public void check_more_outcomes() {
	System.out.println("check more outcomes");
    }
}
