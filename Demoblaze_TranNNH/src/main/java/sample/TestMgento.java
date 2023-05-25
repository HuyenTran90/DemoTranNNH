package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMgento {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		
		WebElement photo= driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/a/span/span/img"));
		photo.click();
		Thread.sleep(2000);
		WebElement size= driver.findElement(By.id("option-label-size-143-item-168"));
		size.click();
		WebElement color= driver.findElement(By.id("option-label-color-93-item-59"));
		color.click();
		
//		Select size= new Select(driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/div/div[3]/div[1]/div")));
//		size.selectByIndex(2);
//		Thread.sleep(2000);
//		Select color= new Select (driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/div/div[3]/div[2]/div")));
//		color.selectByIndex(1);
		
		WebElement submit= driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[2]/div/div/div[2]/button"));
		submit.click();
		Thread.sleep(4000);
		
		WebElement cart= driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a"));
		cart.click();
		WebElement button= driver.findElement(By.id("top-cart-btn-checkout"));
		button.click();
		Thread.sleep(2000);
		
		WebElement email= driver.findElement(By.id("customer-email"));
		email.sendKeys("hongngoc20102@gmail.com");
		WebElement firstName= driver.findElement(By.name("firstname"));
		firstName.sendKeys("Ngoc");
		WebElement lastName= driver.findElement(By.name("lastname"));
		lastName.sendKeys("Tran");
		WebElement company= driver.findElement(By.name("company"));
		company.sendKeys("le academy");
		WebElement address= driver.findElement(By.name("street[0]"));
		address.sendKeys("My An");
		WebElement city= driver.findElement(By.name("city"));
		city.sendKeys("Da Nang");
		Select province= new Select(driver.findElement(By.name("region_id")));
		province.selectByValue("2");
		
		WebElement postalCode= driver.findElement(By.name("postcode"));
		postalCode.sendKeys("12345");
		
		Select country= new Select(driver.findElement(By.name("country_id")));
		country.selectByValue("US");
		
		WebElement phone= driver.findElement(By.name("telephone"));
		phone.sendKeys("0376610833");
		Thread.sleep(2000);
		
		new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input"))).click();
//		WebElement radio= driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input"));
//		radio.click();
		Thread.sleep(2000);
		
		
		WebElement buttonNext= driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button"));
		buttonNext.click();
		Thread.sleep(4000);
		WebElement next= driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button/span"));
		next.click();
		
	
	}

}
