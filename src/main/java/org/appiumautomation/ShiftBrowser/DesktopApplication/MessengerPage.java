package org.appiumautomation.ShiftBrowser.DesktopApplication;

import org.junit.Assert;

public class MessengerPage {

	public static void clickonAddButton() {

		BaseClassSteps.clickElement("messengerPage", "addButton", 3);

	}

	public static void clickonAddApplicationButton() {

		BaseClassSteps.clickElement("messengerPage", "addApplicationButton", 2);

	}

	public static void enterSearch() {

		BaseClassSteps.clickElement("messengerPage", "SearchTextBox");
		BaseClassSteps.SendKeys("messengerPage", "SearchTextBox", "Messenger");

	}

	public static void clickonMessengerApp() {

		BaseClassSteps.clickElement("messengerPage", "appName", 5);

	}

	public static void enterAccountName() {

		BaseClassSteps.clickElement("messengerPage", "accountNameTextBox");
		BaseClassSteps.SendKeys("messengerPage", "accountNameTextBox", "QATest");

	}

	public static void clickonSaveButton() {

		BaseClassSteps.clickElement("messengerPage", "saveButton");

	}

	public static void verifyTitle() {

		Assert.assertEquals("Title is verfied", BaseClassSteps.getText("messengerPage", "titleName"),
				"Shift | qaautomationtestingidtwo@gmail.com | Messenger - QATest");

	}

	public static void addMessenger() {

		clickonAddButton();
		clickonAddApplicationButton();
		enterSearch();
		clickonMessengerApp();
		enterAccountName();
		clickonSaveButton();
		verifyTitle();

	}
}
