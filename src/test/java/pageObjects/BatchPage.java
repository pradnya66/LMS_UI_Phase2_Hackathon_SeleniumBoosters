package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import actions.Action;
import base.BaseClass;

public class BatchPage extends BaseClass {
	WebDriver driver;
	Action action = new Action();
	LogInPage loginpageObj = new LogInPage(driver);
	
	public BatchPage(WebDriver driver){
		this.driver = driver;
	}
	

		private By Search_box = By.xpath("//input[@Class = 'p-inputtext p-component']");		
		private By Search_icon = By.xpath("//div/span/i[@class='pi pi-search']");		
		private By showing0_of_0 = By.xpath("//div/span[@class='p-paginator-current ng-star-inserted']/text()");	
		
		private By delete_btn_top = By.xpath("//div/div/button[@icon='pi pi-trash']");
		private By deletedialogbox = By.xpath("//div[@class='p-dialog-header ng-tns-c133-7 ng-star-inserted']");	
		
		private By BatchCheckBox = By.xpath("//tr[1]/td[1]/p-tablecheckbox/div/div[2]");
		private By checksTrail = By.xpath("//tbody //div[@role='checkbox']");
				
		private By BatchCheckBoxes = By.xpath("//tr/td[1]/p-tablecheckbox/div/div[2]");
		
		// add Batch Details window
		
		private	By addnewbatch = By.xpath("//button[@label='A New Batch']");
		private By BatchStatusActiveBtn = By.xpath("(//div[@class='ng-star-inserted'][1]");
		private By batchName = By.xpath("//input[@id='batchName']");
		private By batchDescription = By.xpath("//input[@id='batchDescription']");
		private By BatchSaveBtn = By.xpath("//button[@class='p-button-rounded p-button-success p-button p-component ng-star-inserted']");		
		private	By editbatch_btn = By.xpath("//tr[1]//button[@icon='pi pi-pencil']]");

		private By BatchNameSort = By.xpath("//th[2]/p-sorticon[@field='programName']");
		private By DescriptionSort = By.xpath("//th[3]/p-sorticon[@field='batchDescription']");
		private By BatchStatusSort = By.xpath("//th[4]/p-sorticon[@field='batchStatus']");
		private By NoOfClassesSort = By.xpath("//th[5]/p-sorticon[@field='batchNoOfClasses']");
		private By ProgramNameSort = By.xpath("//th[6]/p-sorticon[@field='programName']");
		
		private	By batchlink_ontop = By.xpath("//button[@routerlink='/batch']/span[1]");

		private By batchHeading = By.xpath("//div[@class='box'][1]");
		
		private By batchDetailsHeading = By.xpath("//div/span[text()='Batch Details']");
		
		private By BatchBottomText = By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
		
		private By firstrowbatchtable = By.xpath("//table[@role = 'grid']//tbody/tr");
		
		private By BatchSearchList = By.xpath("//tbody/tr/td[2]");
		private By BatchDescriptions = By.xpath("//tbody/tr/td[3]");
		private By BatchStatus = By.xpath("//tbody/tr/td[4]");
		private By NoOfClasses = By.xpath("//tbody/tr/td[5]");
		private By ProgramNames = By.xpath("//tbody/tr/td[6]");
		
		
	
		private By dropdown = By.xpath("//input[@aria-haspopup='listbox']");				

		//status Active radiobutton

		private By statusActive = By.xpath("//p-dialog/div/div/div[2]/div[4]/div[2]/p-radiobutton/div/div[2]/span");


		//status Inactive radiobutton
		private By statusInActive = By.xpath("//p-dialog/div/div/div[2]/div[4]/div[3]/p-radiobutton/div/div[2]/span");

		//number of classes

		private By noOfClasses = By.xpath("//input[@id='batchNoOfClasses']");

		//Cancel button

		private By BatchCancelBtn = By.xpath("//div[@class='p-dialog-footer ng-tns-c132-21 ng-star-inserted']/button//span[text()='Cancel']");

		//save button batch details

		private By savebtn = By.xpath("//span[text()='Save']");


		//scroll down of batch details window

		private By scrollbar = By.xpath("//p-dialog/div/div/div[3]/button[2]/span[2]");

		
		
		private By firstrowBatchname = By.xpath("//tr[1]/td[2]");
		
