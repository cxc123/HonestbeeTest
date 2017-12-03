package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    @AndroidFindBy(id="location_search_box")
    private WebElement searchText;
    @AndroidFindBy(id="location_name")
    private WebElement selectLocation;
    public SearchPage(AndroidDriver webDriver) {
        this.webDriver = webDriver;
    }

    private AndroidDriver webDriver;
    public void loadSearchPage()
    {


        PageFactory.initElements(new AppiumFieldDecorator(webDriver),this);

    }
    public TemperatureDetail goToTemperaturePage(String text)
    {
        try {
            this.searchText.sendKeys(text);
            this.selectLocation.click();

            return new TemperatureDetail(webDriver);

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return  null;
        }

    }
}
