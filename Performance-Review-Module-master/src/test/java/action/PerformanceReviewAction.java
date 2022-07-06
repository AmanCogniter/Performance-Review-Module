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
		performanceReviewPage.clickPostCommenNotet();
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
		performanceReviewPage.enterSkillComment();
		performanceReviewPage.saveSkill();
	}
}
