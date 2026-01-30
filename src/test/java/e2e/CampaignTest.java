package e2e;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CampaignPage;

public class CampaignTest extends BaseTest {

    @Test
    public void loggedInUserCanAddAndEditCampaign() {
        registerAndLogin();
        CampaignPage campaign = new CampaignPage(driver, wait);


        String campaignName = "Campaign-" + System.currentTimeMillis();
        campaign.addCampaign(campaignName, "Initial Description");
        Assert.assertTrue(campaign.isCampaignVisible(campaignName));

        String updatedName = "Updated-" + System.currentTimeMillis();
        campaign.editCampaign(updatedName, "Updated Description");

        Assert.assertTrue(campaign.isCampaignVisible(updatedName));
    }


}
