package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.PersonalInfo1;
import page.Personalinfo;
import util.BrowserFactory;

public class Personalinfo1test {
	WebDriver driver;
	@Test
	public void usershouldbeabletofilloutform2() {
		driver = BrowserFactory.init();
		Personalinfo info = PageFactory.initElements(driver, Personalinfo.class);
		info.Fname("Helloooo My name is james Powers");
		info.Lname("Helloooo my last name is Powers");
		info.Bday("6");
		info.BMonth("Apr");
		info.BYear("1980");
		info.email("JamesPowers@indiamail.com");
		info.Phone("123456789");
		info.gender();
		info.location("Mumbai,India");
		info.City("mumbai");
		info.zip("123456123");
		info.state("mumbai,mumbai,mumbai,india");

		PersonalInfo1 info1 = PageFactory.initElements(driver, PersonalInfo1.class);
		info1.hobbies();
		info1.grade("98");
		info1.grade2("100");
		info1.grade3("80");
		info1.grade4("100");
		info1.finalgrade("100");
		info1.finalgrade2("100");
		info1.finalgrade3("100");
		info1.finalgrade4("100");
		info1.year("2010");
		info1.year2("2012");
		info1.year3("2015");
		info1.year4("2020");
		info1.degree();

		BrowserFactory.tearDown();
	}
}
