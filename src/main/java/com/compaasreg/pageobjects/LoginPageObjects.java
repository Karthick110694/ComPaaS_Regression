package com.compaasreg.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.compaasreg.abstractComponents.AbstractComponents;

public class LoginPageObjects extends AbstractComponents {

	WebDriver driver;

	@FindBy(id = "loginForm:username")
	WebElement usernameInput;

	@FindBy(id = "loginForm:password")
	WebElement passwordInput;

	@FindBy(id = "loginForm:loginButton")
	WebElement submitButton;

	public LoginPageObjects(WebDriver driver) throws IOException {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goTo() throws IOException {
		driver.get(getInputData("continuoqaURL"));
	}

	public WebDriver loginApplication() throws InterruptedException, IOException {

		usernameInput.sendKeys(getInputData("username"));
		passwordInput.sendKeys(getInputData("password"));
		submitButton.click();
		Thread.sleep(5000);

		return driver;
	}

}
