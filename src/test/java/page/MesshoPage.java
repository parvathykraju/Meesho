package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MesshoPage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input")
	WebElement Search;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[4]/div/div[5]")
	WebElement MenMenu;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[4]/div/div[6]/div/div[3]/a[5]/p")
	WebElement MenJewellary;
	
	public MesshoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void SearchClick() {
		 
		Search.sendKeys("Sarees",Keys.ENTER);;
	}
	
	public void MenSection() {
		Actions act = new Actions(driver);
		act.moveToElement(MenMenu).build().perform();
		
	}
	
	public void Jwel() {
		
		MenJewellary.click();
	}
}
