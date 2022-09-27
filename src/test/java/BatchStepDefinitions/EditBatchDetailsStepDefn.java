package BatchStepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditBatchDetailsStepDefn extends BaseClass {

	
	TestContext testcontext;
	public EditBatchDetailsStepDefn(TestContext testcontext) {
		this.testcontext = testcontext;
		
	}
	@Given("User on BatchPage")
	public void user_on_batch_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		}
	


	@When("User clicks on batch Edit button")
	public void user_clicks_on_batch_edit_button() {
		testcontext.getBatchObj().batchlinkclick();
		testcontext.getBatchObj().clickonBatchEditBtn();
	}

	@Then("User lands on Batch Details form.")
	public void user_lands_on_batch_details_form() throws InterruptedException {
		 String actHeading = testcontext.getBatchObj().getBatchdetailsHeading();
		 String expHeading = "Batch Details";
		 System.out.println("Expected:"+expHeading+"&  Actual:"+actHeading);
		 Assert.assertEquals(actHeading, expHeading);
	}

	@Given("User is on Batch details page")
	public void user_is_on_batch_details_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getBatchObj().batchlinkclick();
		testcontext.getBatchObj().clickonBatchEditBtn();
	}

	@When("User edits Name batch name {string}")
	public void user_edits_name_batch_name(String BatchName) {
		testcontext.getBatchObj().editBatchName(BatchName);
		testcontext.getBatchObj().clickonBatchSaveBtn();
	}

	@Then("User can see edited Name {string}")
	public void user_can_see_edited_name(String expectedbatchname) {
	 
		String ActUpdbatchName  = testcontext.getBatchObj().getupdatedbatchname();
		Assert.assertEquals(ActUpdbatchName, expectedbatchname, "Batch Name is Updated");
	}

	@When("User edits batch Description {string}")
	public void user_edits_batch_description(String BatchDesc) {
	   testcontext.getBatchObj().editBatchDesc(BatchDesc);
	}

	@Then("User can see edited description {string}")
	public void user_can_see_edited_description(String expectedDescription) {
		String ActUpdDescription = testcontext.getBatchObj().getupdatedbatchname();
		Assert.assertEquals(ActUpdDescription, expectedDescription, "Description is Updated");
	}

	@When("user selects program name from drop down")
	public void user_selects_program_name_from_drop_down() {
		 testcontext.getBatchObj().batchlinkclick();
	 		testcontext.getBatchObj().clickonBatchEditBtn();
	   testcontext.getBatchObj().editprognamebatch();
		testcontext.getBatchObj().clickonBatchSaveBtn(); 
	}

	@Then("user can see selected program name")
	public void user_can_see_selected_program_name() {
	 System.out.println("Edited program name is :"+ prop.getProperty("programnameBatch"));
	}

	@When("user changes batch status to {string}")
	public void user_changes_batch_status_to(String string) throws Exception {
	  testcontext.getBatchObj().editProgramStatusActive();
	}

	@Then("User can see updated batch status {string}")
	public void user_can_see_updated_batch_status(String string) {
	   String actStatusupdated = testcontext.getBatchObj().getupdatedBatchStatus();
		//String ActUpdbatchName  = testcontext.getBatchObj().getupdatedbatchname();
		Assert.assertEquals(actStatusupdated, string, "Batch status is Updated");
	   
	}

	@When("user enters No Of Classes {string}")
	public void user_enters_no_of_classes(String string) {
	   testcontext.getBatchObj().editNoOfClasses(string);
	  
	}

	@Then("user can see updated No of classes {string}")
	public void user_can_see_updated_no_of_classes(String string) {
	 System.out.println("Updated No.OfClasses is:+ string");
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
	  
		 testcontext.getBatchObj().clickonBatchSaveBtn();
	}

	@Then("User can see {string} alert")
	public void user_can_see_alert(String string) {
		String actAlert = testcontext.getBatchObj().getAlertText();
		System.out.println("Expected:" + "Succesful Batch Created" + "&  Actual:" + actAlert);
		Assert.assertEquals(actAlert, "Succesful Batch Created");
	}

	@When("User searches with newly updated {string}")
	public void user_searches_with_newly_updated(String namePhrase) throws InterruptedException {
		testcontext.getBatchObj().clickOnSearch();
		testcontext.batchObj.enterTextInSearch(namePhrase);
		Thread.sleep(3000);
	}

	@Then("User verifies that the details are correctly updated.")
	public void user_verifies_that_the_details_are_correctly_updated() {
		List<WebElement> resultsList = testcontext.getBatchObj().getSearchResults();
		System.out.println("number of results we got with phrase:"+ resultsList.size());
		if (resultsList.size() !=0 ) {
			for (WebElement result : resultsList) {
				boolean flag = result.getText().contains("NNBatch12");
				System.out.println("given search:" + "NNBatch12" + " &  results:" + result.getText());
				Assert.assertEquals(flag, true);
			}
		} else {
			System.out.println("No results with the given phrase");
			Assert.assertEquals(testcontext.getBatchObj().getBottomText(), "Showing 0 to 0 of 0 entries");
		}
	}

	
}
