package testcases;

import static reporting.ComplexReportFactory.getTest;

import java.text.ParseException;

import org.testng.annotations.Test;

import action.CompanySetupUserAction;
import action.LoginAction;
import utils.WebTestBase;

public class CompanySetupTest extends WebTestBase {
	static String Screenname = "<b>User</b>"; 
	@Test(priority = 1,enabled=true)
	public void ValidationCheck()
	{
		test=getTest(Screenname + ": Validation message on Add Annoucement");
		CompanySetupUserAction companySetupUserAction = new CompanySetupUserAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupUserAction.navigateToCompanySetup();
		companySetupUserAction.validationMessageCheck();
		
	}

	@Test(priority = 2)
	
	public void addUser() throws ParseException {
		test = getTest(Screenname = "delete User:create user ");
		new LoginAction(driver).logoutLogin();
	
		CompanySetupUserAction companySetupUserAction = new CompanySetupUserAction(driver);
		//companySetupUserAction.addSkillSettings();
		companySetupUserAction.navigateToCompanySetup();
	
		//companySetupUserAction.selectcheckbox();
		//companySetupUserAction.deleteUser();
		companySetupUserAction.createUser();
		
		  
		  companySetupUserAction.settingsForCreatedUser();
		  companySetupUserAction.addFeedbackSetting();
		  companySetupUserAction.addGoalSettings();
		  companySetupUserAction.addNoteSettings();
		  companySetupUserAction.clickPerformanceReviewTab();
		  companySetupUserAction.addReview();
		  companySetupUserAction.addSkillforCreatedUser();
		  companySetupUserAction.addSkillSettings();
		 
		//new LoginAction(driver).logoutLoginNewUser();
//		companySetupUserAction.clickPerformanceReviewTab();
//		companySetupUserAction.addReview();
	}
}