package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import com.masai.POM.HomePage;

public class TestCases {
    private WebDriver driver;
    private HomePage homePage;
    private final String baseUrl = "https://phptravels.net/";

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Test(priority = 0)
    public void testClickLogoRedirectsToHomepage() {
        homePage.clickLogo();
        Assert.assertEquals("https://phptravels.net/", driver.getCurrentUrl());
    }

    @Test(priority = 1)
    public void testFlightsLinkNavigatesToCorrectPage() {
        homePage.clickFlightsLink();
        Assert.assertEquals("https://phptravels.net/", driver.getCurrentUrl());
    }
    
    @Test(priority = 2)
    public void testHotelLinkNavigatesToCorrectPage() {
        homePage.clickhotelLink();
        Assert.assertEquals("https://phptravels.net/", driver.getCurrentUrl());
    }
    
    @Test(priority = 3)
    public void testtoursLinkNavigatesToCorrectPage() {
        homePage.clicktoursLink();
        Assert.assertEquals("https://phptravels.net/", driver.getCurrentUrl());
    }
    
    @Test(priority = 4)
    public void testcarsLinkNavigatesToCorrectPage() {
        homePage.clickcarsLink();
        Assert.assertEquals("https://phptravels.net/", driver.getCurrentUrl());
    }
    
    @Test(priority = 5)
    public void testvisaLinkNavigatesToCorrectPage() {
        homePage.clickvisaLink();
        Assert.assertEquals("https://phptravels.net/", driver.getCurrentUrl());
    }
    
    @Test(priority = 6)
    public void LanguageDropdown_ClickEnglish() {    	
        homePage.openLanguageDropdown();    
    }    
    @Test(dependsOnMethods = "LanguageDropdown_ClickEnglish" )
    public void LanguageDropdown_ClickArabic()  {    	
        homePage.openLanguageDropdownArabic();    
    }    
    @Test(dependsOnMethods = "LanguageDropdown_ClickArabic" )
    public void LanguageDropdown_ClickTurkish()  {    	
        homePage.openLanguageDropdownTurkish();    
    }
    @Test(dependsOnMethods = "LanguageDropdown_ClickTurkish" )
    public void LanguageDropdown_ClickRussian()  {    	
        homePage.openLanguageDropdownRussian();    
    }
    @Test(dependsOnMethods = "LanguageDropdown_ClickRussian" )
    public void LanguageDropdown_ClickFrench()  {    	
        homePage.openLanguageDropdownFrench();    
    }
    @Test(dependsOnMethods = "LanguageDropdown_ClickFrench" )
    public void LanguageDropdown_ClickChineese()  {    	
        homePage.openLanguageDropdownChineese();    
    }
    @Test(dependsOnMethods = "LanguageDropdown_ClickChineese" )
    public void LanguageDropdown_ClickGermany()  {    	
        homePage.openLanguageDropdownGermany();    
    }
    
//    @Test(dependsOnMethods = "testLanguageDropdownShowsAllLanguages" )
//    public void validationOnLanguageSelection() throws InterruptedException {
//    	String exp_english = "English";
//    	String act_english = homePage.selectEnglishLanguage();
//    	System.out.println("Expected : "+exp_english);
//    	System.out.println("Actual : " +act_english);
//    	Assert.assertEquals(act_english.trim(), exp_english.trim());
//    }
    
    @Test(priority = 7)
    public void validateLanguageDropdownSelectionEnglish() throws InterruptedException {
        String expectedLanguage = "English";
        System.out.println("Expected Language: " + expectedLanguage);
        String actualLanguage = homePage.selectLanguage(expectedLanguage);
        System.out.println("Actual Language: " + actualLanguage);
        Assert.assertNotNull(actualLanguage, "Language '" + expectedLanguage + "' was not found in the dropdown.");
        Assert.assertEquals(actualLanguage.toLowerCase(), expectedLanguage.toLowerCase(), "Language mismatch!");
    }
    
    @Test(priority = 8)
    public void validateLanguageDropdownSelectionArabic() throws InterruptedException {
        String expectedLanguage = "Arabic";
        System.out.println("Expected Language: " + expectedLanguage);
        String actualLanguage = homePage.selectLanguage(expectedLanguage);
        System.out.println("Actual Language: " + actualLanguage);
        Assert.assertNotNull(actualLanguage, "Language '" + expectedLanguage + "' was not found in the dropdown.");
        Assert.assertEquals(actualLanguage.toLowerCase(), expectedLanguage.toLowerCase(), "Language mismatch!");
    }
    
