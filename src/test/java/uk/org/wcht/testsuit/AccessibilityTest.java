package uk.org.wcht.testsuit;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.org.wcht.pages.AccessibilityPage;
import uk.org.wcht.pages.GetInvolvedPage;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;
import uk.org.wcht.utility.Utility;

public class AccessibilityTest extends TestBase {
    HomePage homePage = new HomePage();
    AccessibilityPage accessibilityPage = new AccessibilityPage();
    GetInvolvedPage getInvolvedPage = new GetInvolvedPage();

    @Test
    public void VerifyUserIsAbleToNavigateToAccessibilityPage() {
        homePage.clickOnAccessibilityLink();
        accessibilityPage.mouseHoverOnYourCommunityTab();
        accessibilityPage.mouseHoverOnGetInvolvedAndClick();
        Utility.scrollWindowUp(500);
        getInvolvedPage.clickOnLightBitesFieldAndSelectElement();
        getInvolvedPage.clickOnMainMenu("Community groups");
        getInvolvedPage.clickOnAllYouCanEatField("Committee members");
        getInvolvedPage.clickOnTakeAwayField("Email engagement");
        getInvolvedPage.clickOnYesIWouldLikeToBecomeAMemberCheckBox();
        getInvolvedPage.clickOnYesIWouldLikeToFindOutMoreCheckBox();
        getInvolvedPage.clickOnYesIWouldLikeHelpUsingEmailOrFacebook();
        getInvolvedPage.enterNameInNameTextField("Pratiksha");
        getInvolvedPage.enterAddressInAddressTextField("1,Hare Lane");
        getInvolvedPage.enterPostCodeInPostCodeField("AL10 8PW");
        getInvolvedPage.clickOnHowWouldYouLikeToBeContacted("Email");
        getInvolvedPage.enterEmailAddressOrPhoneNumberTextField("pratikshapatel1182@gmial.com");
        getInvolvedPage.clickOnReCaptchaCheckBox();
        getInvolvedPage.clickOnSubmitButton();
    }

}
