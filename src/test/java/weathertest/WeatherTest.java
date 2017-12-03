package weathertest;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import pages.TemperatureDetail;

public class WeatherTest  extends BaseTest {
    @Test
    public void test() throws Exception
    {
        driver.findElement(By.id(("onboarding_notifications_negative_button"))).click();
        driver.findElement(By.id("onboarding_location_setup_positive_button")).click();
        HomePage homePage = new HomePage(driver);
        homePage.loadHomePage();
        SearchPage searchPage = homePage.gotoSearchPage();
        searchPage.loadSearchPage();
        TemperatureDetail temperatureDetail=searchPage.goToTemperaturePage("Singapore,SG");
        temperatureDetail.loadTempertaureDetail();
        String temperature=temperatureDetail.getTempertaure();
        System.out.println(temperature.substring(0,temperature.length()-1));
        Assert.assertTrue(Integer.valueOf(temperature.substring(0,temperature.length()-1)) > 77,"Temp of Singapore cant be less than 25 celsius");

    }

}
