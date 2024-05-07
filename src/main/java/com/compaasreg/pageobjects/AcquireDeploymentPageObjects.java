package com.compaasreg.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcquireDeploymentPageObjects {

	@FindBy(xpath = "//a[@id='menuCLinkForm:appcCmdLink']")
	WebElement applications_SideMenu;

	public AcquireDeploymentPageObjects() {

	}
}
