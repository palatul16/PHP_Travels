package Tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.masai.POM.*;

import java.time.Duration;

public class HotelSearchTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeClass
    public void setUp() {
        // Set the path to your chromedriver executable
        
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
        homePage = new HomePage(driver);
    }

    @Test
    public void testHotelSearch() {
        homePage.selectHotelTab();
        homePage.enterCity("Dubai");
        homePage.setDates("01-06-2025", "05-07-2025");
        homePage.setTravelers(2, 0);
        homePage.clickSearch();
        // Add assertions here to verify search results
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
