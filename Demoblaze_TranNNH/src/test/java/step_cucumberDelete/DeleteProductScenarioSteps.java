package step_cucumberDelete;

import demoblazeRunPage.DeleteProduct;
import demoblazeRunPage.LoginDemoblaze;
import demoblazeRunPage.SignupDemoblaze;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DeleteProductScenarioSteps extends ScenarioSteps {
	DeleteProduct delete = new DeleteProduct(getDriver());
	
	@Step
	public void open_page() {
		delete.open();
	}

	@Step
	public void click_product(String product) throws InterruptedException {
		delete.chooseProduct(product);
	}

	@Step
	public void click_add_to_cart() {
		 delete.clickaddToCart();
	}

	@Step
	public void click_cart_button () {
		delete.clickCart();
	}
	
	@Step
	public String get_title() {
		return delete.getTitle();
	}
	
	@Step
	public void click_delete() {
		 delete.clickDelete();
	}
	
}