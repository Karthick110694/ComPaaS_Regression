package com.compaasreg.testcomponents;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.compaasreg.pageobjects.AzureCloudPageObjects;
import com.compaasreg.pageobjects.LoginPageObjects;

public class BaseTest {

	protected WebDriver driver;
	protected LoginPageObjects page;

	public WebDriver initializeDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rmuthusivabharath\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		return driver;
	}

	@BeforeTest
	public void launchApplication() throws IOException, InterruptedException {
		driver = initializeDriver();
		page = new LoginPageObjects(driver);
		page.goTo();

		System.out.println("Browser Launche Successfully");

	}

}
