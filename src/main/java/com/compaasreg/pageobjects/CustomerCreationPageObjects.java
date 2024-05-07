package com.compaasreg.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerCreationPageObjects {

	@FindBy(id = "listform:zoneaddicon")
	WebElement customerAdding_button;

	@FindBy(id = "zoneAddContainerForm:zoneName")
	WebElement accountName_input;

	@FindBy(id = "zoneAddContainerForm:organizationName")
	WebElement companyName_input;

	@FindBy(id = "zoneAddContainerForm:city")
	WebElement city_input;

	@FindBy(id = "zoneAddContainerForm:countrylist_label")
	WebElement country_DropDown;

	@FindBy(xpath = "//li[.='United States']")
	WebElement countrySelection_DropDown;

	@FindBy(id = "zoneAddContainerForm:phoneNumber")
	WebElement phoneNumber_input;

	@FindBy(id = "zoneAddContainerForm:firstName")
	WebElement firstName_input;

	@FindBy(id = "zoneAddContainerForm:lastName")
	WebElement lastName_input;

	@FindBy(id = "zoneAddContainerForm:email")
	WebElement email_input;

	@FindBy(xpath = "//tbody[@id='listform:list1_data']/tr/td/span[.='AutomationCloudAccount']")
	WebElement customerFinding;

	@FindBy(id = "zoneprofileformNew:switchButton")
	WebElement customerSwtiching;

	@FindBy(xpath = "//span[.='Parent AccountSubscription']/following::td/button/span[.='Buy Now']")
	WebElement buyNow_button;

	@FindBy(id = "productViewForm:proceesPayementID")
	WebElement subcribe_button;

	@FindBy(id = "paymentStatusForm:subscriptionInactiveOkId")
	WebElement subscriptionOk_button;

	@FindBy(id = "productViewForm:gotosubsclandingpageId")
	WebElement goToLandingPageButton;

	public CustomerCreationPageObjects(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
}
