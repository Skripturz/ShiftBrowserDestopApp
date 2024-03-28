package org.appiumautomation.ShiftBrowser.DesktopApplication;

import org.junit.Assert;

public class EnterCredentialsPage {

	public static void enterUserName() {

		BaseClassSteps.clickElement("credentialsPage", "userNameTextBox", 80);
		BaseClassSteps.SendKeys("credentialsPage", "userNameTextBox", "qaautomationtestingidone@gmail.com");

	}

	public static void clickonNextButton() {

		BaseClassSteps.clickElement("credentialsPage", "nextButton");

	}

	public static void enterPasswordName() {

		BaseClassSteps.clickElement("credentialsPage", "passwordTextBox");
		BaseClassSteps.SendKeys("credentialsPage", "passwordTextBox", "Colan123");

	}

	public static void clickonContinueButton() {

		BaseClassSteps.clickElement("credentialsPage", "continueButton", 3);

	}

	public static void clickonAllowButton() {

		BaseClassSteps.clickElement("credentialsPage", "allowButton", 3);

	}

	public static void verifyTitle() {

		Assert.assertEquals("Title is verfied", BaseClassSteps.getText("credentialsPage", "titleName"),
				"Shift | qaautomationtestingidtwo@gmail.com | Gmail");

	}

	public static void enterCredentials() {

		enterUserName();
		clickonNextButton();
		enterPasswordName();
		clickonNextButton();
		clickonContinueButton();
		clickonAllowButton();
		verifyTitle();

	}
}
