package org.appiumautomation.ShiftBrowser.DesktopApplication;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DesktopApp {

	@BeforeClass
	public static void setWindowsCapabilities() {

		BaseClassSteps.initiateDriverProperties();

	}

	@Test(priority = 1)
	public static void lauchApp() {

		WelcomePage.welcomeScreen();
		EnterCredentialsPage.enterCredentials();

	}

	@Test(priority = 2)
	public static void addingWorkspace() {

		WorkspacePage.addingWorkspace();

	}

	@Test(priority = 3)
	public static void addingMessenger() {

		MessengerPage.addMessenger();
	}

	@Test(priority = 4)
	public static void verifyShiftVersion() {

		SettingPage.verifyshiftversion();
	}

	@AfterClass
	public static void tearDownSteps() {

		BaseClassSteps.exitApplication();

	}
}
