package weathertest;

import com.sun.javafx.runtime.SystemProperties;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by aakumar on 30/10/17.
 */
public class BaseTest {

    AndroidDriver driver;
    File f = new File(System.getProperty("user.dir")+"/Yahoo Weather_v1.7.8_apkpure.com.apk");
    public String deviceId=System.getProperty("deviceId");
    @BeforeClass
    public void setup() throws Exception
    {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("device", "Android");
        dc.setCapability("deviceName","Android");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platform","Android");
        dc.setCapability("udid",deviceId);
        dc.setCapability("app", f.getAbsolutePath());
       dc.setCapability("noResetValue","false");
        dc.setCapability("appPackage","com.yahoo.mobile.client.android.weather");
      dc.setCapability("appActivity","com.yahoo.mobile.client.android.weather.ui.WeatherMainActivity");
        dc.setCapability("newCommandTimeout",1500);
        driver =  new AndroidDriver<MobileElement>(new URL("http://127.0.0.1"+":"+"4723"+"/wd/hub"),dc);
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);

    }


    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
