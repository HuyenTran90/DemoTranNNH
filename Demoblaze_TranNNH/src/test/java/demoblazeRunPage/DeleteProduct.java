package demoblazeRunPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class DeleteProduct extends PageObject {
	private WebDriver driver;
	
	@FindBy(xpath = "/html/body/nav/div/div/ul/li[4]/a")
	WebElement cart_button;
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	WebElement addtocart_button;
	@FindBy(xpath = "/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[4]/a")
	WebElement delete_product_inCart;
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	WebElement title_product_inCart;
	WebElement product_button;
	
	public DeleteProduct(WebDriver driver) {
		this.driver = driver;
	}
	
	public void chooseProduct (String product ) throws InterruptedException {
		product_button= find(By.xpath("//a[contains(text(),'"+ product + "')]"));
		product_button.click();
		Thread.sleep(4000);
	}
	
	public void clickCart() {
		cart_button.click();
	}
	
	public void clickaddToCart() {
		addtocart_button.click();
	}
	public String getTitle() {
		return title_product_inCart.getText();
	}
	
	public void clickDelete() {
		 delete_product_inCart.click();
	}
	
}