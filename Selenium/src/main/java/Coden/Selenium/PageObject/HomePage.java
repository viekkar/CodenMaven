package Coden.Selenium.PageObject;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Coden.Selenium.Base.BaseClass;
public class HomePage extends BaseClass{
	static AutomationLinkPage automationLinkPage;
	static HomePage homePage;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/aside/div[1]/form/input")
	WebElement searchbox;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/aside/div[1]/form/button")
	WebElement submitbtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public AutomationLinkPage automationSearch() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		searchbox.sendKeys("automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		submitbtn.click();
		return new AutomationLinkPage();
	}


}
