package base;


import org.openqa.selenium.WebDriver;

import pageObjects.AssignmentPage;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import pageObjects.ProgramPage;
import pageObjects.RegisterPage;
import pageObjects.UserPage;
import pageObjects.BatchPage;

public class TestContext {

	  	protected WebDriver driver;;
	  	public LogInPage loginObj;
		public HomePage homeObj;
		public ProgramPage programObj;
		public AssignmentPage assignmentObj;
		public UserPage userObj;
		public BatchPage batchObj;
		public RegisterPage registerObj;
		
		
		
		
		public WebDriver getDriver() {
			return driver;
		}
		
		public void setDriver( WebDriver driver) {
			this.driver = driver;
		}
		
		
		
		 public HomePage getHomeObj() {
				return homeObj;
			}
		 
		 public ProgramPage getProgramObj() {
				return programObj;
			}
		 
		 public AssignmentPage getAssignmentObj() {
				return assignmentObj;
			}
		 
		 public LogInPage getLoginObj() {
				return loginObj;
			}
		 
		 public UserPage getUserObj() {
				return userObj;
			}
		 
		 public BatchPage getBatchObj() {
				return batchObj;
			}
		 
		 public RegisterPage getRegisterObj() {
				return registerObj;
			}
		 
		 
		 
		 
		 
		 
		
		
		public void InitializePageObject(WebDriver driver){
			System.out.println("Inside InitializePageObject");
			
			homeObj = new HomePage(driver);
			programObj = new ProgramPage(driver);
			assignmentObj =  new AssignmentPage(driver);
			loginObj = new LogInPage(driver);
			batchObj = new BatchPage(driver);
			registerObj = new RegisterPage(driver);
			
			
			
		}

	}



