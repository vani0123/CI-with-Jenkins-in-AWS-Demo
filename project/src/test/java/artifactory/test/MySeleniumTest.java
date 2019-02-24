package artifactory.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MySeleniumTest {
	//public static String drivePath = "C:\\Users\\AK Jain\\Desktop\\vani\\golden gate DevOps\\chromedriver_win32\\";
	public static String drivePath ="resources/";
	@Test
	public static void TestPageContent() {
		//System.setProperty("webdriver.chrome.driver", drivePath + "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://35.200.169.251:8081/project-1.0-RAMA/");
		WebElement TxtContent = driver.findElement(By.xpath("/html/body/p"));
		if (TxtContent.getText().contentEquals("This session is to demonstrate how to setup simple pipeline")) {
			System.out.println("Success: Page content is -"+TxtContent.getText());
		}

		driver.close();

	}

}
