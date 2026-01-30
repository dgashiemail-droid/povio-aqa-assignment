package e2e;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test(description = "Verify successful and duplicate registration in one session")
    public void verifyRegistrationFlow() {
        driver.get("https://povio-at.herokuapp.com/users/sign_up");
        RegisterPage register = new RegisterPage(driver, wait);

        String name = "Tester" + System.currentTimeMillis();
        String email = "user" + System.currentTimeMillis() + "@mail.com";
        String password = "Test1234!";

        register.register(name, email, password);

        DashboardPage dashboard = new DashboardPage(driver, wait);
        Assert.assertTrue(dashboard.isVisible(), "Dashboard should be visible.");

        driver.manage().deleteAllCookies();

        driver.get("https://povio-at.herokuapp.com/users/sign_up");
        register.register(name, email, password);

        Assert.assertTrue(register.isErrorVisible(), "Duplicate error message should be visible.");
    }
}