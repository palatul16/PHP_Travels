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

public class HomePage extends BasePage {
    private By logo = By.cssSelector(".navbar-brand");
    private By flightsLink = By.xpath("//button[@class='nav-link w-100 active waves-effect']");
    private By hotelLink = By.xpath("//button[@data-bs-target='#tab-hotels']");
    private By toursLink = By.xpath("//button[@data-bs-target='#tab-tours']");
    private By carsLink = By.xpath("//button[@data-bs-target='#tab-cars']");
    private By visaLink = By.xpath("//button[@data-bs-target='#tab-visa']");
//    private By languageDropdown = By.xpath("//a[@class='nav-link dropdown-toggle btn ps-3 p-0 py-2 px-0 text-center d-flex align-items-center justify-content-center gap-0 border rounded-4 waves-effect']");
    private By languageDropdown = By.xpath("(//a[@data-bs-toggle='dropdown'])[1]");
    private By languageEnglish = By.xpath("(//ul[contains(@class,'dropdown-menu')])[1]//a");
    private By languageArabic = By.xpath("//a[@href=\"https://phptravels.net/language/sa/Arabic/RTL\"]");
    private By languageTurkish = By.xpath("//a[@href=\"https://phptravels.net/language/tr/Turkish/LTR\"]");
    private By languageRussian = By.xpath("//a[@href=\"https://phptravels.net/language/ru/Russian/LTR\"]");
    private By languageFrench = By.xpath("//a[@href=\"https://phptravels.net/language/fr/French/LTR\"]");
    private By languageChinese = By.xpath("//a[@href=\"https://phptravels.net/language/cn/Chinese/LTR\"]");
    private By languageGermany = By.xpath("//a[@href=\"https://phptravels.net/language/de/Germany/LTR\"]");
    
    private By currencyDropdown = By.xpath("(//a[@data-bs-toggle='dropdown'])[2]");
    private By CurrencyEUR = By.xpath("//a[@href=\"https://phptravels.net/currency/EUR\"]");
    private By CurrencyPHP = By.xpath("//a[@href=\"https://phptravels.net/currency/PHP\"]");
    private By CurrencySAR = By.xpath("//a[@href=\"https://phptravels.net/currency/SAR\"]");
    private By CurrencyGBP = By.xpath("//a[@href=\"https://phptravels.net/currency/GBP\"]");
    private By CurrencyUSD = By.xpath("//a[@href=\"https://phptravels.net/currency/USD\"]");
    
    private By customerDropdown = By.xpath("(//a[@data-bs-toggle='dropdown'])[4]");
    private By customerLogin = By.xpath("//a[@href=\"https://phptravels.net/login\"]");
    private By nameField =  By.xpath("(//input[@placeholder=\"name@example.com\"])[1]");
    private By passwordField =  By.id("password");
    private By checkbox =  By.id("rememberchb");
    private By clickLogin =  By.id("submitBTN");
    
    public HomePage(WebDriver driver) {
        super(driver);
    }	

    public void clickLogo() {
        driver.findElement(logo).click();
    }

    public void clickFlightsLink() {
        driver.findElement(flightsLink).click();
    }
    
    public void clickhotelLink() {
        driver.findElement(hotelLink).click();
    }
    
    public void clicktoursLink() {
        driver.findElement(toursLink).click();
    }
    
    public void clickcarsLink() {
        driver.findElement(carsLink).click();
    }
    
    public void clickvisaLink() {
    	
        driver.findElement(visaLink).click();
    }

    public void openLanguageDropdown() {
        driver.findElement(languageDropdown).click();
        driver.findElement(languageEnglish).click();
    }
    public void openLanguageDropdownArabic() {
        driver.findElement(languageDropdown).click();
        driver.findElement(languageArabic).click();
    }
    public void openLanguageDropdownTurkish() {
        driver.findElement(languageDropdown).click();
        driver.findElement(languageTurkish).click();
    }
    public void openLanguageDropdownRussian() {
        driver.findElement(languageDropdown).click();
        driver.findElement(languageRussian).click();
    }
    public void openLanguageDropdownFrench() {
        driver.findElement(languageDropdown).click();
        driver.findElement(languageFrench).click();
    }
    public void openLanguageDropdownChineese() {
        driver.findElement(languageDropdown).click();
        driver.findElement(languageChinese).click();
    }
    public void openLanguageDropdownGermany() {
        driver.findElement(languageDropdown).click();
        driver.findElement(languageGermany).click();
    }
    
    
    public String selectLanguage(String targetLanguage) throws InterruptedException {
        driver.findElement(languageDropdown).click();
        Thread.sleep(1000); // You may replace with WebDriverWait for better stability
        List<WebElement> options = driver.findElements(languageEnglish);
        for (WebElement option : options) {
            String actualLanguage = option.getText();
            if (actualLanguage.equalsIgnoreCase(targetLanguage)) {
                option.click();
                return actualLanguage;
            }
        }
        return null; // Not found
    }
    
