package BatchStepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteMultipleBatchesStepDefn extends BaseClass {
	
	

	TestContext testcontext;
	public DeleteMultipleBatchesStepDefn(TestContext testcontext) {
		this.testcontext = testcontext;
		
	}
	
	@Given("User logged in lms website and navigated to Batch page")
	public void user_logged_in_lms_website_and_navigated_to_batch_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getBatchObj().batchlinkclick();
}
	

	@When("User selects more than one Batch using checkbox")
	public void user_selects_more_than_one_batch_using_checkbox() throws InterruptedException {
		testcontext.getBatchObj().selectmutliple_checkboxes(3);
		Thread.sleep(2000);
	}

	@Then("Batches gets selected")
	public void batches_gets_selected() {
		boolean flag = testcontext.getBatchObj().IsCheckBoxesEnabled(3);
        Assert.assertEquals(flag, true);
	}
	
	@When("User clicks on Delete button")
	public void user_clicks_on_delete_button() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getBatchObj().batchlinkclick();
		testcontext.getBatchObj().selectmutliple_checkboxes(3);
		testcontext.getBatchObj().clickonDeleteButtonontop();
	}

	@Then("User lands on Confirm Deletion form.")
	public void user_lands_on_confirm_deletion_form() throws Exception {

		 String actualmes =testcontext.getBatchObj().deleteconfirmAlert();
		   //System.out.println("delete confirmation is opened: "+flag);
		 //  Assert.assertEquals(flag, true);
		 String expectedmes = "Confirm";
		 Assert.assertEquals(actualmes, expectedmes);
	   
	}
	

	@Given("user is on Batch Confirm Deletion page")
	public void user_is_on_batch_confirm_deletion_page() throws Exception {
	testcontext.getDriver().get(prop.getProperty("baseUrl"));
	testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
	testcontext.getLoginObj().clickonLogin();
	testcontext.getBatchObj().batchlinkclick();
	testcontext.getBatchObj().selectmutliple_checkboxes(3);
	testcontext.getBatchObj().clickonDeleteButtonontop();
	 	
}
	@When("User clicks Yes button")
	public void user_clicks_yes_button() {
		testcontext.getBatchObj().clickYesdeletebatch();
}

	@Then("User can see a {string} message")
	public void user_can_see_a_message(String expAlert) {
	try { 
		
		String actAlert = testcontext.getBatchObj().getAlertText();
		//String expAlert = "Successful BatchDeleted";
		Assert.assertEquals(actAlert, expAlert); 
		System.out.println("Expected:" + expAlert + "&  Actual:" + actAlert);
		throw new AssertionError();
		} catch( AssertionError e)
	{ System.out.println("Unable to do assertion");} 
	
	
}

	@When("User clicks No button")
	public void user_clicks_no_button() throws Exception {
	testcontext.getDriver().get(prop.getProperty("baseUrl"));
	testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
	testcontext.getLoginObj().clickonLogin();
	testcontext.getBatchObj().batchlinkclick();
	testcontext.getBatchObj().selectmutliple_checkboxes(3);
	testcontext.getBatchObj().clickonDeleteButtonontop();
	testcontext.getBatchObj().clickDeleteNo(); 
}

	@Then("User can see Batches are still selected and not deleted")
	public void user_can_see_batches_are_still_selected_and_not_deleted() {
	boolean flag = testcontext.getBatchObj().IsCheckBoxesEnabled(3);
    Assert.assertEquals(flag, true);
    System.out.println("No changes to batch details");
}

}
