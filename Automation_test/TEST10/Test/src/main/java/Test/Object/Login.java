package Test.Object;

import org.openqa.selenium.*;


public class Login extends BaseClass {

	private static WebElement element = null;

	public Login(WebDriver driver) {

		super(driver);
	}

	public static WebElement txt_UserName() {
		try {
			element = driver.findElement(By.xpath("//input[@id='formHorizontalEmail']"));

		} catch (Exception e) {
			System.out.println("Not found Email text field in Login page");
		}

		return element;

	}

	public static WebElement txt_Pass() {
		try {
			element = driver.findElement(By.id("formHorizontalPassword"));
		} catch (Exception e) {
			System.out.println("Not found Password text field in Login page");
		}

		return element;

	}

	public static WebElement btn_Login() {
		try {
			element = driver.findElement(By.xpath("//a[@class='col-login__btn']"));
		} catch (Exception e) {
			System.out.println("Not found Login button in Login page");
		}

		return element;

	}
	


}
