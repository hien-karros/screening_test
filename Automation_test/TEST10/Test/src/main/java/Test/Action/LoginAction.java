package Test.Action;

import org.openqa.selenium.support.ui.ExpectedConditions;

import Test.Object.BaseClass;
import Test.Object.Login;
import Test.Utility.utility;

public class LoginAction {
	public static void input_Email(String email) {
		Login.txt_UserName().sendKeys(email);
	}

	public static void input_Pass(String pass) {
		Login.txt_Pass().sendKeys(pass);
	}

	public static void click_Login() throws Exception {
		Login.btn_Login().click();
	}

	public static void loginToSystem() throws Exception {
		input_Email(utility.Email);
		input_Pass(utility.Password);
		click_Login();
	}

}
