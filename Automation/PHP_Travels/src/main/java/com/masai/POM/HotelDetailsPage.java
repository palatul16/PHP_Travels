package com.masai.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelDetailsPage {
    WebDriver driver;

    By bookNowButton = By.xpath("//button[contains(text(),'Book Now')]");

    public HotelDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBookNow() {
        driver.findElement(bookNowButton).click();
    }
}
