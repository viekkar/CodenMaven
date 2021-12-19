package Coden.Selenium.PageObjectTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Coden.Selenium.Base.BaseClass;
import Coden.Selenium.PageObject.AutomationLinkPage;
import Coden.Selenium.PageObject.HomePage;

public class HomePageTest extends BaseClass{
	HomePage homePage;
	AutomationLinkPage automationLinkPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		lunchApp();
		homePage=new HomePage();
		
		
	}
	
	@Test
	public void automationSearchTest() {
		automationLinkPage=homePage.automationSearch();
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

}
