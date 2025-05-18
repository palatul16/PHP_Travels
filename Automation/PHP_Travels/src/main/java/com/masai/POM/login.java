package com.masai.POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.masai.base.BasePage;


public class login extends BasePage{
	
	 	private By customerDropdown = By.xpath("(//a[@data-bs-toggle='dropdown'])[4]");
	    private By customerLogin = By.xpath("//a[@href=\"https://phptravels.net/login\"]");
	    private By nameField =  By.xpath("(//input[@placeholder=\"name@example.com\"])[1]");
	    private By passwordField =  By.id("password");
	    private By checkbox =  By.id("rememberchb");
	    private By clickLogin =  By.id("submitBTN");
	    
	 public login(WebDriver driver) {
		super(driver);
	}

	 public void loginUserCredentials() {
	        driver.findElement(customerDropdown).click();
	        driver.findElement(customerLogin).click();
	        driver.findElement(nameField).sendKeys("user@phptravels.com");
	        driver.findElement(passwordField).sendKeys("demouser");
	        driver.findElement(checkbox).isSelected();
	        driver.findElement(clickLogin).click();
	    }
	}
