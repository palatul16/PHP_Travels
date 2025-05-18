package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.masai.POM.*;

import pages.*;

public class HotelBookingTest {
    WebDriver driver;
    HomePage homePage;
    HotelDetailsPage hotelDetailsPage;
    BookingPage bookingPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        hotelDetailsPage = new HotelDetailsPage(driver);
        bookingPage = new BookingPage(driver);
    }

    @Test
    public void testHotelBooking() throws InterruptedException {
        homePage.open();
        Thread.sleep(3000); // wait for page load
        homePage.clickFeaturedHotelDetails();

        Thread.sleep(3000); // wait for details page
        hotelDetailsPage.clickBookNow();

        Thread.sleep(3000); // wait for booking page
        bookingPage.fillGuestDetails("John", "Doe", "john@example.com", "9876543210", "123 Street, Dubai");
        bookingPage.confirmBooking();

        // Add assertion later to validate payment page or confirmation
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
