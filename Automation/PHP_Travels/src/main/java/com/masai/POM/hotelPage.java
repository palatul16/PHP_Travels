package pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By hotelTab = By.xpath("//a[@href='#HOTELS']");
    private By cityInput = By.xpath("//span[text()='Search by Hotel or City Name']");
    private By cityTextBox = By.xpath("//div[@id='select2-drop']//input");
    private By checkInInput = By.name("checkin");
    private By checkOutInput = By.name("checkout");
    private By travelersInput = By.id("travellersInput");
    private By adultInput = By.id("adultPlusBtn");
    private By childInput = By.id("childPlusBtn");
    private By searchButton = By.xpath("//button[@type='submit' and contains(text(),'Search')]");
    private By featuredHotelCard = By.xpath("//h5[contains(text(),'Dubai United Arab Emirates')]/ancestor::div[contains(@class, 'card')]//button[contains(text(),'Details')]");
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void open() {
        driver.get("https://phptravels.net/");
    }
    
    public void clickFeaturedHotelDetails() {
        driver.findElement(featuredHotelCard).click();
    }
    
    public void selectHotelTab() {
        driver.findElement(hotelTab).click();
    }

    public void enterCity(String city) {
        driver.findElement(cityInput).click();
        WebElement cityBox = wait.until(ExpectedConditions.elementToBeClickable(cityTextBox));
        cityBox.sendKeys(city);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[@class='select2-match']"), city));
        cityBox.sendKeys(Keys.ENTER);
    }

    public void setDates(String checkIn, String checkOut) {
        WebElement checkInElement = driver.findElement(checkInInput);
        checkInElement.clear();
        checkInElement.sendKeys(checkIn);
        WebElement checkOutElement = driver.findElement(checkOutInput);
        checkOutElement.clear();
        checkOutElement.sendKeys(checkOut);
    }

    public void setTravelers(int adults, int children) {
        driver.findElement(travelersInput).click();
        for (int i = 1; i < adults; i++) {
            driver.findElement(adultInput).click();
        }
        for (int i = 0; i < children; i++) {
            driver.findElement(childInput).click();
        }
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }
}
