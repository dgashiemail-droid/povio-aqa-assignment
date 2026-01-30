package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CampaignPage {

    WebDriver driver;
    WebDriverWait wait;

    By campaignsMenu = By.cssSelector("a[href='/campaigns']");
    By addNewCampaignBtn = By.cssSelector("a[href='/campaigns/new']");

    By nameInput = By.name("campaign[name]");
    By descInput = By.name("campaign[description]");

    By saveBtn = By.cssSelector("input[type='submit'], .btn-primary, [name='commit']");

    public CampaignPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void goToCampaigns() {
        wait.until(ExpectedConditions.elementToBeClickable(campaignsMenu)).click();
    }

    public void addCampaign(String name, String desc) {
        goToCampaigns();
        wait.until(ExpectedConditions.elementToBeClickable(addNewCampaignBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameInput)).sendKeys(name);
        wait.until(ExpectedConditions.visibilityOfElementLocated(descInput)).sendKeys(desc);
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
    }

    public boolean isCampaignVisible(String name) {
        return wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), name));
    }

    By editBtn = By.linkText("Edit");
    By oneTimeRadio = By.xpath("//input[@value='one_time']");
    By updateBtn = By.name("commit");

    public void editCampaign(String newName, String newDesc) {
        wait.until(ExpectedConditions.elementToBeClickable(editBtn)).click();

        var nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(nameInput));
        nameField.clear();
        nameField.sendKeys(newName);

        var descField = driver.findElement(descInput);
        descField.clear();
        descField.sendKeys(newDesc);

        By oneTimeRadio = By.xpath("//input[@value='one_time']");
        wait.until(ExpectedConditions.elementToBeClickable(oneTimeRadio)).click();

        driver.findElement(saveBtn).click();
    }
}