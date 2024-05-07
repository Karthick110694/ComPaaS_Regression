package com.compaasreg.pageobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.DataProvider;

import com.compaasreg.abstractComponents.AbstractComponents;

public class AzureCloudPageObjects extends AbstractComponents {
	WebDriver driver;

	List<WebElement> elements;

	@FindBy(xpath = "//div[@id='player']")
	WebElement infrastructureTourVideo;

	@FindBy(xpath = "//a[@id='tourvideoform:buttnClose11']")
	WebElement infrastructureTourVideoClose;

	@FindBy(id = "addcloudaccount")
	WebElement addCloudAccount_infraHome;

	@FindBy(id = "providerAccForm:accountName")
	WebElement cloudProviderAccountName;

	@FindBy(id = "providerAccForm:cloudobjectkey")
	WebElement objectId;

	@FindBy(id = "providerAccForm:tenantid")
	WebElement tenantId;

	@FindBy(id = "providerAccForm:SubscriptionID")
	WebElement subscriptionId;

	@FindBy(id = "providerAccForm:clientid")
	WebElement clientId;

	@FindBy(id = "providerAccForm:secretkey")
	WebElement secretKey;

	@FindBy(xpath = "//label[contains(text(),'East US (RG Count:')]/parent::li/div/div[2]")
	WebElement eastUSregion;

	@FindBy(id = "providerAccForm:providerregionsave")
	WebElement proceedSync_button;

	@FindBy(xpath = "//button[contains(@id,'agreetermsandConditionForm')]")
	List<WebElement> submitTermsandCondtions_list;

	@FindBy(xpath = "//button[contains(@id,'agreetermsandConditionForm')]")
	List<WebElement> infrastructureTourVideo_list;

	@FindBy(xpath = "//button[contains(@id,'agreetermsandConditionForm')]")
	WebElement submitTermsandCondtions_button;

	@FindBy(xpath = "//div[@id='agreetermsandConditionForm:checkbox']")
	WebElement termsAndConditionsCheckBox;

	@FindBy(xpath = "(//span[@class='pricedata1'])[1]")
	WebElement dashboardLoadingImage;

	@FindBy(xpath = "//div[@id='InfraHomePageForm:infraadvisoryoverviewformtableid']")
	WebElement advisoryDataTableCheck;

	@FindBy(xpath = "(//td[@height='45%']/span)[1]")
	WebElement groupDashboard_check;

	@FindBy(xpath = "(//div[@class='col-8']/div[2]/span)[1]")
	WebElement infraDashboardCheck;

	public AzureCloudPageObjects(WebDriver driver) throws InterruptedException, IOException {
		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);

		System.out.println("All the findBy elements have been Instantiated ");

	}

	public void azure_CloudAccountAddition() throws InterruptedException, IOException {

		waitForElementToAppear(dashboardLoadingImage);
		if (!submitTermsandCondtions_list.isEmpty()) {

			System.out.println("The tour video is displayed");
			termsAndConditionsCheckBox.click();
			submitTermsandCondtions_button.click();
			clickinfrastructure_button();
		} else {
			clickinfrastructure_button();
		}

		if (!infrastructureTourVideo_list.isEmpty()) {
			System.out.println("infrastructure video is displayed ");
			infrastructureTourVideoClose.click();
			addCloudAccount_infraHome.click();
			addCloudAccount();

		} else {
			System.out.println("infrastructure video is not displayed");
			waitForElementToAppear(infraDashboardCheck);
			waitForElementToAppear(advisoryDataTableCheck);

			clickcloudAccountSection();
			waitForElementToAppear(groupDashboard_check);

//			clickCloudAccountAddIcon();
//			Thread.sleep(1000);
//			clickAddNewCloudAccount();
//			addCloudAccount();
		}

	}

	public void addCloudAccount() throws InterruptedException, IOException {
		Thread.sleep(2000);

		cloudProviderAccountName.sendKeys(getInputData("azureCloudProviderName"));
		objectId.sendKeys(getInputData("objectId"));
		tenantId.sendKeys(getInputData("tenantId"));
		subscriptionId.sendKeys(getInputData("subscriptionId"));
		clientId.sendKeys(getInputData("clientId"));
		secretKey.sendKeys(getInputData("secretKey"));

		clickSubmitButton();
		waitForElementToAppear(proceedSync_button);

		clickRegionDropDown();
		Thread.sleep(200);
		eastUSregion.click();
		clickRegionCloseButton();
		// proceedSync_button.click();

	}

}
