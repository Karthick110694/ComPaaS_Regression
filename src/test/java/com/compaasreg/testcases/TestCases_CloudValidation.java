package com.compaasreg.testcases;

import static org.testng.Assert.*;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import com.compaasreg.pageobjects.*;
import com.compaasreg.testcomponents.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class TestCases_CloudValidation extends BaseTest {
	WebDriver driver;

	@Test
	public void cloudAdditionAzure() throws InterruptedException, IOException {

		this.driver = page.loginApplication();
		AzureCloudPageObjects azureCloudPageObjects = new AzureCloudPageObjects(driver);
		azureCloudPageObjects.azure_CloudAccountAddition();
		Assert.assertEquals(new SyncValidation(driver).getMessage(), "Success");

	}

//		@Test
//		public void cloudAccountAdditionAws() throws InterruptedException, IOException {
//
//			AWSCloudPageObjects awsCloudPageObjects = new AWSCloudPageObjects(driver);
//			awsCloudPageObjects.aws_CloudAccountAddition();
//			Assert.assertEquals();
//		}
//
//		@Test
//		public void cloudAccountAdditionGcp() throws InterruptedException, IOException {
//			GCPCloudPageObjects gcpCloudPageObjects = new GCPCloudPageObjects(driver);
//			gcpCloudPageObjects.gcp_CloudAccountAddition();
//			Assert.assertEquals();
//		}
//
//	@Test(dependsOnMethods = { "cloudAdditionAzure" })
//	public void cloudAccountSyncValidation_azure() {
//
//	}
//
//	@Test(dependsOnMethods = { "cloudAccountAdditionAws" })
//	public void cloudAccountSyncValidation_aws() {
//
//	}
//
//	@Test(dependsOnMethods = { "cloudAccountAdditionGcp" })
//	public void cloudAccountSyncValidation_gcp() {
//
//	}
}
