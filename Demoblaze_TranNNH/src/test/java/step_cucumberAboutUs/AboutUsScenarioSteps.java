package step_cucumberAboutUs;
import demoblazeRunPage.AboutUsButton;
import demoblazeRunPage.ContactButton;
import demoblazeRunPage.LoginDemoblaze;
import demoblazeRunPage.SignupDemoblaze;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AboutUsScenarioSteps extends ScenarioSteps {
	AboutUsButton aboutus = new AboutUsButton(getDriver());
	
	@Step
	public void open_page() {
		aboutus.open();
	}

	@Step
	public void click_aboutUs_button() throws InterruptedException {
		aboutus.clickAboutUsButton();
		Thread.sleep(3000);
	}
	
	@Step
	public void click_play_video() throws InterruptedException {
		aboutus.clickplayVideo();
		Thread.sleep(2000);
	}
	
	@Step
	public void click_close_button() {
		aboutus.clickClose();
	}
	
	@Step
	public String get_pause_button() {
		return aboutus.getPauseButton();
	}
	
	
	
}
	
