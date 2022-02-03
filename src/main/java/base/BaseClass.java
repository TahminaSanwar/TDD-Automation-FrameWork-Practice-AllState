package base;

import java.time.Duration;

import org.bouncycastle.crypto.macs.CMac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import common.CommonMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ProductPages;

public class BaseClass {
	public static WebDriver driver;
	public ProductPages productPages;
	public CommonMethods cm;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager. chromedriver(). setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.allstate.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		initElements();
		
	}
	
	
	
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
		
	}
	public void initElements() {
		productPages=new ProductPages(driver);
		 cm =new CommonMethods();
		
	}
	

}
