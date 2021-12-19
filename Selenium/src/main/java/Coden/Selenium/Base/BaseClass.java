package Coden.Selenium.Base;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {
		public static Properties prop;
		public static WebDriver driver;
		
		@BeforeTest
		public static void LoadConfig() throws IOException {
			prop=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\Configuration.properties");
			prop.load(ip);
		}
	
	
	public static WebDriver lunchApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().deleteAllCookies();
		String url=prop.getProperty("url");
		driver.get(url);
		return driver;
		
		}
	}

