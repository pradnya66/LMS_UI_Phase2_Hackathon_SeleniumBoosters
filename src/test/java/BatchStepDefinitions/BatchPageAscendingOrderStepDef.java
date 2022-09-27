package BatchStepDefinitions;

import java.util.Collections;
import java.util.List;

import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchPageAscendingOrderStepDef extends BaseClass {


	TestContext testcontext;

	public BatchPageAscendingOrderStepDef(TestContext testcontext) {
		this.testcontext = testcontext;
	}

	private List<String> beforeNameList;
	private List<String> beforeDescripList;
	private List<String> beforeStatusList;
	private List<String> beforeNoOfClassesList;
	private List<String> beforeProgNameList;

	@When("User is on Manage Batch page -BatchPage")
	public void user_is_on_manage_batch_page_batch_page() throws Exception {
		//testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getBatchObj().batchlinkclick();
	}

	@When("User clicks on BatchName sort button -BatchPage")
	public void user_clicks_on_batch_name_sort_button_batch_page() {
		// Getting the list of string in the assignment name column
		beforeNameList = testcontext.getBatchObj().getBatchNames();
		// Sorting in ascending way to compare the output results
		Collections.sort(beforeNameList);
		// clicking to get order in ascending order
		testcontext.getBatchObj().clickBatchNameSort();
	}
	

	@Then("User should see the results in Ascending order of Batch name -BatchPage")
	public void user_should_see_the_results_in_ascending_order_of_batch_name_batch_page() {
		List<String> afterNameList = testcontext.getBatchObj().getBatchNames();
		boolean flag = false;
		for (int i = 0; i < afterNameList.size(); i++) {
			if (afterNameList.get(i).equals(beforeNameList.get(i)))
				flag = true;
			else {
				flag = false;
				break;
			}
		}
		Assert.assertEquals(flag, false);
	}
	
	@Given("User is on Batch page -BatchPage")
	public void user_is_on_batch_page_batch_page() throws Exception {
		
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getBatchObj().batchlinkclick();
	}

	@When("User clicks on BatchDescription sort button -BatchPage")
	public void user_clicks_on_batch_description_sort_button_batch_page() {
		// Getting the list of string in the assignment description column
				beforeDescripList = testcontext.getBatchObj().getBatchDescriptions();
				// Sorting in ascending way to compare the output results
				Collections.sort(beforeDescripList, String.CASE_INSENSITIVE_ORDER);
				// clicking to get order in ascending order
				testcontext.getBatchObj().clickBatchDescriptionSort();
	}

	@Then("User should see the results in Ascending order of BatchDescription -BatchPage")
	public void user_should_see_the_results_in_ascending_order_of_batch_description_batch_page() {
		List<String> afterDescList = testcontext.getBatchObj().getBatchDescriptions();
		boolean flag = false;
		for (int i = 0; i < afterDescList.size(); i++) {
			if (afterDescList.get(i).equals(beforeDescripList.get(i)))
				flag = true;
			else {
				flag = false;
				break;
			}
		}
		Assert.assertEquals(flag, false);
	}

	@When("User clicks on Batchstatus sort button -BatchPage")
	public void user_clicks_on_batchstatus_sort_button_batch_page() {
		// Getting the list of string in the batch status column
		beforeStatusList = testcontext.getBatchObj().getBatchStatus();
		// Sorting in ascending way to compare the output results
		Collections.sort(beforeStatusList);
		// clicking to get order in ascending order
		testcontext.getBatchObj().clickBatchStatusSort();
	}

	@Then("User should see the results in Ascending order of Batch Status -BatchPage")
	public void user_should_see_the_results_in_ascending_order_of_batch_status_batch_page() {
		List<String> afterStatusList = testcontext.getBatchObj().getBatchStatus();
	boolean flag = false;
	for (int i = 0; i < afterStatusList.size(); i++) {
		if (afterStatusList.get(i).equals(beforeStatusList.get(i)))
			flag = true;
		else {
			flag = false;
			break;
		}
	}
	Assert.assertEquals(flag, false);
	}

	@When("User clicks on NumberOfClasses sort button -BatchPage")
	public void user_clicks_on_number_of_classes_sort_button_batch_page() {
		// Getting the list of string in the NoOfClasses column
				beforeNoOfClassesList = testcontext.getBatchObj().getNoOfClasses();
				// Sorting in ascending way to compare the output results
				Collections.sort(beforeNoOfClassesList);
				// clicking to get order in ascending order
				testcontext.getBatchObj().clickNoOfClassesSort();
	}

	@Then("User should see the results in Ascending order of NumberOfClasses -BatchPage")
	public void user_should_see_the_results_in_ascending_order_of_number_of_classes_batch_page() {
		List<String> afterNoOfClassesList = testcontext.getBatchObj().getNoOfClasses();
		boolean flag = false;
		for (int i = 0; i < afterNoOfClassesList.size(); i++) {
			if (afterNoOfClassesList.get(i).equals(beforeNoOfClassesList.get(i)))
				flag = true;
			else {
				flag = false;
				break;
			}
		}
		Assert.assertEquals(flag, false);
	}

	@When("User clicks on Program Name sort button -BatchPage")
	public void user_clicks_on_program_name_sort_button_batch_page() {
		// Getting the list of string in the program name of manage batch
		beforeProgNameList = testcontext.getBatchObj().getProgramNames();
		// Sorting in ascending way to compare the output results
		Collections.sort(beforeProgNameList);
		// clicking to get order in ascending order
		testcontext.getBatchObj().clickProgramNameSort();
	}

	@Then("User should see the results in Ascending order of Program Name -BatchPage")
	public void user_should_see_the_results_in_ascending_order_of_program_name_batch_page() {
		List<String> afterProgramNameList = testcontext.getBatchObj().getBatchStatus();
		boolean flag = false;
		for (int i = 0; i < afterProgramNameList.size(); i++) {
			if (afterProgramNameList.get(i).equals(beforeProgNameList.get(i)))
				flag = true;
			else {
				flag = false;
				break;
			}
		}
		Assert.assertEquals(flag, false);
	}



}
