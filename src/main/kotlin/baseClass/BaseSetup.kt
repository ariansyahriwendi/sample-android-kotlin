package baseClass

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.By
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL
import io.appium.java_client.remote.AndroidMobileCapabilityType.*
import io.appium.java_client.remote.MobileCapabilityType.*
import org.openqa.selenium.remote.CapabilityType

object BaseSetUp {
    private lateinit var driver: AppiumDriver<MobileElement>

    fun setup() {
        val caps = DesiredCapabilities()
        caps.setCapability(DEVICE_NAME, "Pixel 6 API 29")
        caps.setCapability(CapabilityType.PLATFORM_NAME, "Android")
        caps.setCapability(PLATFORM_VERSION, "10.0")
        caps.setCapability(AUTOMATION_NAME, "UiAutomator2")
        caps.setCapability(APP_PACKAGE, "com.loginmodule.learning")
        caps.setCapability(APP_ACTIVITY, "com.loginmodule.learning.activities.LoginActivity")
        caps.setCapability(NO_RESET, true)

        val url = URL("http://localhost:4723/wd/hub")
        driver = AndroidDriver(url, caps)
    }

    fun teardown() {
        driver.quit()
    }

    fun reset() {
        driver.resetApp()
    }

    fun click(by: By) {
        val element = driver.findElement(by)
        element.click()
    }

    fun input(by: By, text: String) {
        val element = driver.findElement(by)
        element.sendKeys(text)
    }


}
