package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.MesshoPage;

public class MeeshoTest {

	public static WebDriver driver;
	
	@BeforeTest
	
	public void SetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com");
		
	}
	
	@Test
	
	public void TestMeesho() {
		
		MesshoPage ob=new MesshoPage(driver);
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		ob.SearchClick();
		
		ob.MenSection();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//ob.Jwel();
		
	
		 ob.Jwel();
		 
		}
		
		
		
		
	}

