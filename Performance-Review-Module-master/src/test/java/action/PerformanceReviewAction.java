package action;



import org.openqa.selenium.WebDriver;

import pageobjects.PerformanceReviewPage;
import utils.WebBasePage;

public class PerformanceReviewAction extends WebBasePage {

	WebDriver driver;
	PerformanceReviewPage performanceReviewPage;

	public PerformanceReviewAction(WebDriver driver) {
		super(driver, "Performance Review Page.");
		this.performanceReviewPage = new PerformanceReviewPage(driver);
		this.driver = driver;
	}

	public void navigateToPerformanceReview() {
		performanceReviewPage.clickFullMenu();
		performanceReviewPage.clickPerformanceSideMenu();
		performanceReviewPage.clickPerformanceReview();
	}

	public void clickGoal() {
		performanceReviewPage.clickGoal();
		performanceReviewPage.clickOnCreatedGoal();
		//performanceReviewPage.enterCommentGoal();
		//performanceReviewPage.clickPostComment();
		performanceReviewPage.provideProgress();
		performanceReviewPage.saveGoal();
		performanceReviewPage.clickOnReview();
	}

	public void clickNote() {
		performanceReviewPage.clickNote();
		performanceReviewPage.clickOnCreatedNote();
		performanceReviewPage.enterCommentNote();
		performanceReviewPage.clickPostCommentNote();
		performanceReviewPage.clickOnReview();
	}

	public void clickFeedback() {
		performanceReviewPage.clickFeedback();
		performanceReviewPage.clickOnFeedbackTitle();
		performanceReviewPage.enterFeedbackComment();
		performanceReviewPage.clickOnFeedbackPostNewComment();
		performanceReviewPage.clickOnBackToList();
	}

	public void clickSkill() {
		performanceReviewPage.clickSkill();
		performanceReviewPage.clickSkillTitle();
		performanceReviewPage.provideProgress();
		performanceReviewPage.enterSkillComment();
		performanceReviewPage.saveSkill();
	}
	public void clickUserPerformanceReview() {
		performanceReviewPage.clickOnUserPerformanceReview();
		performanceReviewPage.clickOnUserReviewTitle();
		
	}
	public void validateOverviewPage() {
		performanceReviewPage.clickOnOverview();
		performanceReviewPage.validatOverviewPage();
		
	}
	public void validateNotePage() {
		performanceReviewPage.clickOnUserNote();
		performanceReviewPage.clickOnUserNoteTitle();
		performanceReviewPage.validatNote();
		performanceReviewPage.clickOnNoteClosebutton();
		
	}
	public void validateGoalPage() {
		performanceReviewPage.clickOnUserGoal();
		performanceReviewPage.clickOnUserGoalTitle();
		performanceReviewPage.validateGoal();
		performanceReviewPage.clickOnGoalClosebutton();
		
	}
	public void validateSkillPage() {
		performanceReviewPage.clickOnUserSkill();
		performanceReviewPage.clickOnUserSkillTitle();
		performanceReviewPage.validateSkill();
		performanceReviewPage.clickOnSkillClosebutton();
		
	}
	

	public void validatefeedbackPage() {
		performanceReviewPage.clickOnuserfeedback();
		performanceReviewPage.clickOnuserfeedbackQuestion();
		performanceReviewPage.validateFeedBack();
		performanceReviewPage.clickOnfeedbackClosebutton();
		
	}
		public void clickonQuestion() {
		performanceReviewPage.clickOnQuestiopn();
		performanceReviewPage.clickOnShortTermGoalRating();
		performanceReviewPage.enterShortTermGoal();
		performanceReviewPage.clickOnLongTermGoalRating();
		performanceReviewPage.enterLongTermGoal();
		performanceReviewPage.clickOnCurrentApprasialCycleRating();
		performanceReviewPage.enterurrentAppraisalCycle();
		performanceReviewPage.clickOnWeaknessRating();
		performanceReviewPage.enterweaknesses();
		performanceReviewPage.clickOnSaveQuestion();

	}
	public void clickonSubmitReview() {
		performanceReviewPage.clickOnSubmitReview();
		performanceReviewPage.enterDescription();
		performanceReviewPage.clickOnSaveSubmitReview();
		performanceReviewPage.clickOnOK();
		
	}
}
