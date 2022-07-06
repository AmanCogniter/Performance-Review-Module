package pageobjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

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
		//findElementInVisibility(By.cssSelector("#navbarDropdownPortfolio"), 20);
		click(By.cssSelector("#navbarDropdownPortfolio"), "Full Menu", 20);
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
		action.dragAndDropBy(slider,700,0);
		action.build().perform();
	}

	/* Click on Save Goal */
	public void saveGoal() {
		click(By.xpath("//button[@type='submit']"), "Goal saved", 20);
	}
	/* Click on Review, After issue fixing of goal then it has to remove */
	public void clickOnReview() {
		staticWait(3000);
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

	public void clickPostCommenNotet() {
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
	

	// click on My Team
	public void clickMyTeam() {
		click(By.cssSelector("#amyteam"), "My Team", 20);
	}

	// save Note
	public void selectSkill() {
		clickByJavascript(By.cssSelector("#btnPopupSave"), "save button", 20);
	}

}
