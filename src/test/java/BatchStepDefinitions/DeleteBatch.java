package BatchStepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteBatch extends BaseClass {
	
	TestContext testcontext;
	public DeleteBatch(TestContext testcontext) {
		this.testcontext = testcontext;
	}
	
	//String firstbatchname = testcontext.getBatchObj().getupdatedbatchname();
	@Given("user is on Batch page")
	public void user_is_on_batch_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getBatchObj().batchlinkclick();
		
	}

	@When("user clicks delete  button for any batch")
	public void user_clicks_delete_button_for_any_batch() {
		
        testcontext.getBatchObj().deletebatch();
       // public String deletedbatchname = testcontext.getBatchObj().getfirstbatchname();
	}

	@Then("user will get confirm deletion popup")
	public void user_will_get_confirm_deletion_popup() {
		 String actualmes =testcontext.getBatchObj().deleteconfirmAlert();
		   //System.out.println("delete confirmation is opened: "+flag);
		 //  Assert.assertEquals(flag, true);
		 String expectedmes = "Confirm";
		 Assert.assertEquals(actualmes, expectedmes);
	    
	}
	
	@When("User clicks Yes button in Confirm Deletion Page")
	public void user_clicks_yes_button_in_confirm_deletion_page() {
		
		  testcontext.getBatchObj().clickYesdeletebatch();
		  
	}

	@Then("User could see {string} message")
	public void user_could_see_message(String ExpAlert) {
		
		String actAlert = testcontext.getBatchObj().getAlertText();
		Assert.assertEquals(actAlert, ExpAlert); 
		System.out.println("Expected:" + ExpAlert + "&  Actual:" + actAlert);
	}
	
	@When("User Searches for {string}")
	public void user_searches_for(String batchName) throws InterruptedException {
		//testcontext.getBatchObj().batchlinkclick();
		
		
		testcontext.getBatchObj().enterTextInSearch(batchName);
Thread.sleep(3000);
	}
	@Then("There should be zero results.")
	public void there_should_be_zero_results() {
		
	System.out.println("selected batch deleted");

	}
	
}

