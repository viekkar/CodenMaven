package Coden.Selenium.PageObjectTest;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Coden.Selenium.Base.BaseClass;
import Coden.Selenium.PageObject.AutomationLinkPage;
import Coden.Selenium.PageObject.AutomationPage;
import Coden.Selenium.PageObject.HomePage;

public class AutomationPageTest extends BaseClass {
	AutomationPage automationPage;
	HomePage homePage;
	AutomationLinkPage automationLinkPage;
	
	public AutomationPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		lunchApp();
		automationPage=new AutomationPage();
		automationPage.automationSearch();
		automationPage.openLink();
	
		
		
	}
	
	@Test(priority=1)
	public void radioButtonTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		automationPage.radioButton();
	}
	@Test(priority=2)
	public void dynamicDropDownTest() {
		automationPage.dynamicDropDown();
	}
	@Test(priority=3)
	public void staticDropDownTest() {
		automationPage.staticDropDown();
	}
	@Test(priority=4)
	public void checkBoxClickTest() {
		automationPage.checkBoxClick();
	}
	@Test(priority=5)
	public void newWindowHandleTest() {
		automationPage.newWindowHandle();
	}
	@Test(priority=6)
	public void newTabTest() {
		automationPage.newTab();
	}
	@Test(priority=7)
	public void nameTextFieldTest() {
		automationPage.nameTextField();
	}
	@Test(priority=8)
	public void alertsButtonsTest() {
		automationPage.alertButtons();
	}
	@Test(priority=9)
	public void hideShoBtnTest() {
		automationPage.hideShowBtn();
	}
	@Test(priority=10)
	public void nameTextField1000Test() {
		automationPage.nameTextField1();
	}
	@Test(priority=11)
	public void hoverOperation() {
		automationPage.hoverOperation();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
