package HookFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
public class Hook {
	
	public static WebDriver driver;
	@Before
	public void setUp(){ 
		System.out.println("hello setup is done");
		System.setProperty("webdriver.chrome.driver","F:\\programs\\Eclipse Programs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
	   } 
		
		
}
