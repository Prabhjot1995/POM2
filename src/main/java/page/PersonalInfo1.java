package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInfo1 {
	WebDriver driver;

	public PersonalInfo1(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@value='Dancing']")
	WebElement HOBBIES_FEILD;
	@FindBy(xpath = "//input[@name='ClassX_Board']")
	WebElement EXAMS_GRADE_FEILD;
	@FindBy(xpath = "//input[@name='ClassXII_Board']")
	WebElement EXAMS_GRADE_FEILD2;
	@FindBy(xpath = "//input[@name='Graduation_Board']")
	WebElement EXAMS_GRADE_FEILD3;
	@FindBy(xpath = "//input[@name='Masters_Board']")
	WebElement EXAMS_GRADE_FEILD4;
	@FindBy(xpath = "//input[@name='ClassX_Percentage']")
	WebElement FINAL_GRADE_FEILD;
	@FindBy(xpath = "//input[@name='ClassXII_Percentage']")
	WebElement FINAL_GRADE_FEILD2;
	@FindBy(xpath = "//input[@name='Graduation_Percentage']")
	WebElement FINAL_GRADE_FEILD3;
	@FindBy(xpath = "//input[@name='Masters_Percentage']")
	WebElement FINAL_GRADE_FEILD4;
	@FindBy(xpath = "//input[@name='ClassX_YrOfPassing']")
	WebElement YEAR_FEILD;
	@FindBy(xpath = "//input[@name='ClassXII_YrOfPassing']")
	WebElement YEAR_FEILD1;
	@FindBy(xpath = "//input[@name='Graduation_YrOfPassing']")
	WebElement YEAR_FEILD2;
	@FindBy(xpath = "//input[@name='Masters_YrOfPassing']")
	WebElement YEAR_FEILD3;
	@FindBy(xpath = "//input[@name='BCA']")
	WebElement DEGREE_FEILD;

	public void hobbies() {
		HOBBIES_FEILD.click();
	}

	public void grade(String grade) {
		EXAMS_GRADE_FEILD.sendKeys(grade);
	}

	public void grade2(String grade) {
		EXAMS_GRADE_FEILD2.sendKeys(grade);
	}

	public void grade3(String grade) {
		EXAMS_GRADE_FEILD3.sendKeys(grade);
	}

	public void grade4(String grade) {
		EXAMS_GRADE_FEILD4.sendKeys(grade);
	}

	public void finalgrade(String grade) {
		FINAL_GRADE_FEILD.sendKeys(grade);
	}

	public void finalgrade2(String grade) {
		FINAL_GRADE_FEILD2.sendKeys(grade);
	}
	public void finalgrade3(String grade) {
		FINAL_GRADE_FEILD3.sendKeys(grade);
		}
	public void finalgrade4(String grade) {
		FINAL_GRADE_FEILD4.sendKeys(grade);
		}
	public void year(String year) {
		YEAR_FEILD.sendKeys(year);
	}
	public void year2(String year) {
		YEAR_FEILD1.sendKeys(year);
	}
	public void year3(String year) {
		YEAR_FEILD2.sendKeys(year);
	}
	public void year4(String year) {
		YEAR_FEILD3.sendKeys(year);
	}
	public void degree() {
		DEGREE_FEILD.click();
	}
	
}