		private By firstbatchName = By.xpath("//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted'][1]/td[2]");
		private By firstdescritpionName = By.xpath("//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted'][1]/td[3]");
		private By firstbatchStatus = By.xpath("//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted'][1]/td[4]");
		private By firstProgramName = By.xpath("//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted'][1]/td[6]");
		private By updatedNoOfClasses = By.xpath("//tbody[@class='p-datatable-tbody']/tr[@class='ng-star-inserted'][1]/td[5]");
		private By progdropdown = By.xpath("//div[@class='p-dropdown-trigger ng-tns-c101-15']");
		private By dropdnlist = By.xpath("//p-dropdownitem");
		private By deletebatchClickYes = By.xpath("//span[contains(text(),'Yes')]");
		private By deleteNo = By.xpath("//span[contains(text(),'No')]");
		private By AlertMsg1 = By.xpath("//div[@role='alert']/div/div[1]");
		private By AlertMsg2 = By.xpath("//div[@role='alert']/div/div[2]");
		private By NameReqMsg = By.xpath("//div/small[text()='Name is required.']");
		private By deletebtn1 = By.xpath("//tr[1]//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']");
		private By page1 = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span[2]/button[1]");
		private By batchpreviouslinkdisabled = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']//button[2]/span[@class='p-paginator-icon pi pi-angle-left']");
		private By nextlink = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']//button[@class='p-paginator-next p-paginator-element p-link p-ripple']");
		private By page2 = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span[2]/button[2]");
		private By batchpreviouslinkenabled = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']//button[2]/span[@class='p-paginator-icon pi pi-angle-left']");
		private By lastpagelink = By.xpath("//div/button[4]");
		
	
		public String getBatcNamefromNameTextBox() {
			String ActbatchNameEnt = action.getText(batchName, driver);
			return ActbatchNameEnt; 
			
		}
		public String getDescriptionfromNameTextBox() {
			String ActDescriptionEnt = action.getText(batchDescription, driver);
			return ActDescriptionEnt; 
			
		}
		public String AddBatchName(String BatchName) {
					
					action.type(batchName, driver, BatchName);
						return BatchName;
		}
		public String AddDescription(String Description) {
			
			action.type(batchDescription, driver, Description);
				return Description;
}
		
		public String AddNoOfclasses(String NumOfClasses) {
			
			action.type(noOfClasses, driver, NumOfClasses);
				return NumOfClasses;
}
		
		public String getNameReqMsg() {
			//return action.getText(NameReqMsg, driver);
			return driver.findElement(NameReqMsg).getAttribute("innerHTML");
		}
		
		public void editProgramStatusActive() throws Exception {
			Thread.sleep(5000);
			action.click(BatchStatusActiveBtn, driver);
		}
		
		public boolean checkIfActiveStatBtnisSelected() {
			boolean flag = action.isSelected(BatchStatusActiveBtn, driver);
			return flag;
			}
		
		public boolean page1IsEnable()
		{
			  Boolean pagenumber1 = action.isEnabled(page1,driver);
			     return pagenumber1;
			
		}
		
		public boolean batchpreviouslinkValidation()
		{
			 Boolean previouslink = action.isEnabled(batchpreviouslinkdisabled,driver);
		     return previouslink;
		}
		
		public void nextlinkclick()
		{
			action.click(nextlink, driver);
		}
		
		public void previouslinkclick()
		{
			action.click(batchpreviouslinkenabled, driver);
		}
		
		public void lastpagelinkclick()
		{
			action.click(lastpagelink, driver);
		}
		
		public void clickBatchNameSort() {
			action.click(BatchNameSort, driver);
		}

		public void clickBatchDescriptionSort() {
			action.click(DescriptionSort, driver);
		}
		
		public void clickBatchStatusSort() {
			action.click(BatchStatusSort, driver);
		}
		public void clickNoOfClassesSort() {
			action.click(NoOfClassesSort, driver);
		}
		
		public void clickProgramNameSort() {
			action.click(ProgramNameSort, driver);
		}
		public boolean batchlastpagelinkValidation()
		{
			 Boolean lastpglink = action.isEnabled(lastpagelink,driver);
		     return lastpglink;
		}
		
		public String getvaluepage2()
		{
			
			String currentpagevalue= driver.findElement(page2).getText();
			return currentpagevalue;
		}
		
		public String getvaluepage1()
		{
			
			String currentpagevalue= driver.findElement(page1).getText();
			return currentpagevalue;
		}
		
		public String getHeading() {
			//return driver.findElement(AssignHeading).getText();
			return action.getText(batchHeading,driver);
		}
		
