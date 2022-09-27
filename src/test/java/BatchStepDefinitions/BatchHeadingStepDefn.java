package BatchStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchHeadingStepDefn extends BaseClass {

	TestContext testcontext;
	public BatchHeadingStepDefn(TestContext testcontext) {
		this.testcontext = testcontext;
	}
	@Before
	public void initBrowser() throws Exception
	{
		System.out.println("Inside initBrowser");
		WebDriver driver = null;
		driver = launchBrowser();
			
		testcontext.setDriver(driver);
		
		
		testcontext.InitializePageObject(testcontext.getDriver());
	}
	
	
	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		   System.out.println("now user is on HomePage");
	
		
	}

	@When("User is on Batch page")
	public void user_is_on_batch_page() throws Exception {
		testcontext.getBatchObj().batchlinkclick();	
		String title = testcontext.getBatchObj().getBatchPageTitle();
		System.out.println("User is on " + title);
		System.out.println("Before Clickin on batch link on top of homeppage");
		
		
		System.out.println("Clicked on batch link");
		Thread.sleep(10000);
	}

	@Then("User should see a heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String expHeading) {
		//System.out.println("Skipping assertion");
		  String actHeading = testcontext.getBatchObj().getHeading();
		   System.out.println("Expected:"+expHeading+"&  Actual:"+actHeading);
		   Assert.assertEquals(actHeading, expHeading);
	 
	}

	@After
	public void teardown()
	{
		System.out.println("quiting the driver...");
		testcontext.getDriver().quit();
	}
	
}

