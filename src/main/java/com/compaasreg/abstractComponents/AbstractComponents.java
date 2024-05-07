package com.compaasreg.abstractComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class AbstractComponents extends AbstractComponents_Locators {
	WebDriver driver;
	Wait<WebDriver> wait;
	FileInputStream fileInputProperties;

	Properties properties;

	public AbstractComponents(WebDriver driver) throws IOException {
		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);
		this.properties = new Properties();

		this.fileInputProperties = new FileInputStream(
				"C:\\Users\\rmuthusivabharath\\Downloads\\CompaasegressionsSuite\\CompaasegressionsSuite\\src\\main\\java\\com\\compaasreg\\dataComponents\\data.properties");

		this.wait = new FluentWait<WebDriver>(this.driver).withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
	}

	public WebElement waitForElementToAppear(WebElement element) throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOf(element));
		Thread.sleep(1000);
		return element;
	}

	public WebElement waitForElementToDisappear(WebElement element) throws InterruptedException {
		wait.until(ExpectedConditions.invisibilityOf(element));
		Thread.sleep(1000);
		return element;
	}

	public WebElement waitForElementToClickable(WebElement element) throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(element));
		Thread.sleep(1000);
		return element;
	}

	public String getInputData(String inputData) throws IOException {
		properties.load(fileInputProperties);

		return properties.getProperty(inputData);

	}

	public void clickcloudAccountSection() throws InterruptedException {
		waitForElementToClickable(cloudAccountSection);
		// Thread.sleep(10000);
		cloudAccountSection.click();
	}

}
