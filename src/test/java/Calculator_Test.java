import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Calculator_Test {

    AndroidDriver<AndroidElement> driver; // Android cihazlar icin kullanilmasi gerek driver.
    AppiumDriver<AndroidElement> driver2; // hem android hem de ios cihazlar icin kullanabilen driver
    //(Android icin bu driver kullanilir)

    AppiumDriver<MobileElement> driver3; // ios icin kullanilir (Android cihazlar icin de kullanılabilir)
}
