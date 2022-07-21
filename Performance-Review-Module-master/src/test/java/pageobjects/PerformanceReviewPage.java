package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import utils.DateTime;
import utils.PropertiesLoader;
import utils.WebBasePage;

public class PerformanceReviewPage extends WebBasePage {

	WebDriver driver;

	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";

	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	static String pattern = "yyMMddHHmmss";
	static String datePattern = "MM/dd//yyyy";
	static Date date = new Date();
	static SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
	public static int characterLength;
	static String otherDateValue = dateformat.format(date);
	DateTime dateTime;

	public PerformanceReviewPage(WebDriver driver) {
		super(driver, "Performance Review Page");
		this.dateTime = new DateTime(driver);
		this.driver = driver;
	}
	
	

	// click on full menu
	public void clickFullMenu() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg' and @class='guided-tour-icon'])[1]")));
		
		
	try {
		
		WebElement tourGuide = driver.findElement(By.xpath("(//*[name()='svg' and @class='guided-tour-icon'])[1]"));
		
		if(tourGuide.isDisplayed()) {
			
			Actions action = new Actions(driver);
			action.moveToElement(tourGuide).
			click().build().perform();
			
			  WebDriverWait wait1 = new WebDriverWait(driver,30);
			  wait1.until(ExpectedConditions.elementToBeClickable(By.
			  xpath("(//*[name()='svg' and @class='guided-tour-icon'])[1]")));
			 
			click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 20);
			
		}
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 20);
	}
		
		
			 
	}

	// click on performance Side menu
	public void clickPerformanceSideMenu() {
		staticWait(2000);
		/*
		 * click(By.xpath(
		 * "//li[@data-name='Performance']//a//i//following::text()[1]//following::span[1]"
		 * ), "Performance Side menu", 20)
		 */;
				click(By.xpath("//li[@data-name='Performance Review']"),
						"Performance Side menu", 20);
	}

	// click on Performance review
	public void clickPerformanceReview() {
		staticWait(1000);
//		findElementInVisibility(
//				By.xpath("//ul[@class='submenu clschild_14 d-flex']//a[@data-original-title='Performance Review']"),
//				20);
		click(By.xpath("//ul[@class='submenu clschild_14 d-flex']//a[@data-original-title='Performance Review']"),
				"Perfromance Review", 20);
	}

	// click on Performance review side
	
	public void clickPerformanceReviewSide() {
		staticWait(1000);
		click(By.cssSelector("#areview"), "Perfromance Review side", 20);
	}

	// click on Goal
	public void clickGoal() {
		click(By.xpath("//li[@class='nav-item']//a[@data-original-title='Goal']"), "Goal", 20);
	}

	// click on Created Goal
	public void clickOnCreatedGoal() {
		click(By.xpath("//table[@id='GoalList']//tr//following::td[1]//a"), "Created Goal", 20);
	}

	public void enterCommentGoal() {
		enter(By.xpath("//textarea[@name='Comment']"), "enter goal comment", "enter comment goal", 20);
	}
	public void provideProgress()
	{
		staticWait(3000);		
		
		Actions action = new Actions(driver);
		
		 WebElement slider = driver.findElement(By.xpath("//div[@id='slider-range-min']//a[contains(@class,'ui-slider-handle')]"));
		action.dragAndDropBy(slider,50,0);
		action.build().perform();
	}

	/* Click on Save Goal */
	public void saveGoal() {
		click(By.xpath("//button[@type='submit']"), "Goal saved", 20);
	}
	/* Click on Review, After issue fixing of goal then it has to remove */
	public void clickOnReview() {
		staticWait(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
		
		click(By.xpath("//li[@class='breadcrumb-item']/a[text()='Review']"), "Review", 20);
	}
	public void clickPostComment() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)"); // Scroll vertically down by 1000 pixels

		// Find element by link text and store in variable "Element"
		WebElement Element = driver.findElement(By.xpath("//a[@id='postcomment']"));
		// Find element by link text and store in variable "Element"

		js.executeScript("arguments[0].scrollIntoView();", Element);
		click(By.xpath("//a[@id='postcomment']"), "Post comment", 20);
	}

	// click on note
	public void clickNote() {
		click(By.cssSelector("#anote"), "Note", 20);
	}

	// click on Created Goal
	public void clickOnCreatedNote() {
		staticWait(3000);
		click(By.xpath("//table[@id='NoteList']/descendant::td/a[@data-toggle-tooltip='tooltip']"), "Created Note", 20);
	}
	//Clicki on Note Comment
	public void enterCommentNote() {
		enter(By.xpath("//textarea[@name='Comment']"), "Enter goal Note", "Enter comment Note", 20);
	}

	public void clickPostCommentNote() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)"); // Scroll vertically down by 1000 pixels

		// Find element by link text and store in variable "Element"
		WebElement Element = driver.findElement(By.xpath("//a[@id='postcomment']"));
		// Find element by link text and store in variable "Element"

		js.executeScript("arguments[0].scrollIntoView();", Element);
		click(By.xpath("//a[@id='postcomment']"), "Post comment", 20);
	}
	// table[@id='NoteList']//td[2]//a

	// click on feedback
	public void clickFeedback() {
		click(By.xpath("//a[@id='afeedback']"), "Feedback", 20);
	}

	/* click on feedback title */
		public void clickOnFeedbackTitle() {
			staticWait(3000);
			click(By.xpath("//tr/td/ancestor::div[@id='Feedback']/descendant::a[@id='ancEditNote']"), "Feedback Title", 20);
		}
		/* click on feedback Comment */
		public void enterFeedbackComment() {
			
			enter(By.xpath("//textarea[@name='Comment']"), "Enter goal Comment", "enter comment Note", 20);
		}
		/* click on feedback Post New Comment*/
		public void clickOnFeedbackPostNewComment() {
			click(By.xpath("//span[text()='Post New Comment']"), "Feedback Post New Comment", 20);
		}
		/* click on Back to List*/
		public void clickOnBackToList() {
			staticWait(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, 0);");
			
			click(By.xpath("//span[text()='Back to list']"), "Back to list", 20);
		}



	// click on Skill
	public void clickSkill() {
		click(By.xpath("//a[@data-original-title='Skill']"), "Skill", 20);
	}

	// click on Skill Title
	public void clickSkillTitle() {
		staticWait(3000);
		click(By.xpath("//table[@id='AssignedSkillList']/descendant::td/a[@data-toggle-tooltip='tooltip']"), "Skill Title", 20);
	}
	/* click on Skill Comment */
	public void enterSkillComment() {
		enter(By.xpath("//textarea[@name='Comment']"), "enter Skill Comment", "enter comment Note", 20);
	}
	/* Click on Save Skill */
	public void saveSkill() {
		click(By.xpath("//button[@class='btn btn-success']"), "Skill saved", 20);
	}
	
	/* Click on User Performance Review */
	public void clickOnUserPerformanceReview() {
		click(By.xpath("//a[@id='areview']"), "User Performance Review", 20);
	}
	/* Click on User Performance Review Title */
	public void clickOnUserReviewTitle() {
		click(By.xpath("//a[contains(text(),'Add Review Title')]"), "User Review Title", 20);
	}
	/* Click on Question */
	public void clickOnQuestiopn() {
		click(By.xpath("//a[@data-original-title='Question']"), "User Question", 20);
	}
	/* Click on Short Term Goals Rating */
	public void clickOnShortTermGoalRating() {
		click(By.xpath("//div[contains(text(),'your short Term goals')]/ancestor::div[@class='feedback-box']/descendant::i[@value='4']"), "Short Term Goal Rating", 20);
	}
	//Enter Short Term Goal
	public void enterShortTermGoal() {
		enter(By.xpath("//div[contains(text(),'your short Term goals')]/ancestor::div[@class='feedback-box']/descendant::p[@class='description divans']/tg-textarea/textarea[@class='form-control form-control ans']"), "Add Short Term Goal", "Enter Short Term Goal", 20);
		}
	
	/* Click on Long Term Goals Rating */
	public void clickOnLongTermGoalRating() {
		click(By.xpath("//div[contains(text(),'your long Term goals')]/ancestor::div[@class='feedback-box']/descendant::i[@value='4']"), "Long Term Goal Rating", 20);
	}

	/* Enter Long Term Goal */
	public void enterLongTermGoal() {
		enter(By.xpath("//div[contains(text(),'your long Term goals')]/ancestor::div[@class='feedback-box']/descendant::p[@class='description divans']/tg-textarea/textarea[@class='form-control form-control ans']"), "Add Long Term Goal", "Enter comment Note", 20);
			}
	/* Click on Current Appraisal Cycle Rating */
	public void clickOnCurrentAppraisalCycleRating() {
		click(By.xpath("//div[contains(text(),'your key achievements in current appraisal cycle?')]/ancestor::div[@class='feedback-box']/descendant::i[@value='4']"), "Current Appraisal Cycle Rating", 20);
	}

	/* Enter Current Appraisal Cycle */
		public void enterurrentAppraisalCycle() {
			enter(By.xpath("//div[contains(text(),'achievements in current appraisal cycle')]/ancestor::div[@class='feedback-box']/descendant::p[@class='description divans']/tg-textarea/textarea[@class='form-control form-control ans']"), "Add achievements in current appraisal cycle", "Enter achievements in current appraisal cycle", 20);
				}
	/* Click on Current Appraisal Cycle Rating */
	public void clickOnCurrentApprasialCycleRating() {
		click(By.xpath("//div[contains(text(),'your key achievements in current appraisal cycle?')]/ancestor::div[@class='feedback-box']/descendant::i[@value='4']"), "Current Appraisal Cycle", 20);
	}
	/* Click on Weakness Rating */
	public void clickOnWeaknessRating() {
		click(By.xpath("//div[contains(text(),'what are your weaknesses')]/ancestor::div[@class='feedback-box']/descendant::i[@value='4']"), "Weakness Rating", 20);
	}
	/* Enter Weakness */
	public void enterweaknesses() {
		enter(By.xpath("//div[contains(text(),'what are your weaknesses')]/ancestor::div[@class='feedback-box']/descendant::p[@class='description divans']/tg-textarea/textarea[@class='form-control form-control ans']"), "Add weakness", "Enter weakness", 20);
			}
     /*Click on Save Question */
	public void clickOnSaveQuestion() {
	
		click(By.xpath("//input[@id='btnQuestionSave']"), "Save Question", 20);
	}
	/* Click on Submit Review */
	public void clickOnSubmitReview() {
		staticWait(3000);
	click(By.xpath("//a[@data-original-title='Submit Review']"), "Submit review", 20);
	}
	/* Enter Description */
	public void enterDescription() {
		enter(By.xpath("//textarea[@id='txtOverviewComment']"), "Add Review Description", " Review Description", 20);
    }
	 /*Click on Save Submit Review */
		public void clickOnSaveSubmitReview() {
			click(By.xpath("//input[@id='btnSave']"), "Save Submit Review", 20);
		}
		/*Click on OK */
		public void clickOnOK() {
			click(By.xpath("//button[@data-bb-handler='confirm']"), "Ok button", 20);
		}
		/*Click on User feedback */
		public void clickOnuserfeedback() {
			click(By.xpath("//li[@class='nav-item']/a[@data-original-title='Feedback']"), "feedback", 20);
		}
		/*Click on User feedback Question */
		public void clickOnuserfeedbackQuestion() {
			click(By.xpath("//div[@class='listing']/descendant::table[@id='FeedbackList']/descendant::tbody/tr/td/a[@class='aShowFeedbackDetail']"), "feedback question", 20);
		}
		/* Validate feedback Page */
		public void validateFeedBack() {
			String feedBack = driver.findElement(By.xpath("//h5[text()='Feedback']")).getText();
			if(feedBack.contains("Feedback")) {
		
				getTest().log(LogStatus.PASS, "Feedback Page displayed ");
                logger.info("Feedback Page displayed ");
				
			}else {
				System.out.println("Feedback Page is not displaying");
				getTest().log(LogStatus.FAIL, "Feedback Page is not displaying");
                logger.info("Feedback Page is not displaying");
                takeScreenshot(feedBack);
			}
		
		}
		/* Close FeedbackPage */
		public void clickOnfeedbackClosebutton() {
			click(By.xpath("//div[@class='modal-header ui-draggable-handle']/h5[text()='Feedback']/ancestor::div[@class='modal-content']/descendant::button[@type='button']"), "Feedback Page Closed", 20);
		}

		/* Click on User Skill */
		public void clickOnUserSkill() {
			click(By.xpath("//li[@class='nav-item']/a[@data-original-title='Skill']"), "skill", 20);
		}
		/* Click on User Skill Title */
		public void clickOnUserSkillTitle() {
			click(By.xpath("(//thead[@class='thead-bg']/tr/th[@id='th-TITLE']/ancestor::table[@id='NoteList']/descendant::tbody/tr/td/a[@class='aShowSkillDetail'])[1]"), "skill Title", 20);
		}
		/* Validate skill Page */
		public void validateSkill() {
			String skill = driver.findElement(By.xpath("//h5[text()='Skill']")).getText();
			if(skill.contains("Skill")) {
		
				getTest().log(LogStatus.PASS, "Skill Page displayed ");
                logger.info("Skill Page displayed");
				
			}else {
				
				getTest().log(LogStatus.FAIL, "Skill Page is not displaying");
                logger.info("Skill Page is not displaying");
                takeScreenshot(skill);
			}
		
		}

		/* Close SkillPage */
		public void clickOnSkillClosebutton() {
			click(By.xpath("//div[@class='modal-header ui-draggable-handle']/h5[text()='Skill']/ancestor::div[@class='modal-content']/descendant::button[@type='button']"), "Skill Page Closed", 20);
		}
	
		/* Click on User Goal */
		public void clickOnUserGoal() {
			click(By.xpath("//li[@class='nav-item']/a[@data-original-title='Goal']"), "Goal", 20);
		}
		/* Click on User Goal Title */
		public void clickOnUserGoalTitle() {
			click(By.xpath("(//thead[@class='thead-bg']/tr/th[@id='th-ENDDATE']/ancestor::table[@id='NoteList']/descendant::tbody/tr/td/a[@class='aShowGoalDetail'])[1]"), "Goal Title", 20);
		}
		/* Validate Goal Page */
		public void validateGoal() {
			String goal = driver.findElement(By.xpath("//h5[text()='Goal']")).getText();
			if(goal.contains("Goal")) {
		
				getTest().log(LogStatus.PASS, "Goaol Page displayed ");
                logger.info("Goal Page displayed");
				
			}else {
				
				getTest().log(LogStatus.FAIL, "Goal Page is not displaying");
                logger.info("Goal Page is not displaying");
                takeScreenshot(goal);
			}
		
		}

		/* Close Goal Page */
		public void clickOnGoalClosebutton() {
			click(By.xpath("//div[@class='modal-header ui-draggable-handle']/h5[text()='Goal']/ancestor::div[@class='modal-content']/descendant::button[@type='button']"), "Goal Page Closed", 20);
		}
		/* Click on User Note */
		public void clickOnUserNote() {
			click(By.xpath("//li[@class='nav-item']/a[@data-original-title='Note']"), "Note", 20);
		}
		/* Click on User Goal Title */
		public void clickOnUserNoteTitle() {
			click(By.xpath("(//thead[@class='thead-bg']/tr/th[@id='th-STATUS']/ancestor::table[@id='NoteList']/descendant::tbody/tr/td/a[@class='aShowNoteDetail'])[1]"), "Note Title", 20);
		}
		/* Validate Note Page */
		public void validatNote() {
			String note = driver.findElement(By.xpath("//h5[text()='Note']")).getText();
			if(note.contains("Note")) {
		
				getTest().log(LogStatus.PASS, "Note Page displayed ");
                logger.info("Note Page displayed");
				
			}else {
				
				getTest().log(LogStatus.FAIL, "Note Page is not displaying");
                logger.info("Note Page is not displaying");
                takeScreenshot(note);
			}
		
		}

		/* Close Note Page */
		public void clickOnNoteClosebutton() {
			click(By.xpath("//div[@class='modal-header ui-draggable-handle']/h5[text()='Note']/ancestor::div[@class='modal-content']/descendant::button[@type='button']"), "Note Page Closed", 20);
		}
		/* Click on Overview */
		public void clickOnOverview() {
			click(By.xpath("//li[@class='nav-item']/a[@data-original-title='Overview']"), "Overview", 20);
		}
		
		/* Validate Overview Page */
		public void validatOverviewPage() {
			String overview = driver.findElement(By.xpath("//span[text()='Overview']")).getText();
			if(overview.contains("Overview")) {
		
				getTest().log(LogStatus.PASS, "Overview Page displayed ");
                logger.info("Overview Page displayed");
				
			}else {
				
				getTest().log(LogStatus.FAIL, "Overview Page is not displaying");
                logger.info("Overview Page is not displaying");
                takeScreenshot(overview);
			}
		
		}
	

	// click on My Team
	public void clickMyTeam() {
		click(By.cssSelector("#amyteam"), "My Team", 20);
	}

	// save Note
	public void selectSkill() {
		clickByJavascript(By.cssSelector("#btnPopupSave"), "save button", 20);
	}

}
