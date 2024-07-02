package Campaign;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePage;
//import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.VtigerLoginPage;

public class CreateCampaign {

	@Test
	public static void CreateCampaign() throws Throwable {

		WebDriver driver;
		Excel_Utility elib = new Excel_Utility();
		File_Utility flib = new File_Utility();
		WebDriver_utility wlib = new WebDriver_utility();
		Java_Utility jlib = new Java_Utility();
		String BROWSER = flib.getKeyAndValueData("browser");
		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("fireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		String URL = flib.getKeyAndValueData("url");
		String USERNAME = flib.getKeyAndValueData("username");
		String PASSWORD = flib.getKeyAndValueData("password");

		wlib.maximizeWindow(driver);
		wlib.elementsToGetLoaded(driver);

		driver.get(URL);

		VtigerLoginPage login = new VtigerLoginPage(driver);
		login.loginToApp(USERNAME, PASSWORD);

		
		  driver.findElement(By.linkText("More")).click();
		  driver.findElement(By.linkText("Campaigns")).click();
		 driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		 

		/*
		 * HomePage home = new HomePage(driver); home.clickOrganizationLink();
		 * 
		 * 
		 * driver.findElement(By.cssSelector("[alt='Create Organization...")).click();
		 */

		int ranNum = jlib.getRandomNumber();

		String campaginName = elib.readExcelDataUsingDataFormatter("Campaign", 0, 0) + ranNum;
		driver.findElement(By.name("campaignname")).sendKeys(campaginName);

		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}