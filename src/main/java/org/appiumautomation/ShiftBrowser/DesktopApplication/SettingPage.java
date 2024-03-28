package org.appiumautomation.ShiftBrowser.DesktopApplication;

import org.junit.Assert;

public class SettingPage {

	public static void clickonSettingsMenu() {

		BaseClassSteps.clickElement("settingsPage", "settingsMenu", 5);

	}

	public static void clickonAdvanceSettingsButton() {

		BaseClassSteps.clickElement("settingsPage", "advanceSettingsButton", 5);

	}

	public static void verifyshiftversion() {

		clickonSettingsMenu();
		clickonAdvanceSettingsButton();
		Assert.assertEquals("Version is verfied", BaseClassSteps.getText("settingsPage", "shiftVersion"), "9.2.5.1070");

	}
}
