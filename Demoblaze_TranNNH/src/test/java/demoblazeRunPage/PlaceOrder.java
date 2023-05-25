package demoblazeRunPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoblaze.com/")
public class PlaceOrder extends PageObject{
	private WebDriver driver;
	
	@FindBy(xpath = "/html/body/nav/div/div/ul/li[4]/a")
	WebElement cart_button;
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	WebElement addtocart_button;
	WebElement product_button;
	@FindBy(xpath ="/html/body/div[6]/div/div[2]/button")
	WebElement placeorder_button;
	@FindBy(id = "name")
	WebElement nametextbox;
	@FindBy(id = "country")
	WebElement countrytextbox;
	@FindBy(id = "city")
	WebElement citytextbox;
	@FindBy(id = "card")
	WebElement cardtextbox;
	@FindBy(id = "month")
	WebElement monthtextbox;
	@FindBy(id = "year")
	WebElement yeartextbox;
	@FindBy(xpath = "//button[contains(text(),'Purchase')]")
	WebElement purchase_button;
	@FindBy(xpath = "//h2[contains(text(),'Thank you for your purchase!')]")
	WebElement purchasetitle;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement closepurchase;
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	WebElement title_productCart;
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
	WebElement price_productCart;
	@FindBy(xpath ="//button[contains(text(),'OK')]")
	WebElement ok_button;
	@FindBy(xpath ="/html[1]/body[1]/div[10]/h2[1]")
	WebElement purchase_success;

	public PlaceOrder (WebDriver driver) {
		this.driver = driver;
	}
	
	public void chooseProduct (String product) throws InterruptedException {
		product_button= find(By.xpath("//a[contains(text(),'"+ product + "')]"));
		product_button.click();
		Thread.sleep(3000);
	}
	
	public void clickaddToCart() {
		addtocart_button.click();
	}
	
	public void clickCart() {
		cart_button.click();
	}
		
	public void clickPlaceOrder() throws InterruptedException {
		placeorder_button.click();
		Thread.sleep(3000);
	}
		
	public void purchase (String name, String creditcard) throws InterruptedException {
		nametextbox.sendKeys(name);
		cardtextbox.sendKeys(creditcard);
		Thread.sleep(3000);
	}
	
	public void click_purchase_button() throws InterruptedException {
		purchase_button.click();
		Thread.sleep(3000);
	}
	
	public String getPurchaseSuccess() {
		return purchase_success.getText();
		
	}
	
	public void closepage() {
		closepurchase.click();
	}
	
	public void clickOk() {
		ok_button.click();
	}

}
