package step_cucumberPlaceOrder;

import demoblazeRunPage.PlaceOrder;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PlaceOrderScenarioSteps extends ScenarioSteps{
	private PlaceOrder purchase = new PlaceOrder(getDriver());
	
	@Step
	public void open_page() {
		purchase.open();
	}
	@Step
	public void click_product(String product) throws InterruptedException {
		purchase.chooseProduct(product);
	}
	
	@Step
	public void click_add_to_cart() {
		purchase.clickaddToCart();
	}
	
	@Step
	public void click_cart_button() {
		purchase.clickCart();
	}
		
	@Step
	public void click_placeorder_button() throws InterruptedException {
		purchase.clickPlaceOrder();
	}
			
	@Step
	public void purchase (String name, String creditcard) throws InterruptedException {
		purchase.purchase(name, creditcard);
	}
	
	@Step
	public void click_purchase_button() throws InterruptedException {
		purchase.click_purchase_button();
	}
		
	@Step
	public String get_purchase_success() {
		return purchase.getPurchaseSuccess();
	}
	
	@Step
	public void closepage() {
		purchase.closepage();
	}
	
	@Step
	public void click_ok() {
		purchase.clickOk();
	}

}
