package BatchStepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBatchStepDefn extends BaseClass {

	TestContext testcontext;
	public SearchBatchStepDefn(TestContext testcontext) {
		this.testcontext = testcontext;
	}
	
	
@Given("User is on BatchPage")
public void user_is_on_batch_page() throws Exception {
	testcontext.getDriver().get(prop.getProperty("baseUrl"));
	testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
	testcontext.getLoginObj().clickonLogin();
	testcontext.getBatchObj().batchlinkclick();
	
	String title = testcontext.getBatchObj().getBatchPageTitle();
	
	System.out.println("User is on " + title);
}
	
	@When("user clicks on search box with {string} entered in it")
public void user_clicks_on_search_box_with_entered_in_it(String batchName) throws Exception {
		
		
		//testcontext.getBatchObj().batchlinkclick();
		testcontext.getBatchObj().enterTextInSearch(batchName);
		Thread.sleep(3000);

	}

	@Then("records of that  {string} are displayed")
	public void records_of_that_are_displayed(String 
		batchName) {
		List<WebElement> resultsList = testcontext.getBatchObj().getSearchResults();
		System.out.println("number of results we got with phrase:"+ resultsList.size());
		if (resultsList.size() !=0 ) {
			for (WebElement result : resultsList) {
				boolean flag = result.getText().contains(batchName);
				System.out.println("given search:" + batchName + " &  results:" + result.getText());
				Assert.assertEquals(flag, true);
			}
		} else {
			System.out.println("No results with the given phrase");
			Assert.assertEquals(testcontext.getBatchObj().getBottomText(), "Showing 0 to 0 of 0 entries");
		}
	}

	
	}

