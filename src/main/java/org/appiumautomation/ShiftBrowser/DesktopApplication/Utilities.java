package org.appiumautomation.ShiftBrowser.DesktopApplication;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilities {

	public static WebDriver driver;
	private static final String downloadPath = System.getProperty("user.dir") + "\\ExportedFiles";
	public static String fileName = "shift-v9.2.5.1070-stable-x64.exe";

	public static void initiatebrowser() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("disable-infobars");
		options.addArguments("disable-save-password-bubble");
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("safebrowsing.enabled", "false");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void launchUrl() {

		driver.get("https://tryshift.com/");

	}

	public static void clickonShiftDownload() {

		driver.findElement(By.xpath("(//a[text()='Download Shift'])[last()-2]")).click();

	}

	public static void deleteFile(String FileName) {
		File file = new File(downloadPath + "\\" + FileName);
		if (file.exists()) {
			file.delete();
		}
	}

	public static boolean checkFileExists(String FileName) {

		try {
			File file = new File(downloadPath + "\\" + FileName);
			boolean fileBoolean = false;
			if (file.exists()) {
				fileBoolean = true;
			}
			return fileBoolean;
		} catch (Exception e) {
			throw new RuntimeException("Exception while checking file exists");
		}

	}

	public static void waitForFileDownloaded() {

		File file = new File(downloadPath + "\\" + fileName);
		for (int i = 1; i <= 1000; i++) {
			if (file.exists())
				break;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public static void verifyFileExistandDelete() {

		if (checkFileExists(fileName)) {
			deleteFile(fileName);
		}

	}

	public static void verifyFileDownloaded() {

		Assert.assertTrue("Shift browser is downloaded successful", checkFileExists(fileName));

	}
}
