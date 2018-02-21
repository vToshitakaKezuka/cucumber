package testsuite;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	private static WebDriver driver;
	
	@Test
	public void test01(){
		System.setProperty("webdriver.chrome.driver", "C:\\pleiades\\workspace\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

}
