package sample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestUploadFile {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
//		uploadfile:
		driver.get("http://the-internet.herokuapp.com/upload");
		WebElement addfile = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/input[1]"));
		addfile.sendKeys("C:\\Users\\A514-54\\Downloads\\tong-hop-cac-phim-tat-eclipse-thuong-duoc-su-dung-nhat.jpg");
		Thread.sleep(2000);
		WebElement submit= driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/input[2]"));
		submit.click();
		Thread.sleep(4000);
//		broken images:
//		driver.get("http://the-internet.herokuapp.com/broken_images");
//		List< WebElement > image_list = driver.findElements(By.tagName("img"));
//		Integer iBrokenImageCount =0;
//		for (WebElement img : image_list) {
//			if (img.getAttribute("naturalWidth").equals("0"))
//			{
//				System.out.println(img.getAttribute("outerHTML") + " is broken.");
//			      iBrokenImageCount++;
//			}
//		}
	}

}
