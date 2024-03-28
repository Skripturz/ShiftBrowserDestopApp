package org.appiumautomation.ShiftBrowser.DesktopApplication;

public class WelcomePage {

	public static void clickOnPrivactCheckBox() {

		BaseClassSteps.clickElement("welcomePage", "privacyPolicyCheckBox", 5);

	}

	public static void clickonSignInButton() {

		BaseClassSteps.clickElement("welcomePage", "signInWithGoogleButton");

	}

	public static void welcomeScreen() {

		clickOnPrivactCheckBox();
		clickonSignInButton();

	}
}
