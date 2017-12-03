package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    @AndroidFindBy(id="addLocationButton")
    private WebElement search;
        public HomePage(AndroidDriver webDriver) {
        this.webDriver = webDriver;
    }

    private AndroidDriver webDriver;
    public void loadHomePage()
    {


            PageFactory.initElements(new AppiumFieldDecorator(webDriver),this);

    }
    public SearchPage gotoSearchPage()
    {
        try {
            new WebDriverWait(webDriver,3000).until(ExpectedConditions.elementToBeClickable(this.search)).click();
            return new SearchPage(webDriver);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return  null;
        }

    }
}
