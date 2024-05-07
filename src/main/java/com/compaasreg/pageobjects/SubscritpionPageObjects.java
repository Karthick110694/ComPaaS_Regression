package com.compaasreg.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscritpionPageObjects {

	@FindBy(id = "menuCLinkForm:root_ZoneLink_TAB_MENU")
	WebElement channelMenu;

	@FindBy(xpath = "//span[@id='collapse-icon']")
	WebElement sideMenu;

	@FindBy(id = "menuCLinkForm:cffsdsdCmdLink")
	WebElement administrationMenu;

	@FindBy(id = "menuCLinkForm:adminurltxt")
	WebElement adminSideExpand;

	@FindBy(id = "menuCLinkForm:cdfdfCmdLinktxt")
	WebElement configurationMenu;

	@FindBy(id = "menuCLinkForm:subscriptioncCmdLink")
	WebElement subscriptionMenu;

	@FindBy(id = "listform:subscriptionAdd")
	WebElement subscriptionAdd;

	@FindBy(id = "productForm:productName")
	WebElement subscriptionPlanName;

	@FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement subscriptionPlanDescription;

	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	WebElement subscriptionIframeTextArea;

	@FindBy(xpath = "(//div[@class=\"ui-radiobutton ui-widget\"])[1]")
	WebElement chooseMarketPlace;

	@FindBy(xpath = "//span[@class=\"ui-button-icon-left ui-icon ui-icon-calendar\"]")
	WebElement startDate;

	@FindBy(xpath = "(//a[@class=' ui-state-default ui-state-highlight'])[1]")
	WebElement availbilityDateSelection;

	@FindBy(id = "productForm:enddateSelect_label")
	WebElement endDateDropDown;

	@FindBy(xpath = "//ul[@id='productForm:enddateSelect_items']/li[2]")
	WebElement neverEnds;

	@FindBy(id = "productForm:currencychoose")
	WebElement currencyDropDown;

	@FindBy(xpath = "//li[contains(text(),'USD: United States Dollar ($)')]")
	WebElement dollarCurrency;

	@FindBy(css = "input#productForm:initialsetupfee_input")
	WebElement setupFee;

	@FindBy(id = "productForm:recurringbillingperiodtype_label")
	WebElement recurringFrequencyDropDown;

	@FindBy(xpath = "//ul[@id='productForm:recurringbillingperiodtype_items']/li[2]")
	WebElement recurringFrequencyDropDown_daily;

	@FindBy(id = "productForm:recurringpricebilling")
	WebElement recurringPrice;

	@FindBy(id = "productForm:metaDataValue")
	WebElement compaasFeaturesVisibility;

	@FindBy(xpath = "//input[@id=\"toogleservicenotvisible\"]/following::span[@class=\"switch-label\"][1]")
	WebElement serviceNowAccount;

	@FindBy(xpath = "//input[@id=\"toogleazuenotvisible\"]/following::span[@class=\"switch-label\"][1]")
	WebElement azureLightHouse;

	@FindBy(xpath = "//input[@id=\"toogleaccesclunotvisible\"]/following::span[@class='switch-label'][1]")
	WebElement inventory;

	@FindBy(id = "productForm:rootProductSubmit")
	WebElement planSubmitButton;

	public SubscritpionPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
