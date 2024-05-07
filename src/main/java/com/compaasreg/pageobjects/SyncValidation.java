package com.compaasreg.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.compaasreg.abstractComponents.AbstractComponents;

public class SyncValidation extends AbstractComponents {
	WebDriver driver;
	String input = "";

	@FindBy(xpath = "//a[contains(text(),'Azure ACC 1')]")
	WebElement cloudAccountSelecting;

	@FindBy(id = "paneltabForm:manageid")
	WebElement manageButton;

	@FindBy(xpath = "(//div[contains(text(),'Sync')][@class='ellipse-data-table'])[1]")
	WebElement syncMessage;

	@FindBy(xpath = "//span[.='Refresh']/parent::button")
	WebElement refreshButton;

	@FindBy(xpath = "//td[.='Retrieving Audit Logs...']")
	WebElement retrievingButton;

	@FindBy(id = "infradashboardform:syncbtn")
	WebElement syncButton;

	@FindBy(xpath = "//tbody[@id='manageInfraHomeForm:lazyActivityLog_data']/tr[1]/td[6]/span")
	WebElement syncStatusMessage;

	public SyncValidation(WebDriver driver) throws IOException {
		super(driver);
		PageFactory.initElements(driver, this);

		System.out.println("All the findBy elements have been Instantiated ");
	}

	public String getMessage() throws InterruptedException {

		cloudAccountSelecting.click();

		waitForElementToClickable(syncButton);
		manageButton.click();
		syncCheckLoop();
		if (syncStatusMessage.getText().equals("Success")) {
			input = "Success";

		} else {
			input = syncStatusMessage.getText();
		}
		return input;
	}

	public void syncCheckLoop() throws InterruptedException {

		while (true) {
			waitForElementToDisappear(retrievingButton);
			refreshButton.click();

			System.out.println(syncMessage.isDisplayed());
			if (syncMessage.isDisplayed() == true) {
				break;
			}
			Thread.sleep(10000);
		}

	}
}
