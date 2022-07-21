package testcases;

import static reporting.ComplexReportFactory.getTest;
import java.text.ParseException;
import org.testng.annotations.Test;
import action.LoginAction;
import action.PerformanceReviewAction;
import utils.WebTestBase;

public class PerformanceReviewTest extends WebTestBase {

	@Test(priority = 0)
	public void addReview() throws ParseException {
		test = getTest("TC_Delete and create user.");
		new LoginAction(driver).logoutLogin();
		PerformanceReviewAction performanceReviewAction = new PerformanceReviewAction(driver);
		performanceReviewAction.navigateToPerformanceReview();
		
		  performanceReviewAction.clickGoal(); 
		  performanceReviewAction.clickNote();
		  performanceReviewAction.clickFeedback();
		  performanceReviewAction.clickSkill();
		 
		performanceReviewAction.clickUserPerformanceReview();
		performanceReviewAction.validateOverviewPage();
		performanceReviewAction.validateNotePage();
		performanceReviewAction.validateGoalPage();
		performanceReviewAction.validateSkillPage();
		performanceReviewAction.validatefeedbackPage();
		performanceReviewAction.clickonQuestion();
		performanceReviewAction.clickonSubmitReview();
		
	}
}

