package registerPageStepDefinitions;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ValidatingTextOnRegisterPageStepDef extends BaseClass {

    TestContext testcontext;

    public ValidatingTextOnRegisterPageStepDef(TestContext testcontext) {
        this.testcontext = testcontext;
    }

    @Given("User is on the Registeration Page")
    public void user_is_on_the_registeration_page() throws Exception {
        System.out.println("Opened Browser");
        WebDriver driver = null;
        driver = launchBrowser();

        testcontext.setDriver(driver);
        testcontext.getDriver().get(prop.getProperty("baseUrl"));
        testcontext.InitializePageObject(testcontext.getDriver());
        throw new io.cucumber.java.PendingException();
    }


    @When("User fills the First Name in Alphabets only{string}")
    public void user_fills_the_first_name_in_alphabets_only(String FirstName) {
        testcontext.getRegisterObj().shouldFillFirstName(FirstName);
    }

    @Then("The First Name will be displayed {string}")
    public void the_first_name_will_be_displayed(String ExpFirstName) {
        String firstnameInput = testcontext.getRegisterObj().getTextFirstName();
        System.out.println("Title got loaded is " + firstnameInput);
        Assert.assertEquals(firstnameInput, ExpFirstName);
        System.out.println("validity of First Name");
    }
    @When("User fills the Last Name in Alphabets only {string}")
    public void user_fills_the_last_name_in_alphabets_only(String LastName) {
        testcontext.getRegisterObj().shouldFillLastName(LastName);
    }
    @Then("The Last Name will be displayed {string}")
    public void the_last_name_will_be_displayed(String ExpLastName) {
        String lastnameInput = testcontext.getRegisterObj().getTextLasttName();
        System.out.println("Title got loaded is " + lastnameInput);
        Assert.assertEquals(lastnameInput, ExpLastName);
        System.out.println("validity of Last Name");
    }

    @When("User fills the Address Field using Alpha Numerics and or Symbols {string}")
    public void user_fills_the_address_field_using_alpha_numerics_and_or_symbols(String Address) {
        testcontext.getRegisterObj().shouldFillAddress(Address);
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Address will be displayed {string}")
    public void the_address_will_be_displayed(String ExpAddress) {
        String AddressInput = testcontext.getRegisterObj().getTextAddress();
        System.out.println("Title got loaded is " + AddressInput);
        Assert.assertEquals(AddressInput, ExpAddress);
        System.out.println("Address Verified");
        throw new io.cucumber.java.PendingException();
    }

    @When("User fills the Street name Field using Alpha Numerics and or Symbols {string}")
    public void user_fills_the_street_name_field_using_alpha_numerics_and_or_symbols(String StreetName) {
        testcontext.getRegisterObj().shouldFillStreetName(StreetName);
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Street Name will be displayed {string}")
    public void the_street_name_will_be_displayed(String ExpStreet) {
        String streetInput = testcontext.getRegisterObj().getTextStreetName();
        System.out.println("Title got loaded is " + streetInput);
        Assert.assertEquals(streetInput,ExpStreet);
        System.out.println("Street Name Verified");
        throw new io.cucumber.java.PendingException();
    }

    @When("User fills the House Number field using Alpha Numerics and or Symbols {string}")
    public void user_fills_the_house_number_field_using_alpha_numerics_and_or_symbols(String HouseNumber) {
        testcontext.getRegisterObj().shouldFillHouseNumber(HouseNumber);
        throw new io.cucumber.java.PendingException();
    }

    @Then("The House Number will be displayed {string}")
    public void the_house_number_will_be_displayed(String ExpHouse) {
        String HouseNoInput = testcontext.getRegisterObj().getTextHouseNumber();
        System.out.println("Title got loaded is " + HouseNoInput);
        Assert.assertEquals(HouseNoInput, ExpHouse);
        System.out.println("House Number Verified");
        throw new io.cucumber.java.PendingException();
    }

    @When("User fills the digit Zip code using Numbers only {string}")
    public void user_fills_the_digit_zip_code_using_numbers_only(String zipCode) {
        testcontext.getRegisterObj().shouldFillZipCode(zipCode);
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Zip code will be displayed {string}")
    public void the_zip_code_will_be_displayed(String ExpZip) {
        String zipCodeInput = testcontext.getRegisterObj().getTextZipCode();
        System.out.println("Title got loaded is " + zipCodeInput);
        Assert.assertEquals(zipCodeInput, ExpZip);
        System.out.println("zipcode validated");
        throw new io.cucumber.java.PendingException();
    }
    @When("User fills the City Name in Alphabets only {string}")
    public void user_fills_the_city_name_in_alphabets_only(String city) {
        testcontext.getRegisterObj().shouldFillCity(city);
        throw new io.cucumber.java.PendingException();
    }

    @Then("The City Name will be displayed {string}")
    public void the_city_name_will_be_displayed(String ExpCity) {
        String cityInput = testcontext.getRegisterObj().getTextCity();
        System.out.println("Title got loaded is " + cityInput);
        Assert.assertEquals(cityInput, ExpCity);
        System.out.println("city validated");
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects the respective State Name from the DropBox {string}")
    public void user_selects_the_respective_state_name_from_the_drop_box(String state) {
        testcontext.getRegisterObj().shouldSelectState(state);
        throw new io.cucumber.java.PendingException();
    }

    @Then("The State Name will be displayed {string}")
    public void the_state_name_will_be_displayed(String ExpState) {
        String stateInput = testcontext.getRegisterObj().getTextState();
        System.out.println("Title got loaded is " + stateInput);
        Assert.assertEquals(stateInput, ExpState);
        System.out.println("state selection verified");
        throw new io.cucumber.java.PendingException();
    }

    @When("User fills the valid digit Mobile number in Numerics {string}")
    public void user_fills_the_valid_digit_mobile_number_in_numerics(String MobileNumber) {
        testcontext.getRegisterObj().shouldFillPhoneNumber(MobileNumber);
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Mobile Number will be displayed {string}")
    public void the_mobile_number_will_be_displayed(String ExpPhone) {
        String PhoneInput = testcontext.getRegisterObj().getTextPhoneNumber();
        System.out.println("Title got loaded is " + PhoneInput);
        Assert.assertEquals(PhoneInput,ExpPhone);
        System.out.println("state selection verified");
        throw new io.cucumber.java.PendingException();
    }

    @When("User Selects the Date of Birth from the Calender")
    public void user_selects_the_date_of_birth_from_the_calender() {
        testcontext.getRegisterObj().shouldSelectBirthDate();
        throw new io.cucumber.java.PendingException();
    }

    @Then("Birth Date will be Displayed {string}")
    public void birth_date_will_be_displayed(String ExpBirthDate) {
        String BirhDateInput = testcontext.getRegisterObj().getBirthDate();
        System.out.println("Title got loaded is " + BirhDateInput);
        Assert.assertEquals(BirhDateInput, ExpBirthDate);
        System.out.println("birth date verified");
        throw new io.cucumber.java.PendingException();
    }

    @When("User fills the valid unique UserName")
    public void user_fills_the_valid_unique_user_name(String username) {
        testcontext.getRegisterObj().shouldFillUniqueUsername(username);
        throw new io.cucumber.java.PendingException();
    }

    @Then("UserName will be displayed {string}")
    public void user_name_will_be_displayed(String ExpUsername) {
        String usernameInput = testcontext.getRegisterObj().getTextUserName();
        System.out.println("Title got loaded is " + usernameInput);
        Assert.assertEquals(usernameInput, ExpUsername);
        System.out.println("username verified");
        throw new io.cucumber.java.PendingException();
    }

    @When("User fills the valid Password")
    public void user_fills_the_valid_password_with_upper_case_numeric_and_special_charecter_and_charecters(String Password) {
        testcontext.getRegisterObj().shouldFillValidPassword(Password);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User Password will  be displayed")
    public void user_password_will_be_displayed(String ExpPassword) {
        String passwordInput = testcontext.getRegisterObj().getTextPassword();
        System.out.println("Title got loaded is " + passwordInput);
        Assert.assertEquals(passwordInput, ExpPassword);
        System.out.println("password verified");
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters submit button with all fields empty")
    public void user_enters_submit_button_with_all_fields_empty() {
        testcontext.getRegisterObj().clickSubmitBtnWithAllFieldsEmpty();
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message_please_fill_all_fields_above(String ExpAlert) {
       String ActMessageAlert = testcontext.getRegisterObj().messageAlertFillAllFields();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert,ExpAlert);
        System.out.println("sign Up Button verified");
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Sign Up button with invalid First Name")
    public void user_clicks_sign_up_button_with_invalid_first_name(String invalidFirstNme ) {
        testcontext.getRegisterObj().clickSignUpWithInvalidFirstName(invalidFirstNme);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message_please_fill_valid_first_name(String ExpAlert) {
        String ActMessageAlert = testcontext.getRegisterObj().messageAlertValidFirstName();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert, ExpAlert);
        System.out.println("first name negative scenario executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Sign Up button with invalid Last Name")
    public void user_clicks_sign_up_button_with_invalid_last_name(String invalidLastName) {
        testcontext.getRegisterObj().clickSignUpWithInvalidLastName(invalidLastName);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message_please_fill_valid_last_name(String ExpAlert) {
        String ActMessageAlert = testcontext.getRegisterObj().messageAlertValidLastName();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert,ExpAlert);
        System.out.println("last name negative scenario executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Sign Up button with invalid Address")
    public void user_clicks_sign_up_button_with_invalid_address(String invalidAddress) {
        testcontext.getRegisterObj().clickSignUpWithInvalidAddress(invalidAddress);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message_please_fill_valid_address(String ExpAlert) {
        String ActMessageAlert = testcontext.getRegisterObj().messageAlertValidAddress();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert,ExpAlert);
        System.out.println("Address negative scenario executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Sign Up button with invalid Street Name")
    public void user_clicks_sign_up_button_with_invalid_street_name(String invalidStreetName) {
        testcontext.getRegisterObj().clickSignUpWithInvalidStreetName(invalidStreetName);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message_please_fill_valid_street_name(String ExpAlert) {
        String ActMessageAlert = testcontext.getRegisterObj().messageAlertValidStreet();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert, ExpAlert);
        System.out.println("Street negative scenario executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Sign Up button with invalid House Number")
    public void user_clicks_sign_up_button_with_invalid_house_number(String invalidHouseNumber) {
        testcontext.getRegisterObj().clickSignUpWithInvalidHouseNumber(invalidHouseNumber);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message_please_fill_valid_house_number(String ExpAlert) {
        String ActMessageAlert = testcontext.getRegisterObj().messageAlertValidHouseNumber();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert, ExpAlert);
        System.out.println("House Number negative scenario executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Sign Up button with invalid Zip")
    public void user_clicks_sign_up_button_with_invalid_zip(String invalidZip) {
        testcontext.getRegisterObj().clickSignUpWithInvalidZip(invalidZip);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message_please_fill_valid_zip(String ExpAlert) {
        String ActMessageAlert = testcontext.getRegisterObj().messageAlertValidZipCode();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert, ExpAlert);
        System.out.println("zip negative scenario executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Sign Up button with invalid  City")
    public void user_clicks_sign_up_button_with_invalid_city(String invalidCity) {
        testcontext.getRegisterObj().clickSignUpWithInvalidCity(invalidCity);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message_please_fill_valid_city(String ExpAlert) {
        String ActMessageAlert = testcontext.getRegisterObj().messageAlertValidCity();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert, ExpAlert);
        System.out.println("city negative scenario executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Sign Up button without selecting  State")
    public void user_clicks_sign_up_button_without_selecting_state() {
        testcontext.getRegisterObj().clickSignUpWithoutSelectingState();
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message_please_select_state(String ExpAlert) {
        String ActMessageAlert = testcontext.getRegisterObj().messageAlertValidState();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert, ExpAlert);
        System.out.println("state negative scenario executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Sign Up button with invalid Phone Number")
    public void user_clicks_sign_up_button_with_invalid_phone_number(String PhoneNumber) {
        testcontext.getRegisterObj().clickSignUpWithInvalidPhoneNumber(PhoneNumber);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message_please_fill_valid_phone_number(String ExpAlert) {
        String ActMessageAlert = testcontext.getRegisterObj().messageAlertValidPhoneNumber();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert, ExpAlert);
        System.out.println("phone number negative scenario executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Sign Up button without selecting BirthDate")
    public void user_clicks_sign_up_button_without_selecting_birth_date() {
        testcontext.getRegisterObj().clickSignUpWithoutSelectingBirthDate();
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message_please_select_birth_date(String ExpAlert) {
        String ActMessageAlert = testcontext.getRegisterObj().messageAlertValidBirthDate();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert,ExpAlert);
        System.out.println("negative scenario Birth Date executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Sign Up button with invalid UserName {string}")
    public void user_clicks_sign_up_button_with_invalid_user_name(String Username) {
        testcontext.getRegisterObj().clickSignUpWithInvalidUsername(Username);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message Please fill valid UserName {string}")
    public void user_should_get_a_message_please_fill_valid_user_name(String ExpAlert) {
        String ActMessageAlert = testcontext.getRegisterObj().messageAlertValidUserName();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert, ExpAlert);
        System.out.println("negative scenario username executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Sign Up button with invalid Password")
    public void user_clicks_sign_up_button_with_invalid_password(String Password) {
        testcontext.getRegisterObj().clickSignUpWithInvalidPassword(Password);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message(String ExpPassword) {
        String MessageAlert = testcontext.getRegisterObj().messageAlertValidPassword();
        System.out.println("Title got loaded is " + MessageAlert);
        Assert.assertEquals(MessageAlert, ExpPassword);
        System.out.println("negative scenario Password executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("USer clicks Sign Up button with existing User name")
    public void u_ser_clicks_sign_up_button_with_existing_user_name(String userName) {
        testcontext.getRegisterObj().clickSignUpWithAlreadyExistingUserName(userName);
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should see the message {string}")
    public void user_should_see_the_message(String ExpAlert) {
        String ActMessageAlert = testcontext.getRegisterObj().messageAlertAlreadyExistingUsername();
        System.out.println("Title got loaded is " + ActMessageAlert);
        Assert.assertEquals(ActMessageAlert,ExpAlert);
        System.out.println("negative scenario username executed");
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters all Field value and click {string} button.")
    public void user_enters_all_field_value_and_click_button(String string) {
        testcontext.getRegisterObj().shouldGetRegistrationSuccessful();
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should get a message {string}")
    public void user_should_get_a_message_registeration_successful(String ExpTitle) {
        String ActTitle= testcontext.getRegisterObj().shouldGetSuccessfulegistrationTitle();
        System.out.println("Title got loaded is " + ActTitle);
        Assert.assertEquals(ActTitle,ExpTitle);
        System.out.println("negative scenario username executed");
        throw new io.cucumber.java.PendingException();
    }

}
