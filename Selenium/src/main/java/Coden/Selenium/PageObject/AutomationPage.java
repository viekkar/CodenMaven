package Coden.Selenium.PageObject;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Coden.Selenium.Base.BaseClass;
public class AutomationPage extends BaseClass{
	AutomationPage automationPage;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/aside/div[1]/form/input")
	WebElement searchbox;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/aside/div[1]/form/button")
	WebElement submitbtn;
	
	@FindBy(xpath="//*[contains(text(),'Automation Practice')]")
	WebElement automationlink;
	
	@FindBy(xpath="//input[@value='radio1']")
	WebElement radio1;
	
	@FindBy(xpath="//input[@value='radio2']")
	WebElement radio2;
	
	@FindBy(xpath="//input[@value='radio3']")
	WebElement radio3;
	
	@FindBy(xpath="//input[@id='autocomplete']")//countries autocomplete
	WebElement dynamicDrpDwn;
	
	@FindBy(xpath="//select[@id='dropdown-class-example']")//static drpdwn
	WebElement staticDrpDwn;
	
	@FindBy(xpath="//input[@id='checkBoxOption1']")//checkbox
	WebElement checkBox1;
	
	@FindBy(xpath="//input[@id='checkBoxOption2']")//checkbox
	WebElement checkBox2;
	
	@FindBy(xpath="//input[@id='checkBoxOption3']")//checkbox
	WebElement checkBox3;
	
	@FindBy(xpath="//button[@id='openwindow']")//new window btn
	WebElement newWindowBtn;
	
	@FindBy(xpath="//a[@id='opentab']")//openTab
	WebElement openTabBtn;
	
	@FindBy(xpath="//input[@id='name']")//input for name
	WebElement nameTextField;
	
	@FindBy(xpath="//input[@id='alertbtn']")//alart alart btn
	WebElement alertbtn;
	
	@FindBy(xpath="//input[@id='confirmbtn']")//confirm alart btn
	WebElement confirmAlert;
	
	@FindBy(xpath="//input[@id='hide-textbox']")//hide
	WebElement hideBtn;
	
	@FindBy(xpath="//input[@id='show-textbox']")//show
	WebElement showBtn;
	
	@FindBy(xpath="//input[@id='displayed-text']")//dispalyed text
	WebElement nameTextField1;
	
	@FindBy(xpath="//button[@id='mousehover']")//mouse hover
	WebElement mouseHover;
	
	@FindBy(xpath="//*[@id=\"post-501\"]/div/div[4]/div/fieldset/div/div/a[1]")//mouse hover top
	WebElement mouseTop;
	
	public AutomationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void automationSearch() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		searchbox.sendKeys("automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		submitbtn.click();
	}
	
	
	public void openLink() {
		automationlink.click();
	}
		
	public void radioButton() {
		radio1.click();
		radio2.click();
		radio3.click();
	}
	
	public void dynamicDropDown() {
		dynamicDrpDwn.sendKeys("india");
	}
	
	public void staticDropDown() {
		Select staticDrpDwn=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		staticDrpDwn.selectByVisibleText("API");
	}
	
	public void checkBoxClick() {
		checkBox1.click();
		checkBox2.click();
		checkBox3.click();
	}
	
	public void newWindowHandle() {
		String winHandleBefore = driver.getWindowHandle();
		newWindowBtn.click();
		driver.switchTo().window(winHandleBefore);
	}
	
	public void newTab() {
		
		openTabBtn.click();
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	    driver.switchTo().window(tabs2.get(1000));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
	}
	
	public void nameTextField() {
		nameTextField.sendKeys("vishnu");
	}
	
	public void alertButtons() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		alertbtn.click();
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		confirmAlert.click();
		driver.switchTo().alert().accept();
	}
	
	public void hideShowBtn() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		hideBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		showBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	}
	
	public void nameTextField1() {
		nameTextField.sendKeys("vishnu");
	}
	
	public void hoverOperation() {
		Actions action=new Actions(driver);
		action.moveToElement(mouseHover).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		action.moveToElement(mouseTop).click().build().perform();
	}
	
}
