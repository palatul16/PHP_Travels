package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.BookingPage;

public class BookingConfirmTest {
    WebDriver driver;
    BookingPage bookingPage;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        bookingPage = new BookingPage(driver);
    }

    @Test
    public void testBookingConfirmation() throws InterruptedException {
        bookingPage.open();

        Thread.sleep(3000); // Wait for form to load

        bookingPage.fillGuestDetails(
            "Ravi", "Kumar", "ravi@example.com", "9876543210", "123 Main Street"
        );

        Thread.sleep(2000); // Wait before confirmation

        bookingPage.confirmBooking();

        Thread.sleep(3000); // Allow time to reach confirmation/payment

        // You can assert confirmation message, URL, etc. here
        System.out.println("Booking process submitted.");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
