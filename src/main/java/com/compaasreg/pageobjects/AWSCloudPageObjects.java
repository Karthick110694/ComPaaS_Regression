package com.compaasreg.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.compaasreg.abstractComponents.AbstractComponents;

public class AWSCloudPageObjects extends AbstractComponents {

	@FindBy(xpath = "//ul[@id='providerAccForm:cloudProvidersselect_items']/li[.='AWS']")
	WebElement cloudProviderSelecting;

	@FindBy(id = "providerAccForm:accountName")
	WebElement cloudProviderName;

	@FindBy(xpath = "//input[@id='providerAccForm:secretkey']")
	WebElement awsSecretKey;

	@FindBy(id = "providerAccForm:accessKey")
	WebElement awsAccessKey;

	@FindBy(xpath = "//label[contains(text(),'US East (N.Virginia)')]/parent::li/div/div[2]")
	WebElement regionSelection;

	@FindBy(id = "providerAccForm:providerregionsave")
	WebElement proceedSync_button;

	public AWSCloudPageObjects(WebDriver driver) throws InterruptedException, IOException {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void aws_CloudAccountAddition() throws IOException, InterruptedException {

		clickCloudAccountAddIcon();
		clickAddNewCloudAccount();
		clickCloudProviderDropDown();
		cloudProviderSelecting.click();
		cloudProviderName.sendKeys(getInputData("AWSCloudProviderName"));
		awsSecretKey.sendKeys(getInputData("secretKey"));
		awsAccessKey.sendKeys(getInputData("accessKey"));
		waitForElementToAppear(proceedSync_button);

		clickRegionDropDown();
		Thread.sleep(200);
		regionSelection.click();
		clickRegionCloseButton();
		// proceedSync_button.click();
	}

}
