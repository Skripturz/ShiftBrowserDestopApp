package org.appiumautomation.ShiftBrowser.DesktopApplication;

import org.testng.annotations.Test;

public class WebBrowser {
	
	@Test
	public static void verifyShiftBrowserDownloaded() {
	        
         Utilities.initiatebrowser();
         Utilities.launchUrl();
         Utilities.verifyFileExistandDelete();
         Utilities.clickonShiftDownload();
         Utilities.waitForFileDownloaded();
         Utilities.verifyFileDownloaded();

	}

}
