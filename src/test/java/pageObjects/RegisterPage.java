package pageObjects;

import actions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RegisterPage {
    WebDriver driver;
    Action action = new Action();
    public RegisterPage(WebDriver d) {
        this.driver = d;
    }
    private By loginbtn = By.xpath("//button/span[@class= 'submitLoginBtn']");
    private By registrationBtn = By.xpath("//button/span[@class= 'registrationButton']");
    private By loginBtnText = By.xpath("//*[text()='logIn txt']");
    private By registerPageTitle = By.xpath("//*[text()='Registration Form']");
    private By firstName = By.xpath("//input[@id='firstname’]");
    private By lastName = By.xpath("//input[@id='lastname’]");
    private By addressHNo = By.xpath("//input[@type= 'text']");
    private By streetName = By.xpath("//input[@id= 'street']");
    private By city = By.xpath("//input[@id= 'city']");
    private By statedd = By.xpath("//input[@id= 'stateDropDown']");
    private By zipCode = By.xpath("//input[@id= 'postalCode']");
    private By birthDatePicker = By.xpath("//span[@id= 'BirthCalender");
    private By phoneNumber = By.xpath("//input[@id= 'contactNumber']");
    private By username = By.xpath("//input[@id= 'userName']");
    private By password = By.xpath("//input[@id= 'password']");
    private By email = By.xpath("//input[@type='text']");
    private By signUpBtn = By.xpath("//button/span[@class= 'submitSignUpBtn']");
    private By signUpBtnText = By.xpath("//*[text()='signUp txt']");
    private By BirthMonthYearPickerBtn = By.xpath("//span[@class='p-button-icon mn mn-calendar']");
    private By BirthDate = By.xpath("//span[text()='20']");
    private By BirthDateTextBox = By.xpath("//input[@id= 'datepicker']");
    private By MessageAlertFillAllRequiredFields = By.xpath("//alert[@message= 'fillrequiredfields']");
    private By MessageAlertValidFirstName = By.xpath("//alert[@message= 'fillvalidfirstname']");
    private By MessageAlertValidLastName = By.xpath("//alert[@message= 'fillvalidlastname']");
    private By MessageAlertValidAddress = By.xpath("//alert[@message= 'fillvalidaddress']");
    private By MessageAlertvalidStreet = By.xpath("//alert[@message= 'fillvalidstreet']");
    private By MessageAlertvalidCity = By.xpath("//alert[@message= 'fillvalidCity']");
    private By MessageAlertvalidState = By.xpath("//alert[@message= 'fillvalidState']");
    private By MessageAlertvaliemail = By.xpath("//alert[@message= 'fillvalidemail']");
    private By MessageAlertvalidPhoneNumber = By.xpath("//alert[@message= 'fillvalidPhoneNumber']");
    private By MessageAlertZipCode = By.xpath("//alert[@message= 'fillvalidZip']");
    private By MessageAlertvalidHouseNo = By.xpath("//alert[@message= 'fillvalidhouseNo']");
    private By MessageAlertvalidBirthDate = By.xpath("//alert[@message= 'fillvalidBirthDate']");
    private By MessageAlertvaliduserName = By.xpath("//alert[@message= 'fillvalidusername']");
    private By MessageAlertvalidPassword = By.xpath("//alert[@message= 'fillvalidPassword']");
    private By MessageAlertAlreadyExistingUsername =By.xpath("//alert[@message= 'alreadyExistinguser']");
    private By TitleSuccessfulRegistration = By.xpath("//title[@span= 'successful registration']");

    public void clickRegistrationLink() {
        WebElement registrationLink = driver.findElement(registrationBtn);
        action.click((By) registrationLink, driver);
    }
    public String shouldShowRegistrationFormTitle() {
        WebElement RegisterTitle = driver.findElement(registerPageTitle);
        return action.getText(registerPageTitle, driver);
    }
    public String shouldShowLogInBtnText() {
        WebElement LogInBtnText = driver.findElement(loginBtnText);
        return action.getText(loginBtnText, driver);
    }
    public void clickLoginBtn() {
        WebElement LogInBtn = driver.findElement(loginbtn);
        action.click(loginbtn, driver);
    }
    public String shouldShowSignUpBtnText() {
        WebElement SignUpBtnText = driver.findElement(signUpBtnText);
        return action.getText(signUpBtnText, driver);
    }
    public void shouldFillFirstName(String FirstName) {
        action.type(firstName, driver, FirstName);
    }

    public String getTextFirstName(){
        return action.getText(firstName, driver);
    }
    public void shouldFillLastName(String LastName) {
        action.type(lastName, driver,LastName);
    }
    public String getTextLasttName() {
        return action.getText(lastName, driver);
    }
    public void shouldFillAddress(String Address){
        action.type(addressHNo, driver,Address);
    }
    public String getTextAddress() {
        return action.getText(addressHNo, driver);
    }

    public void shouldFillStreetName(String StreetName) {
        action.type(streetName, driver, StreetName);
    }
    public String getTextStreetName() {
        return action.getText(streetName, driver);
    }
    public void shouldFillHouseNumber(String HouseNumber) {
        action.type(addressHNo, driver, HouseNumber);
    }
    public String getTextHouseNumber() {
        return action.getText(addressHNo, driver);
    }
    public void shouldFillZipCode(String ZipCode) {
        action.type(zipCode, driver, ZipCode);
    }
    public String getTextZipCode() {
        return action.getText(zipCode, driver);
    }

    public void shouldFillCity(String CityName) {
        action.type(city, driver,CityName);
    }
    public String getTextCity() {
        return action.getText(city, driver);
    }

    public void shouldSelectState(String StateName) {
        WebElement stateDrpDownEle = driver.findElement(statedd);
        action.scrollByVisibilityOfElement(driver, stateDrpDownEle);
        action.selectByVisibleText(StateName,stateDrpDownEle);
    }
    public String getTextState() {
        return action.getText(statedd, driver);
    }
    public void shouldFillPhoneNumber(String MobileNumber) {
        WebElement PhoneNumber = driver.findElement(phoneNumber);
        action.type(phoneNumber, driver, MobileNumber);
    }
    public String getTextPhoneNumber() {
        return action.getText(phoneNumber, driver);
    }

    public void shouldSelectBirthDate() {
        action.click(birthDatePicker, driver);
        action.click(BirthDate, driver);
        WebElement BirthMonthYr = driver.findElement(BirthMonthYearPickerBtn);
        action.click(BirthMonthYearPickerBtn, driver);
        action.selectByVisibleText("March 2014", BirthMonthYr);

    }
    public String getBirthDate() {
        return action.getText(BirthDateTextBox, driver);
    }

    public void shouldFillUniqueUsername(String UserName) {
        WebElement Username = driver.findElement(username);
        action.type(username, driver, UserName);
    }
    public String getTextUserName() {
        return action.getText(username, driver);
    }
    public void shouldFillValidPassword(String Password) {
        action.type(password, driver, Password);
    }
    public String getTextPassword() {
        return action.getText(password, driver);
    }
    //NOT INCLUDED IN CURRENT PROVIDED GHERKIN
    public void shouldFillEmail(){
      action.type(email, driver, "malaModi@gmail.com");
    }
    //Not INCLUDED IN CURRENT PROVIDED GHERKIN
    public String getTextEmail() {
        return action.getText(email, driver);
    }

    public void clickSubmitBtnWithAllFieldsEmpty() {
        action.click(signUpBtn, driver);
    }
    public String messageAlertFillAllFields(){
        return action.getText(MessageAlertFillAllRequiredFields, driver);
    }

    public void clickSignUpWithInvalidFirstName(String firstname) {
        action.type(firstName, driver, firstname);
        action.click(signUpBtn, driver);
    }
    public String messageAlertValidFirstName(){

        return action.getText(MessageAlertValidFirstName, driver);
    }
    public void clickSignUpWithInvalidLastName(String lastname) {
        action.type(lastName, driver,lastname);
        action.click(signUpBtn, driver);
    }
    public String messageAlertValidLastName(){
        return action.getText(MessageAlertValidLastName, driver);
    }

    public void clickSignUpWithInvalidAddress(String Address) {
        action.type(addressHNo, driver,Address);
        action.click(signUpBtn, driver);
    }
    public String messageAlertValidAddress(){
        return action.getText(MessageAlertValidAddress, driver);
    }

    public void clickSignUpWithInvalidStreetName(String StreetName) {
        action.type(streetName, driver, StreetName);
        action.click(signUpBtn, driver);
    }
    public String messageAlertValidStreet(){
        return action.getText(MessageAlertvalidStreet, driver);
    }
    public void clickSignUpWithInvalidHouseNumber(String HouseNumber) {
        action.type(addressHNo, driver, HouseNumber);
        action.click(signUpBtn, driver);
    }
    public String messageAlertValidHouseNumber(){
        return action.getText(MessageAlertvalidHouseNo, driver);
    }
    public void clickSignUpWithInvalidZip(String Zipcode) {
        action.type(zipCode, driver, Zipcode);
        action.click(signUpBtn, driver);
    }
    public String messageAlertValidZipCode(){
        return action.getText(MessageAlertZipCode, driver);
    }
    public void clickSignUpWithInvalidCity(String City) {
        action.type(city, driver, City);
        action.click(signUpBtn, driver);
    }
    public String messageAlertValidCity(){
        return action.getText(MessageAlertvalidCity, driver);
    }

    public void clickSignUpWithoutSelectingState() {
        WebElement stateDropDown = driver.findElement(statedd);
        action.scrollByVisibilityOfElement(driver, stateDropDown);
        action.click(signUpBtn, driver);
    }
    public String messageAlertValidState() {
        return action.getText(MessageAlertvalidState, driver);
    }
        public void clickSignUpWithInvalidPhoneNumber(String invalidPhoneNumber) {
        action.type(phoneNumber, driver, invalidPhoneNumber);
        action.click(signUpBtn, driver);
    }
        public String messageAlertValidPhoneNumber() {
            return action.getText(MessageAlertvalidPhoneNumber, driver);
        }

    public void clickSignUpWithoutSelectingBirthDate() {
        action.click(birthDatePicker, driver);
        action.click(signUpBtn, driver);
    }
    public String messageAlertValidBirthDate() {
        return action.getText(MessageAlertvalidBirthDate, driver);
    }
    public void clickSignUpWithInvalidUsername(String invalidUsername) {
        action.type(username, driver, invalidUsername);
        action.click(signUpBtn, driver);
    }
    public String messageAlertValidUserName() {
        return action.getText(MessageAlertvaliduserName, driver);
    }
    public void clickSignUpWithInvalidPassword(String invalidPassword) {
        action.type(password, driver,invalidPassword);
        action.click(signUpBtn, driver);
    }
    public String messageAlertValidPassword() {
        return action.getText(MessageAlertvalidPassword, driver);
    }
    public void clickSignUpWithAlreadyExistingUserName(String AlreadyUser) {
        action.type(username, driver,AlreadyUser);
        action.click(signUpBtn, driver);
    }
    public String messageAlertAlreadyExistingUsername() {
        return action.getText(MessageAlertAlreadyExistingUsername, driver);
    }
    //negative scenario not included in current provided gherkin
    public String messageAlertInvalidemail(){
        return action.getText(MessageAlertvaliemail, driver);
    }

    public void shouldGetRegistrationSuccessful() {
       

        action.type(firstName, driver, "Mala");
        action.type(lastName, driver, "Modi");
        action.type(addressHNo, driver, "#307 Address");
        action.type(streetName, driver, "Naya Nagar Road");
        action.type(addressHNo, driver, "#307");
        action.type(zipCode, driver, "15672");
        action.type(city, driver, "Narayana");
        WebElement stateDrpDownEle = driver.findElement(statedd);
        action.scrollByVisibilityOfElement(driver, stateDrpDownEle);
        action.selectByVisibleText("Haryana",stateDrpDownEle);
        WebElement PhoneNumber = driver.findElement(phoneNumber);
        action.type(phoneNumber, driver, "1234567891");
        action.click(birthDatePicker, driver);
        action.click(BirthDate, driver);
        WebElement BirthMonthYr = driver.findElement(BirthMonthYearPickerBtn);
        action.click(BirthMonthYearPickerBtn, driver);
        action.selectByVisibleText("March 2014", BirthMonthYr);
        WebElement Username = driver.findElement(username);
        action.type(username, driver, "malaModi");
        action.type(password, driver, "An7@ohgb");
        action.click(signUpBtn, driver);


    }
    public String shouldGetSuccessfulegistrationTitle(){
        return action.getText(TitleSuccessfulRegistration, driver);
    }


}
