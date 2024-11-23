package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.Readconfig;

public class Baseclass {
	
	Readconfig rc = new Readconfig();

	public String baseURL=rc.getApplicationURL();
	public String username=rc.getusername();
	public String password=rc.getpwd();
	public static WebDriver driver;
	
	//common methods in project
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",
				rc.getchrome());
		driver=new ChromeDriver();
	}
	


	
}

	
	