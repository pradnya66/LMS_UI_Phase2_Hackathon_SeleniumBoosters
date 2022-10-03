package BatchStepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewBatch extends BaseClass {
	
	TestContext testcontext;
	public  AddNewBatch(TestContext testcontext) {
		this.testcontext = testcontext;
	
	}
	@Given("User on Batch page")
	public void user_on_batch_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		
	}

	@When("User clicks <A New Batch> button")
	public void user_clicks_a_new_batch_button()  {
		testcontext.getBatchObj().batchlinkclick();
		testcontext.getBatchObj().addNewBatch();
		
	}

	@Then("user can see Batch details form")
	public void user_can_see_batch_details_form() throws InterruptedException {
		 String actHeading = testcontext.getBatchObj().getBatchdetailsHeading();
					 String expHeading = "Batch Details";
		  System.out.println("Expected:"+expHeading+"&  Actual:"+actHeading);
		   Assert.assertEquals(actHeading, expHeading);
		   
	    
	}
	
	@When("User clicks <Save> button with empty fields")
	public void user_clicks_save_button_with_empty_fields() throws InterruptedException {
		testcontext.getBatchObj().batchlinkclick();
		testcontext.getBatchObj().addNewBatch();
		testcontext.getBatchObj().clickonBatchSaveBtn();
		
	}

	@Then("User gets message {string}")
	public void user_gets_message(String ExpNameReqMsg) throws InterruptedException {
		//Thread.sleep(5000);
		testcontext.getBatchObj().addNewBatch();
		testcontext.getBatchObj().clickonBatchSaveBtn();
		String ActNameReqMsg = testcontext.getBatchObj().getNameReqMsg();
		System.out.println("ActNameReqMsg = " +ActNameReqMsg);
		Assert.assertEquals(ActNameReqMsg, ExpNameReqMsg, "Name is required."); 
		
	}
	
	@When("User clicks Cancel button")
	public void user_clicks_cancel_button() {
		
		testcontext.getBatchObj().clickonBatchCancelBtn();
	}

	@Then("User can see Batch Details form disappears")
	public void user_can_see_batch_details_form_disappears() {
		 String BatchPageHeading = testcontext.getBatchObj().getHeading();
		  Assert.assertEquals(BatchPageHeading, "Manage Batch");
	}
	

@When("User enters Batch Name {string} in text box")
	public void user_enters_name_in_text_box(String BatchName) {
		 testcontext.getBatchObj().AddBatchName(BatchName);
}

@Then("User can see Name {string} entered")
public void user_can_see_name_entered(String BatchName) {
	 //testcontext.getBatchObj().AddBatchName(BatchName);
	 System.out.println("BatchNAme entered is" +BatchName);
	String ActTextfromBatchNameTextBox = testcontext.getBatchObj().getBatcNamefromNameTextBox();
	System.out.println("ActTextfromBatchNameTextBox = " +ActTextfromBatchNameTextBox);
	 Assert.assertEquals(ActTextfromBatchNameTextBox, BatchName, "Batch Name can be seen");	
}

@When("User enters Description {string}  description text box")
public void user_enters_description_description_text_box(String Description) {
	 testcontext.getBatchObj().AddDescription(Description);
}

@Then("User can see description Name {string} entered")
public void user_can_see_description_name_entered(String desc) {
	System.out.println("Description entered is" +desc);
	String ActTextfromDescriptionTextBox = testcontext.getBatchObj().getDescriptionfromNameTextBox();
	 Assert.assertEquals(ActTextfromDescriptionTextBox, desc, "Batch Name can be seen");	
}

@When("User selects Program name")
public void user_selects_program_name() {
   
}

@Then("User can see {string} selected")
public void user_can_see_selected(String string) {
 
}

@When("User selects Status Active <Status> using radiobutton")
public void user_selects_status_active_status_using_radiobutton() throws Exception {
	testcontext.getBatchObj().editProgramStatusActive();
}

@Then("User can see {string} status selected")
public void user_can_see_status_selected(String Active) {
	boolean flag = testcontext.getBatchObj().checkIfActiveStatBtnisSelected();
	System.out.println("Flag =" + flag);
	Assert.assertTrue(flag, "Active Status Btn is Selected");
	System.out.println("Expected status is:"  +Active);
}

@When("User enters No of classes {string} in text box")
public void user_enters_no_of_classes_in_text_box(String NumOfClasses) {
	 testcontext.getBatchObj().AddNoOfclasses(NumOfClasses);
}

@Then("User can see No of classes {string} entered")
public void user_can_see_no_of_classes_entered(String string) {
   System.out.println("Number of Classes Entered is:" +string);
}

@When("User clicks Save button")
public void user_clicks_save_button() {
	 testcontext.getBatchObj().clickonBatchSaveBtn();
}

@Then("User gets Successful batch created message")
public void user_gets_Successful_batch_created_message() {
	String actAlert = testcontext.getBatchObj().getAlertText();
	System.out.println("Expected:" + "Succesful Batch Created" + "&  Actual:" + actAlert);
	Assert.assertEquals(actAlert, "Succesful Batch Created");
}

@When("User searches with newly created batch {string}")
public void user_searches_with_newly_created_batch(String namePhrase) throws InterruptedException {
	testcontext.getBatchObj().clickOnSearch();
	testcontext.batchObj.enterTextInSearch(namePhrase);
	Thread.sleep(3000);
}

@Then("records of the newly created batchname  {string} is displayed")
public void records_of_the_newly_created_batchname_is_displayed(String namePhrase) {
	List<WebElement> resultsList = testcontext.getBatchObj().getSearchResults();
	System.out.println("number of results we got with phrase:"+ resultsList.size());
	if (resultsList.size() !=0 ) {
		for (WebElement result : resultsList) {
			boolean flag = result.getText().contains(namePhrase);
			System.out.println("given search:" + namePhrase + " &  results:" + result.getText());
			Assert.assertEquals(flag, true);
		}
	} else {
		System.out.println("No results with the given phrase");
		Assert.assertEquals(testcontext.getBatchObj().getBottomText(), "Showing 0 to 0 of 0 entries");
	}
  
}



}
