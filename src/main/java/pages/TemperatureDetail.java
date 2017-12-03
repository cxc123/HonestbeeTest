package pages;

import com.sun.jna.platform.win32.WinNT;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TemperatureDetail {


    @AndroidFindBy(id="temperature")
    private WebElement tempeature;
    public TemperatureDetail(AndroidDriver webDriver) {
        this.webDriver = webDriver;
    }

    private AndroidDriver webDriver;
    public void loadTempertaureDetail()
    {


        PageFactory.initElements(new AppiumFieldDecorator(webDriver),this);

    }

    public String getTempertaure()
    {
        try
        {
           return tempeature.getText();


        }
        catch (Exception e)
        {
            e.printStackTrace();
            return  null;
        }

    }



}