    public String selectLanguage2(String targetLanguage) throws InterruptedException {
        driver.findElement(languageDropdown).click();
        Thread.sleep(1000); // You may replace with WebDriverWait for better stability
        List<WebElement> options = driver.findElements(languageArabic);
        for (WebElement option : options) {
            String actualLanguage = option.getText();
            if (actualLanguage.equalsIgnoreCase(targetLanguage)) {
                option.click();
                return actualLanguage;
            }
        }
        return null; // Not found
    }
    
    public String selectLanguage3(String targetLanguage) throws InterruptedException {
        driver.findElement(languageDropdown).click();
        Thread.sleep(1000); // You may replace with WebDriverWait for better stability
        List<WebElement> options = driver.findElements(languageTurkish);
        for (WebElement option : options) {
            String actualLanguage = option.getText();
            if (actualLanguage.equalsIgnoreCase(targetLanguage)) {
                option.click();
                return actualLanguage;
            }
        }
        return null; // Not found
    }
    
    public String selectLanguage4(String targetLanguage) throws InterruptedException {
        driver.findElement(languageDropdown).click();
        Thread.sleep(1000); // You may replace with WebDriverWait for better stability
        List<WebElement> options = driver.findElements(languageRussian);
        for (WebElement option : options) {
            String actualLanguage = option.getText();
            if (actualLanguage.equalsIgnoreCase(targetLanguage)) {
                option.click();
                return actualLanguage;
            }
        }
        return null; // Not found
    }
    
    public String selectLanguage5(String targetLanguage) throws InterruptedException {
        driver.findElement(languageDropdown).click();
        Thread.sleep(1000); // You may replace with WebDriverWait for better stability
        List<WebElement> options = driver.findElements(languageFrench);
        for (WebElement option : options) {
            String actualLanguage = option.getText();
            if (actualLanguage.equalsIgnoreCase(targetLanguage)) {
                option.click();
                return actualLanguage;
            }
        }
        return null; // Not found
    }
    
    public String selectLanguage6(String targetLanguage) throws InterruptedException {
        driver.findElement(languageDropdown).click();
        Thread.sleep(1000); // You may replace with WebDriverWait for better stability
        List<WebElement> options = driver.findElements(languageChinese);
        for (WebElement option : options) {
            String actualLanguage = option.getText();
            if (actualLanguage.equalsIgnoreCase(targetLanguage)) {
                option.click();
                return actualLanguage;
            }
        }
        return null; // Not found
    }
    
    public String selectLanguage7(String targetLanguage) throws InterruptedException {
        driver.findElement(languageDropdown).click();
        Thread.sleep(1000); // You may replace with WebDriverWait for better stability
        List<WebElement> options = driver.findElements(languageGermany);
        for (WebElement option : options) {
            String actualLanguage = option.getText();
            if (actualLanguage.equalsIgnoreCase(targetLanguage)) {
                option.click();
                return actualLanguage;
            }
        }
        return null; // Not found
    }

    public void openCurrencyDropdownEUR() {
        driver.findElement(currencyDropdown).click();
        driver.findElement(CurrencyEUR).click();
    }
    
    public void openCurrencyDropdownPHP() {
        driver.findElement(currencyDropdown).click();
        driver.findElement(CurrencyPHP).click();
    }
    
    public void openCurrencyDropdownSAR() {
        driver.findElement(currencyDropdown).click();
        driver.findElement(CurrencySAR).click();
    }
    
    public void openCurrencyDropdownGBP() {
        driver.findElement(currencyDropdown).click();
        driver.findElement(CurrencyGBP).click();
    }
    
    public void openCurrencyDropdownUSD() {
        driver.findElement(currencyDropdown).click();
        driver.findElement(CurrencyUSD).click();
    }

    public void loginUserDropdown() {
        driver.findElement(customerDropdown).click();
        driver.findElement(customerLogin).click();
    }
    
    public void loginUserCredentials() throws InterruptedException {
        driver.findElement(customerDropdown).click();
        driver.findElement(customerLogin).click();
        driver.findElement(nameField).sendKeys("user@phptravels.com");
        driver.findElement(passwordField).sendKeys("demouser");
        driver.findElement(checkbox).click();
        driver.findElement(clickLogin).click();
    }
    
    
    
    
    
    
    
    
    
}
