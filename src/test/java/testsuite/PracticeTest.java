package testsuite;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {
	private static WebDriver driver;
	
	@Test
	public void test01(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.jp");
	}

}
