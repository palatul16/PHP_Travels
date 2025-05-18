package Tests;

import static org.junit.Assert.assertEquals;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.masai.POM.HomePage;
import com.masai.POM.login;
import com.masai.base.BasePage;

public class loginTest {

		 public loginTest(WebDriver driver) {
			this.driver = driver;
		}

	 	private WebDriver driver;
	    private login Login;
	    private final String baseUrl = "https://phptravels.net/";

	    @BeforeMethod
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        Login = new login(driver);
	    }

	    @Test
	    public void userLogin() throws InterruptedException {
	        Login.loginUserCredentials();
	        Thread.sleep(5000);
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
}
