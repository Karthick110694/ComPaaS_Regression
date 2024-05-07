package com.compaasreg.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.compaasreg.pageobjects.AzurePortletValidation;
import com.compaasreg.testcomponents.BaseTest;

public class TestCases_PortletValidation extends BaseTest {

	public TestCases_PortletValidation() {

	}

	@Test
	public void cpuCoreAllocationPortlet() throws IOException {
		AzurePortletValidation azurePortletValidation = new AzurePortletValidation(driver);
		boolean result = azurePortletValidation.checkCpuCoreAllocationPortlet();
		Assert.assertEquals(result, true);
	}

	@Test
	public void vmFlavorInformationPortlet() {

	}

}
