package com.compaasreg.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.compaasreg.abstractComponents.AbstractComponents;

public class GCPCloudPageObjects extends AbstractComponents {
	AzureCloudPageObjects azureCloudPageObjects;
	AWSCloudPageObjects awsCloudPageObjects;

	@FindBy(xpath = "//ul[@id='providerAccForm:cloudProvidersselect_items']/li[.='GCP']")
	WebElement gcpCloudProviderSelecting;

	@FindBy(id = "providerAccForm:accountid")
	WebElement accountId;

	@FindBy(id = "providerAccForm:projectid")
	WebElement projectId;

	@FindBy(id = "providerAccForm:projectkey")
	WebElement projectKey_fileUpload;

	@FindBy(id = "providerAccForm:jsonkey")
	WebElement jsonKey_fileUpload;

	@FindBy(id = "providerAccForm:providerregionsave")
	WebElement proceedSync_button;

	@FindBy(xpath = "//label[contains(text(),'Iowa (us-central1)')]/parent::li/div/div[2]")
	WebElement regionSelection;

	public GCPCloudPageObjects(WebDriver driver) throws InterruptedException, IOException {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void gcp_CloudAccountAddition() throws IOException, InterruptedException {
		clickCloudAccountAddIcon();
		clickAddNewCloudAccount();

		clickCloudProviderDropDown();
		gcpCloudProviderSelecting.click();
		accountId.sendKeys(getInputData("accountId"));
		projectId.sendKeys(getInputData("projectId"));
		projectKey_fileUpload.sendKeys("projectKey_upload");
		jsonKey_fileUpload.sendKeys(getInputData("jsonKey_upload"));
		waitForElementToAppear(proceedSync_button);

		clickRegionDropDown();
		Thread.sleep(200);
		regionSelection.click();
		clickRegionCloseButton();
		// proceedSync_button.click();

	}
}