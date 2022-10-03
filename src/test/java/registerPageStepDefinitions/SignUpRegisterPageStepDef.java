package registerPageStepDefinitions;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignUpRegisterPageStepDef extends BaseClass {

    TestContext testcontext;
    public SignUpRegisterPageStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }
    @Given("User is on LMS website")
    public void user_is_on_lms_website() throws Exception {
        System.out.println("Opened Browser");
        WebDriver driver = null;
        driver = launchBrowser();

        testcontext.setDriver(driver);
        testcontext.getDriver().get(prop.getProperty("baseUrl"));
        testcontext.InitializePageObject(testcontext.getDriver());
        throw new io.cucumber.java.PendingException();
    }

    @When("User lands on Registration page")
    public void user_lands_on_registration_page() {
        testcontext.getRegisterObj().clickRegistrationLink();
        throw new io.cucumber.java.PendingException();
    }

    @Then("User sees a button with text {string} on the form")
    public void user_sees_a_button_with_text_on_the_form(String ExpTitle) {
        String ActTitle = testcontext.getRegisterObj().shouldShowSignUpBtnText();
        System.out.println("Title got loaded is " + ActTitle);
        Assert.assertEquals(ActTitle, ExpTitle);
        System.out.println("User is on Register Page");
        throw new io.cucumber.java.PendingException();
    }

}
