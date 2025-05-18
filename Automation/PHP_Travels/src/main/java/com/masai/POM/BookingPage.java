package com.masai.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPage {
    WebDriver driver;

    By firstName = By.name("first_name");
    By lastName = By.name("last_name");
    By email = By.name("email");
    By confirmEmail = By.name("confirm_email");
    By phone = By.name("phone");
    By address = By.name("address");

    By confirmBookingButton = By.id("confirmBooking"); // Change ID if not correct

    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://phptravels.net/hotels/booking");
    }

    public void fillGuestDetails(String fName, String lName, String mail, String phoneNo, String addr) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(confirmEmail).sendKeys(mail);
        driver.findElement(phone).sendKeys(phoneNo);
        driver.findElement(address).sendKeys(addr);
    }

    public void confirmBooking() {
        driver.findElement(confirmBookingButton).click();
    }
}
