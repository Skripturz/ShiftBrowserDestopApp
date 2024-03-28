package org.appiumautomation.ShiftBrowser.DesktopApplication;

import org.junit.Assert;

public class WorkspacePage {

	public static void clickonAddButton() {

		BaseClassSteps.clickElement("workspacePage", "addButton", 2);

	}

	public static void clickonAddWorkspace() {

		BaseClassSteps.clickElement("workspacePage", "addWorkSpace", 2);

	}

	public static void enterUserName() {

		BaseClassSteps.clickElement("workspacePage", "UserNameTextBox");
		BaseClassSteps.SendKeys("workspacePage", "UserNameTextBox", "qaautomationtestingidtwo@gmail.com");

	}

	public static void clickonCreateWorkspace() {

		BaseClassSteps.clickElement("workspacePage", "createworkspace");

	}

	public static void clickonCloseButton() {

		BaseClassSteps.clickElement("workspacePage", "Close", 2);

	}

	public static void enterMailName() {

		BaseClassSteps.clickElement("workspacePage", "nameTextBox");
		BaseClassSteps.SendKeys("workspacePage", "nameTextBox", "qaautomationtestingidtwo@gmail.com");

	}

	public static void clickonNextButton() {

		BaseClassSteps.clickElement("workspacePage", "nextButton");

	}

	public static void enterPasswordName() {

		BaseClassSteps.clickElement("workspacePage", "passwordTextBox");
		BaseClassSteps.SendKeys("workspacePage", "passwordTextBox", "Colan123");

	}

	public static void verifyTitle() {

		Assert.assertEquals("Title is verfied", BaseClassSteps.getText("workspacePage", "titleName"),
				"Shift | qaautomationtestingidone@gmail.com (Primary) | Gmail");

	}

	public static void addingWorkspace() {

		clickonAddButton();
		clickonAddWorkspace();
		enterUserName();
		clickonCreateWorkspace();
		clickonCloseButton();
		enterMailName();
		clickonNextButton();
		enterPasswordName();
		clickonNextButton();
		verifyTitle();

	}
}
