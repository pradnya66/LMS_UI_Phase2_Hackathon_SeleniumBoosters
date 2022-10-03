package BatchStepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Then;

public class NumberOfRecordsStepDefn extends BaseClass {
	
	

	TestContext testcontext;
	public NumberOfRecordsStepDefn(TestContext testcontext) {
		this.testcontext = testcontext;
	}
	
	@Then("Verify that number of records \\(rows of data in the table) displayed on the page are {int}")
	public void verify_that_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer  expectedrowcount) {
		
//		testcontext.getDriver().get(prop.getProperty("baseUrl"));
//		testcontext.getLoginObj().validLoginMethod();
//		testcontext.getBatchObj().batchlinkclick();
		System.out.println("Clicked on batch link and in batch page to check row count");
		int actrows = testcontext.getBatchObj().getRowCount();
		
		//Integer intObj = new Integer(actrows);
		int exptrowcount = expectedrowcount;
		System.out.println("ROW COUNT : "+actrows);
		
	Assert.assertEquals(actrows, exptrowcount);
	}


}
