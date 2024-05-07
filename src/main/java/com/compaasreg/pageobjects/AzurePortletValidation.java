package com.compaasreg.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.compaasreg.abstractComponents.AbstractComponents;

public class AzurePortletValidation extends AbstractComponents {

	WebDriver driver;
	@FindBy(xpath = "//div[@id='cpuchartdiv']")
	WebElement cpuCoreAllocationPortlet;

	@FindBy(xpath = "//div[@id='barchart1']")
	WebElement vmFlavorInformationPortlet;

	@FindBy(xpath = "//div[@id='awsFlavoursChart']")
	WebElement vmFlavorSeriesPortlet;

	@FindBy(xpath = "//div[@id='diskinfochart']")
	WebElement diskAllocationPortlet;

	@FindBy(xpath = "//div[@id='storagePiechartdiv']")
	WebElement storageAccountAllocationPortlet;

	@FindBy(xpath = "//div[@id='costchart']")
	WebElement storageAccountSizeInformationPortlet;

	@FindBy(xpath = "//div[@id='paasserver_costchart']")
	WebElement paasAllocationPortlet;

	@FindBy(xpath = "//div[@id='AvailabilityDonutPiechart']")
	WebElement availabilitySetAllocationPortlet;

	@FindBy(xpath = "//div[@id='containerTreeviewdiv']")
	WebElement containerAllocationPortlet;

	@FindBy(xpath = "//div[@id='loadbalancerinfochart']")
	WebElement loadBalancerPortlet;

	@FindBy(xpath = "//div[@id='containerregistrychart']")
	WebElement containerRegistryAllocationPortlet;

	@FindBy(xpath = "//div[@id='azurefunctionandlambdachart']")
	WebElement serverlessComputationPortlet;

	@FindBy(xpath = "//div[@id='vmscalesetchart']")
	WebElement vmScaleSetAllocationPortlet;

	@FindBy(xpath = "//div[@id='SecurityGrpDonutPiechartdiv']")
	WebElement networkSecurityGroupAllocationPortlet;

	@FindBy(xpath = "//div[@id='elasticipchart']")
	WebElement publicIpAllocationPortlet;

	@FindBy(xpath = "//div[@id='virtualNwkPiechartdiv']")
	WebElement virtualNetworkAllocationPortlet;

	@FindBy(xpath = "//div[@id='NwkInterfaceDonutPiechartdiv']")
	WebElement networkInterfaceAllocationPortlet;

	@FindBy(xpath = "//div[@id='appgatewaychart']")
	WebElement applicationGatewayAllocationPortlet;

	@FindBy(xpath = "//div[@id='resourcegrapchart']")
	WebElement resourceGroupApplicationPortlet;

	public AzurePortletValidation(WebDriver driver) throws IOException {
		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public boolean checkCpuCoreAllocationPortlet() {

		return cpuCoreAllocationPortlet.isDisplayed();
	}

	public boolean checkVmFlavorInformationPortlet() {

		return vmFlavorInformationPortlet.isDisplayed();
	}

	public boolean checkVmFlavorSeriesPortlet() {

		return vmFlavorSeriesPortlet.isDisplayed();
	}

	public boolean checkDiskAllocationPortlet() {

		return diskAllocationPortlet.isDisplayed();
	}

	public boolean checkStorageAccountAllocationPortlet() {

		return storageAccountAllocationPortlet.isDisplayed();
	}

	public boolean checkStorageAccountSizeInformationPortlet() {

		return storageAccountSizeInformationPortlet.isDisplayed();
	}

	public boolean checkPaasAllocationPortlet() {

		return paasAllocationPortlet.isDisplayed();
	}

	public boolean checkavailabilitySetAllocationPortlet() {

		return availabilitySetAllocationPortlet.isDisplayed();
	}

	public boolean checkContainerAllocationPortlet() {

		return containerAllocationPortlet.isDisplayed();
	}

	public boolean checkLoadBalancerPortlet() {

		return loadBalancerPortlet.isDisplayed();
	}

	public boolean checkContainerRegistryAllocationPortlet() {

		return containerRegistryAllocationPortlet.isDisplayed();
	}

	public boolean checkServerlessComputationPortlet() {

		return serverlessComputationPortlet.isDisplayed();
	}

	public boolean checkvmScaleSetAllocationPortlet() {

		return vmScaleSetAllocationPortlet.isDisplayed();
	}

	public boolean checkNetworkSecurityGroupAllocationPortlet() {

		return networkSecurityGroupAllocationPortlet.isDisplayed();
	}

	public boolean checkPublicIpAllocationPortlet() {

		return publicIpAllocationPortlet.isDisplayed();
	}

	public boolean checkVirtualNetworkAllocationPortlet() {

		return virtualNetworkAllocationPortlet.isDisplayed();
	}

	public boolean checknetworkInterfaceAllocationPortlet() {

		return networkInterfaceAllocationPortlet.isDisplayed();
	}

	public boolean checkApplicationGatewayAllocationPortlet() {

		return applicationGatewayAllocationPortlet.isDisplayed();
	}

	public boolean checkResourceGroupApplicationPortlet() {

		return resourceGroupApplicationPortlet.isDisplayed();
	}
}
