package step_cucumberAddToCart;
import demoblazeRunPage.AddToCart;
import demoblazeRunPage.LoginDemoblaze;
import demoblazeRunPage.SignupDemoblaze;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AddToCartScenarioSteps extends ScenarioSteps {
	AddToCart add = new AddToCart(getDriver());
	
	@Step
	public void open_page() {
		add.open();
	}

	@Step
	public void click_product(String product) throws InterruptedException {
		add.chooseProduct(product);
	}

	@Step
	public void click_add_to_cart() {
		 add.clickaddToCart();
	}

	@Step
	public void click_cart_button () {
		add.clickCart();
	}
	
	@Step
	public String get_title() {
		return add.getTitle();
	}
	
	@Step
	public String get_price() {
		return add.getPrice();
	}
	
	
}