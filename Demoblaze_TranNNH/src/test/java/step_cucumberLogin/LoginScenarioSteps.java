package step_cucumberLogin;
import demoblazeRunPage.LoginDemoblaze;
import demoblazeRunPage.SignupDemoblaze;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginScenarioSteps extends ScenarioSteps {
	LoginDemoblaze login = new LoginDemoblaze(getDriver());
	
	@Step
	public void open_page() {
		login.open();
	}

	@Step
	public void click_login_Button_homePage() {
		login.clickloginButtonHomePage();
	}
	@Step
	public void log_in_with_user_pass(String user, String pass) throws InterruptedException {
		login.loginWithUserPass(user, pass);
	}

	@Step
	public String get_name_of_user() {
		return login.getNameOfUser();
	}
	
	@Step
	public void click_log_in() {
		login.clickLoginButton();
	}
	
	@Step
	public void click_close() {
		login.clickClose();
	}
		
}