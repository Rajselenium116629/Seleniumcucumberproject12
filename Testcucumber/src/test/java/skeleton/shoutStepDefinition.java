package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class shoutStepDefinition {
Person raunak=new Person();
Person rita=new Person();
@Given("raunak is {int} metres away from rita")
public void raunak_is_metres_away_from_rita(Integer int1) {
   raunak.getDistance(int1);
   
    
}

@When("raunak shouts {string}")
public void raunak_shouts(String string) {
   raunak.setMessage(string);
}

@Then("rita listens to the message")
public void rita_listens_to_the_message() {
   String message=raunak.getMessage();
   Assert.assertEquals("Free coffee",message);
   
}


}
