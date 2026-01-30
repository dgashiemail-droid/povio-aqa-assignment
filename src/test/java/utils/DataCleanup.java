package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataCleanup {
    public static void resetData(WebDriver driver, WebDriverWait wait) {
        // 1. Navigate to the campaigns list
        driver.get("https://povio-at.herokuapp.com/campaigns");

        // 2. Locate the Destroy button (linkText 'Destroy' from your screenshot)
        By destroyBtn = By.linkText("Destroy");

        // 3. If a campaign exists, delete it
        if (!driver.findElements(destroyBtn).isEmpty()) {
            wait.until(ExpectedConditions.elementToBeClickable(destroyBtn)).click();

            // 4. Handle the browser confirmation popup (required for 'Destroy' actions)
            driver.switchTo().alert().accept();

            // Wait for the success message to ensure deletion finished
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-success")));
        }
    }
}