package core;

import org.openqa.selenium.WebDriver;

public class MainPF {

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
		SignUpPF.validate(driver, "http://alex.academy/exe/signup/www/index.php", browser);
		CommonPF.quit();

		ConfirmationPF.validate(driver, "http://alex.academy/exe/signup/www/confirmation.php", browser);
		CommonPF.quit();
	}
}