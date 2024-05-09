import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Calculator_Test {

    AndroidDriver<AndroidElement> driver; // Android cihazlar icin kullanilmasi gerek driver.
    //AppiumDriver<AndroidElement> driver2; // hem android hem de ios cihazlar icin kullanabilen driver
    //(Android icin bu driver kullanilir)

   // AppiumDriver<MobileElement> driver3; // ios icin kullanilir (Android cihazlar icin de kullanılabilir)

    @Test
    public void Test1() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/yusuf/IdeaProjects/Appium_113/Apps/Calculator_8.6 (612662282)_APKPure (1).apk");

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        /*
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        // capabilities.setCapability(MobileCapabilityType.UDID,"ea3e6f63");
        capabilities.setCapability(MobileCapabilityType.APP,"/Users/yusuf/IdeaProjects/Appium_113/Apps/Calculator_8.6 (612662282)_APKPure (1).apk");
        // capabilities.setCapability(MobileCapabilityType.APP, "/Users/yusuf/IdeaProjects/Appium_T120/Apps/Apk Bilgisi_2.3.4_apkcombo.com (1).apk");

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

         */
    }
}