		public String getBatchdetailsHeading() throws InterruptedException {
			//return driver.findElement(batchDetailsHeading).getAttribute("innerHTML");
			Thread.sleep(10000);
			String ProgramDetHead = action.getText(batchDetailsHeading, driver);
			return ProgramDetHead;
			
		}
		
		public void clickonBatchCancelBtn() {
			action.click(BatchCancelBtn, driver);
			
		}
		
		public String getupdatedbatchname() {
			return driver.findElement(firstbatchName).getAttribute("innerHTML");
			
		}
		
		public String getupdatedbatchdescription() {
			return driver.findElement(firstdescritpionName).getText();
			
		}
		public String getupdatedBatchProgramName() {
			return driver.findElement(firstProgramName).getText();
			
		}
		public String getupdatedBatchStatus() {
			return driver.findElement(firstProgramName).getText();
			
		}
		public String getupdatedNoOfClasses() {
			return driver.findElement(updatedNoOfClasses).getText();
			
		}
	
		public String getBatchPageTitle() {
			return (action.getTitle(driver));
			}
		
		public String getBottomText() {
			return action.getText(BatchBottomText,driver);
		}
		
		public void batchlinkclick()
		{
			action.click(batchlink_ontop, driver);
		}

		public void addNewBatch()
		{
			action.click(addnewbatch, driver);
		}
		
		public Boolean deletebuttonvalidation()
		{
			
		     Boolean deletevalidation = action.isEnabled(delete_btn_top, driver);
		     return deletevalidation;
	          
	    }
		public void deletebatch()
		{
			action.click(BatchCheckBox, driver);
			action.click(deletebtn1,driver);
		}

		public void clickonDeleteButtonontop()
		{
			
		    action.click(delete_btn_top, driver);  
		              
	    }
	
		public String deleteconfirmAlert()
		{
			//String actualdeletealert = driver.findElement(deleteconfirmalertheader).getAttribute("innerHTML");
			String actualdeletealert = driver.findElement(deletedialogbox).getText();
			return actualdeletealert;
		}
		/*public boolean isDisplayedDelConf() {
			boolean flag = true;
			List<WebElement> Li = action.findElements(deletedialogbox, driver);
			if(Li.size() == 0)
				flag=false;
			return flag;
		}*/
		public void clickYesdeletebatch()
		
		{
			//WebElement clickyes = driver.findElement(deletebatchClickYes);			
			//action.mouseover(driver, clickyes);
			action.click(deletebatchClickYes, driver);
		}

		public void clickDeleteNo() {
			
			action.click(deleteNo, driver);
		}
		public String getAlertText(){
			String alertMsg = action.getText(AlertMsg1,driver) +" "+ action.getText(AlertMsg2,driver);
			return alertMsg;
		}
		
		public String getSearchBoxAttribute() {
			return action.getPlaceholderAttribute(Search_box, driver);
		}
		
	
	
		public void clickOnSearch() {
			action.click(Search_box, driver);
		}
		
		public void enterTextInSearch(String namePhrase) {
			action.type(Search_box, driver, namePhrase);
		}
			
			public List<WebElement> getSearchResults(){
				return action.findElements(BatchSearchList, driver);
			}
			public List<String> getBatchNames() {
				List<WebElement> ListNameElements = action.findElements(BatchSearchList , driver);
				List<String> ListNames = new ArrayList<String>();
				for (WebElement ele : ListNameElements) {
					ListNames.add(ele.getText());
				}
				return ListNames;
			}
			
			public List<String> getBatchDescriptions() {
				List<WebElement> ListDescrElements = action.findElements(BatchDescriptions, driver);
				List<String> ListDescriptions = new ArrayList<String>();
				for (WebElement ele : ListDescrElements) {
					ListDescriptions.add(ele.getText());
				}
				return ListDescriptions;
			}
			
			public List<String> getBatchStatus() {
				List<WebElement> ListStatusElements = action.findElements(BatchStatus, driver);
				List<String> ListStatus = new ArrayList<String>();
				for (WebElement ele : ListStatusElements) {
					ListStatus.add(ele.getText());
				}
				return ListStatus;
			}

			public List<String> getNoOfClasses() {
				List<WebElement> ListClassesElements = action.findElements(NoOfClasses, driver);
				List<String> ListClasses = new ArrayList<String>();
				for (WebElement ele : ListClassesElements) {
					ListClasses.add(ele.getText());
				}
				return ListClasses;
				
			}

