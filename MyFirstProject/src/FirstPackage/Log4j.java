package FirstPackage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Log4j {
	Logger logger;
	
		
	
	@Test
	public void test1(){
		
		logger = logger.getLogger("devpinoyLogger");
		
		logger.debug("Starting of selenium tests");
		WebDriver driver = new FirefoxDriver();
		logger.debug("Mozilla browser opens");
		driver.get("http://google.com");
		logger.debug("Navigate to google");
		
	}
	
	
} 
