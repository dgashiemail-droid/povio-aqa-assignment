package e2e;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HealthCheckTest extends BaseTest {

    @Test
    public void appHealthCheck() {
        driver.get("https://povio-at.herokuapp.com/");
        HomePage home = new HomePage(driver, wait);
        Assert.assertTrue(home.isSignUpVisible());
    }
}
