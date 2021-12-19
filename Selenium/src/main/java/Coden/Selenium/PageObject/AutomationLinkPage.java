package Coden.Selenium.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Coden.Selenium.Base.BaseClass;

public class AutomationLinkPage extends BaseClass {
	AutomationPage automationPage;
	AutomationLinkPage automationLinkPage;
	
	@FindBy(xpath="//*[contains(text(),'Automation Practice')]")
	WebElement automationlink;
	
	public AutomationLinkPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AutomationPage openLink() {
		automationlink.click();
		return new AutomationPage();
	}
	
}
