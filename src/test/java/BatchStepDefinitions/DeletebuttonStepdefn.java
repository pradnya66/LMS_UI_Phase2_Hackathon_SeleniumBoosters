package BatchStepDefinitions;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeletebuttonStepdefn extends BaseClass {
	
	TestContext testcontext;
	public DeletebuttonStepdefn(TestContext testcontext) {
		this.testcontext = testcontext;
	}
	


	@Then("Verify that the Delete button next to the search box is Disabled")
	public void verify_that_the_delete_button_next_to_the_search_box_is_disabled() {
	   System.out.println("Validating Delete button on top");
	   Boolean del = testcontext.getBatchObj().deletebuttonvalidation();
	   
	   if(del) {
           System.out.println("Yes ! Delete is enabled");
     }
     else {
           System.out.println("NO ! Delete button is not enabled");
     }
	   
	}
	
}
