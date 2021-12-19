package Coden.Selenium.PageObjectTest;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Coden.Selenium.Base.BaseClass;
import Coden.Selenium.PageObject.AutomationLinkPage;
import Coden.Selenium.PageObject.AutomationPage;
import Coden.Selenium.PageObject.HomePage;

public class AutomationLinkTest extends BaseClass {
	AutomationLinkPage automationLinkPage;
	AutomationPage automationPage;
	HomePage homePage;
	
	public AutomationLinkTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		lunchApp();
		homePage=new HomePage();
		automationLinkPage=new AutomationLinkPage();
		
	}
	
	@Test
	public void openLinkTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		homePage.automationSearch();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		automationLinkPage.openLink();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