    @Test(priority = 9)
    public void validateLanguageDropdownSelectionTurkish() throws InterruptedException {
        String expectedLanguage = "Turkish";
        System.out.println("Expected Language: " + expectedLanguage);
        String actualLanguage = homePage.selectLanguage(expectedLanguage);
        System.out.println("Actual Language: " + actualLanguage);
        Assert.assertNotNull(actualLanguage, "Language '" + expectedLanguage + "' was not found in the dropdown.");
        Assert.assertEquals(actualLanguage.toLowerCase(), expectedLanguage.toLowerCase(), "Language mismatch!");
    }
    
    @Test(priority = 10)
    public void validateLanguageDropdownSelectionRussian() throws InterruptedException {
        String expectedLanguage = "Russian";
        System.out.println("Expected Language: " + expectedLanguage);
        String actualLanguage = homePage.selectLanguage(expectedLanguage);
        System.out.println("Actual Language: " + actualLanguage);
        Assert.assertNotNull(actualLanguage, "Language '" + expectedLanguage + "' was not found in the dropdown.");
        Assert.assertEquals(actualLanguage.toLowerCase(), expectedLanguage.toLowerCase(), "Language mismatch!");
    }
    
    @Test(priority = 11)
    public void validateLanguageDropdownSelectionFrench() throws InterruptedException {
        String expectedLanguage = "French";
        System.out.println("Expected Language: " + expectedLanguage);
        String actualLanguage = homePage.selectLanguage(expectedLanguage);
        System.out.println("Actual Language: " + actualLanguage);
        Assert.assertNotNull(actualLanguage, "Language '" + expectedLanguage + "' was not found in the dropdown.");
        Assert.assertEquals(actualLanguage.toLowerCase(), expectedLanguage.toLowerCase(), "Language mismatch!");
    }
    
    @Test(priority = 12)
    public void validateLanguageDropdownSelectionChinese() throws InterruptedException {
        String expectedLanguage = "Chinese";
        System.out.println("Expected Language: " + expectedLanguage);
        String actualLanguage = homePage.selectLanguage(expectedLanguage);
        System.out.println("Actual Language: " + actualLanguage);
        Assert.assertNotNull(actualLanguage, "Language '" + expectedLanguage + "' was not found in the dropdown.");
        Assert.assertEquals(actualLanguage.toLowerCase(), expectedLanguage.toLowerCase(), "Language mismatch!");
    }
    
    @Test(priority = 13)
    public void validateLanguageDropdownSelectionGermany() throws InterruptedException {
        String expectedLanguage = "Germany";
        System.out.println("Expected Language: " + expectedLanguage);
        String actualLanguage = homePage.selectLanguage(expectedLanguage);
        System.out.println("Actual Language: " + actualLanguage);
        Assert.assertNotNull(actualLanguage, "Language '" + expectedLanguage + "' was not found in the dropdown.");
        Assert.assertEquals(actualLanguage.toLowerCase(), expectedLanguage.toLowerCase(), "Language mismatch!");
    }
 
//	
    @Test(priority = 14)
    public void CurrencyDropdownEUR() {
        homePage.openCurrencyDropdownEUR();
    }
    
    @Test (priority = 15)
    public void CurrencyDropdownPHP() {
        homePage.openCurrencyDropdownPHP();
    }
    
    
    @Test(priority = 16)
    public void CurrencyDropdownSAR() {
        homePage.openCurrencyDropdownSAR();
    }
    
    @Test(priority = 17)
    public void CurrencyDropdownGBP() {
        homePage.openCurrencyDropdownGBP();
    }
    
    @Test(priority = 18)
    public void CurrencyDropdownUSD() {
        homePage.openCurrencyDropdownUSD();
    }
    
    @Test(priority = 19)
    public void userLoginDropdown() {
        homePage.loginUserDropdown();
    }
    @Test(priority = 20)
    public void userLogin() throws InterruptedException {
        homePage.loginUserCredentials();
        Thread.sleep(5000);
    }
    
    


    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.quit();
    }
}
