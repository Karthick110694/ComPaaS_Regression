package com.compaasreg.abstractComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbstractComponents_Locators {
	WebDriver driver;

	@FindBy(xpath = "providerAccForm:cloudProvidersselect_label")
	protected WebElement cloudProviderDropDown;

	@FindBy(id = "menuCLinkForm:applicationurltxteqeq")
	protected WebElement infrastructure_button;

	@FindBy(id = "menuCLinkForm:cloudaccountstab121")
	protected WebElement cloudAccountSection;

	@FindBy(id = "menuCLinkForm:dynaButton")
	WebElement cloudAccountAddIcon;

	@FindBy(id = "menuCLinkForm:addcloudmenubuttonid")
	WebElement addNewCloudAccount_cloudSection;

	@FindBy(id = "providerAccForm:providersave")
	WebElement submitButton;

	@FindBy(xpath = "//div[@id='providerAccForm:regionid']")
	WebElement regionDropDown;

	@FindBy(xpath = "(//span[@class='ui-icon ui-icon-circle-close'])[1]")
	WebElement regionCloseButton;

	@FindBy(xpath = "//button[contains(@id,'manageInfraHomeForm:j')]")
	WebElement auditLogRefresh;

	public AbstractComponents_Locators(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCloudProviderDropDown() {
		cloudProviderDropDown.click();
	}

	public void clickinfrastructure_button() {
		infrastructure_button.click();
	}

	public void clickCloudAccountAddIcon() {
		cloudAccountAddIcon.click();
	}

	public void clickAddNewCloudAccount() {
		addNewCloudAccount_cloudSection.click();
	}

	public void clickSubmitButton() {
		submitButton.click();
	}

	public void clickRegionDropDown() {
		regionDropDown.click();
	}

	public void clickRegionCloseButton() {
		regionCloseButton.click();
	}
}
