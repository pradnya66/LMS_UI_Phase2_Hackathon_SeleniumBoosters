package BatchStepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchPagination extends BaseClass {
	
	TestContext testcontext;
	public BatchPagination(TestContext testcontext) {
		this.testcontext = testcontext;
	}

	@Given("User is logged on to LMS website -BatchPage")
	public void user_is_logged_on_to_lms_website_batch_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
	
	}
	@When("User is on first page of Manage Batch - BatchPage")
	public void user_is_on_first_page_of_manage_batch_batch_page() {
		testcontext.getBatchObj().batchlinkclick();  
		  Boolean page1 = testcontext.getBatchObj().page1IsEnable();
		   
		   if(page1) {
	           System.out.println("Yes ! User is on FirstPage of Manage Batch");
	     }
	     else {
	           System.out.println("NO ! User is not on first page of batch page");
	     }
		
	}
	@Then("Verify that previous link is disabled")
	public void verify_that_previous_link_is_disabled() {
	   
		 Boolean previouslink = testcontext.getBatchObj().batchpreviouslinkValidation();
		   
		   if(previouslink) {
	           System.out.println("Yes ! Previous link in batch first page is disabled");
	     }
	     else {
	           System.out.println("NO ! previous link in batch page is enabled");
	     }	   
			
	}
	
	@Given("User is on page number {string}")
	public void user_is_on_page_number(String string) throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getBatchObj().batchlinkclick();  
		
	}

	@When("User clicks next navigate > button")
	public void user_clicks_next_navigate_button() {
		testcontext.getBatchObj().nextlinkclick(); 
	 
	}

	@Then("User navigated to page number {string}")
	public void user_navigated_to_page_number(String expectedpagenumber) {
	  String actualpagelanded = testcontext.getBatchObj().getvaluepage2();
	  Assert.assertEquals(expectedpagenumber, actualpagelanded);
	
	}
	
	@When("User clicks previous navigate < button")
	public void user_clicks_previous_navigate_button() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getBatchObj().batchlinkclick();
		testcontext.getBatchObj().nextlinkclick();
		testcontext.getBatchObj().previouslinkclick();
	}

	@Then("User navigated to first page of manage batch")
	public void user_navigated_to_first_page_of_manage_batch() {
		String expectedpagenumber = "1";
		  String actualpagelanded = testcontext.getBatchObj().getvaluepage1();
		  Assert.assertEquals(expectedpagenumber, actualpagelanded);
	}
	@Given("User is logged on to lms Batch Page")
	public void user_is_logged_on_to_lms_Batch_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getBatchObj().batchlinkclick();
	}

	@When("User is on last page of Manage Batch")
	public void user_is_on_last_page_of_manage_batch() {
		testcontext.getBatchObj().lastpagelinkclick();
	}

	@Then("Verify that next link is disabled")
	public void verify_that_next_link_is_disabled() {
	   boolean actuallastlink = testcontext.getBatchObj().batchlastpagelinkValidation();
	   
	   if(actuallastlink) {
           System.out.println("Yes ! last page link in batch  page is disabled");
     }
     else {
           System.out.println("NO ! last page  link in batch page is enabled");
     }	   
		
	}

}
