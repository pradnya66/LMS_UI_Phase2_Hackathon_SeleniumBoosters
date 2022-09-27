package UserDetailsStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import base.BaseClass;
import base.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancelButtonStepDef extends BaseClass {
    TestContext testcontext;
    public CancelButtonStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }
    @Before
	public void initBrowser() throws Exception
	{
		System.out.println("Inside initBrowser");
		WebDriver driver = null;
		driver = launchBrowser();
			
		testcontext.setDriver(driver);
		
//		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.InitializePageObject(testcontext.getDriver());
		
	}
	   
	@Given("User is on the Manage user page")
	public void user_is_on_the_manage_user_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		Thread.sleep(3000);
		testcontext.getHomeObj().clickonUserTab();

	}
	@When("User clicks Add new user button on the page")
	public void User_clicks_Add_new_user_button_on_the_page() {

		testcontext.getUserObj().clickOnAddNewUserBtn();

	}

	@Then("User should see a button with text Cancel in user details window")
	public void User_should_see_a_button_with_text_Cancel_in_user_details_window() {
	Assert.assertTrue(testcontext.getUserObj().isDispalyedCancelBtn());

	}
	
	 @After
		public void teardown()
		{
			System.out.println("quiting the driver...");
			testcontext.getDriver().quit();
		}

}
