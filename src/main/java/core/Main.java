package core;

import org.openqa.selenium.WebDriver;
f
public class Main {

	static WebDriver driver;
	static String browser;
	
	public static void main(String[] args) throws Exception {
		browser = System.getProperty("browser");
		if (browser == null) {
			System.err.println("Please provide browser: -Dbrowser=firefox");
			System.exit(0);
		} else if (!browser.equalsIgnoreCase("chrome") && !browser.equalsIgnoreCase("firefox")
				&& !browser.equalsIgnoreCase("safari") && !browser.equalsIgnoreCase("edge")) {
			System.err.println("Framework supports only: Chrome, Firefox, Safari or Edge");
			System.exit(0);
		}
		
		SignUp.validate(driver, "http://alex.academy/exe/signup/www/index.php", browser);
		Common.quit();
		Confirmation.validate(driver, "http://alex.academy/exe/signup/www/confirmation.php", browser);
		Common.quit();
	}
}
