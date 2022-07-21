package pageobjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.DateTime;
import utils.PropertiesLoader;
import utils.WebBasePage;

public class ReviewPage extends WebBasePage {

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

	public ReviewPage(WebDriver driver) {
		super(driver, "Review Page");
		this.dateTime = new DateTime(driver);
		this.driver = driver;
	}

	// click on full menu
	public void clickFullMenu() {
		/*
		 * findElementInVisibility(By.cssSelector("#navbarDropdownPortfolio"), 20);
		 * click(By.cssSelector("#navbarDropdownPortfolio"), "Full Menu", 20);
		 */
			staticWait(3000);
		try {
			WebElement tourGuide = driver.findElement(By.xpath("(//*[name()='svg' and @class='guided-tour-icon'])[1]"));
			
			if(tourGuide.isDisplayed()) {

				Actions action = new Actions(driver);
				action.moveToElement(tourGuide).
				click().build().perform();
				
			click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 20);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 20);
		}
			
			
				 
		}
	

	// click on performance Side menu
	public void clickPerformanceSideMenu() {
		click(By.xpath("//li[@data-name='Performance']//a//i//following::text()[1]//following::span[1]"),
				"Performance Side menu", 20);
	}

	// click on Performance review
	public void clickPerformanceReview() {
		findElementInVisibility(By.xpath("//ul[@class='submenu clschild_14 d-flex']//a[@data-original-title='Review']"),
				20);
		click(By.xpath("//ul[@class='submenu clschild_14 d-fleax']//a[@data-original-title='Review']"), "Review", 20);
	}
	
	

}