			public List<String> getProgramNames() {
				List<WebElement> ListProgramElements = action.findElements(ProgramNames, driver);
				List<String> ListPrograms = new ArrayList<String>();
				for (WebElement ele : ListProgramElements) {
					ListPrograms.add(ele.getText());
				}
				return ListPrograms;
				
			}

		
		public int getRowCount()
		{		
			System.out.println("inside rowcount method");
			List<WebElement> rows =action.findElements(firstrowbatchtable, driver);
			int totalrows = rows.size();
			return totalrows;			
			
			
		}
		
		public String searchbatchname()
		{
			action.click(Search_box, driver);
			System.out.println("Located search box and clicked on it");
			action.type(Search_box,driver, prop.getProperty("validBatchName"));
			//action.click(Search_icon, driver);
			return prop.getProperty("validBatchName");
			
		}
		
		public void clickonBatchCheckBox() {
			action.click(BatchCheckBox, driver);
			
		}
		
		public boolean checkIfProgramSelected() {
			boolean flag = action.isEnabled(BatchCheckBox, driver);
			return flag;
			}
		public void clickonBatchEditBtn()
		{
			
			action.click(editbatch_btn,driver);
		}
		
		public String editBatchName(String BatchName) {
			action.clear(batchName, driver);
			action.type(batchName,driver, BatchName);
			return BatchName;
		}
		
		
		public String editBatchDesc(String BatchDesc) {
			action.clear(batchDescription, driver);
			action.type(batchDescription,driver, BatchDesc);
			return BatchDesc;
		}
		

		public String editNoOfClasses(String NoOfClasses) {
			action.clear(noOfClasses, driver);
			action.type(noOfClasses,driver, NoOfClasses);
			return NoOfClasses;
		}
		
		
	public void editBatchName() throws Exception {
			WebElement editBatchName = driver.findElement(batchName);			
			action.mouseover(driver, editBatchName);
			action.click(batchName, driver);
			driver.findElement(batchName).clear();
					
							
			action.type(batchName,driver, prop.getProperty("editBatchName"));
													
			System.out.println("edited batch Name in batch details window");
		
		}
		
            public void editBatchDescription() {
			
            	WebElement editBatchDesc = driver.findElement(batchDescription);			
    			action.mouseover(driver, editBatchDesc);
    			action.click(batchDescription, driver);
    			driver.findElement(batchDescription).clear();
					
			action.type(batchDescription,driver, prop.getProperty("editBatchDecription"));
													
			System.out.println("edited batch Description in batch details window");
		
		}
            
            public void editprogstatusbatch()
            {
            	  WebElement batchstatus = driver.findElement(statusActive);			
      			action.mouseover(driver,batchstatus);
            	action.click(statusActive, driver);
            
            }
		
		public void clickonBatchSaveBtn(){
       			action.click(BatchSaveBtn , driver);
				}
		
		public void editprognamebatch() {
			//WebElement dropdownlist = driver.findElement(progdropdown);
			
			/*
			      Select select = new Select(dropdownlist);
		         select.selectByVisibleText("JavaSel");
		         WebElement o = select.getFirstSelectedOption();
		         String selectedoption = o.getText();
		         return selectedoption;
		     			*/
			
			action.click(progdropdown, driver);
			//action.selectBySendkeys(prop.getProperty("programnameBatch"), dropdownlist);
			//action.scrollByVisibilityOfElement(driver, dropdownlist);
			WebElement S = driver.findElement(dropdnlist);			
			action.selectByValue(S, prop.getProperty("programnameBatch"));
			
		}
		
		
		public void editNoOfClasses() throws Exception {
			WebElement editNoOfClass = driver.findElement(noOfClasses);			
			action.mouseover(driver, editNoOfClass);
			action.click(noOfClasses, driver);
			driver.findElement(noOfClasses).clear();					
		action.type(noOfClasses,driver, prop.getProperty("NumberOfClasses"));											
			
		}
		
	
			public void selectmutliple_checkboxes(int count)
			{
				List<WebElement> Li = action.findElements(BatchCheckBoxes, driver);
				for(int i=0;i<count;i++)
				{
					action.click(Li.get(i), driver);
				}				
			}
		
			public boolean IsCheckBoxesEnabled(int count)
			{
				boolean flag = false;
				List<WebElement> Li = action.findElements(checksTrail, driver);
				for(int i=0;i<count;i++)
				{
					flag = action.isEnabled(Li.get(i), driver);
					System.out.println(i+"button is selected"+flag);
					if(flag==false) break;		
				}
				return flag;
			}
			
			public void getScreenshot(String filename) {
				action.screenShot(driver, filename);
			}
		}

		

		

