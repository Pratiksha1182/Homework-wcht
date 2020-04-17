package uk.org.wcht.pages;

import org.openqa.selenium.By;
import uk.org.wcht.utility.Utility;

public class GetInvolvedPage extends Utility {

    By lightBitesField = By.xpath("//select[@id='form-OrderFromTheInvolvementMenu-caa2_DropDown_SelectedValue']");
    By mainMenuField = By.id("form-OrderFromTheInvolvementMenu-b361_DropDown_1_SelectedValue");
    By allYouCanEatField = By.id("form-OrderFromTheInvolvementMenu-caa2_DropDown_2_SelectedValue");
    By takeAwayField = By.id("form-OrderFromTheInvolvementMenu-caa2_DropDown_3_SelectedValue");
    By yesIWouldLikeToBecomeAMember = By.xpath("//label[contains(text(),'Yes, I would like to become a member')]");
    By yesIWouldLikeToFindOutMoreCheckBox = By.xpath("//label[contains(text(),'Yes, I would like to find out more')]");
    By yesIWouldLikeHelpUsingEmailOrFacebook = By.xpath("//label[contains(text(),'Yes, I would like help using email or Facebook')]");
    By nameTextField = By.id("form-OrderFromTheInvolvementMenu-caa2_Name_Value");
    By addressTextField = By.id("form-OrderFromTheInvolvementMenu-caa2_Address_Value");
    By postCodeField = By.id("form-OrderFromTheInvolvementMenu-caa2_Postcode_Value");
    By howWouldYouLikeToBeContacted = By.id("form-OrderFromTheInvolvementMenu-caa2_Contact_preference_SelectedValue");
    By emailAddressOrPhoneNumberTextField = By.id("form-OrderFromTheInvolvementMenu-caa2_Email_or_phone_Value");
    By reCaptchaCheckBox = By.xpath("//div[@id='google-recaptcha-form-OrderFromTheInvolvementMenu-caa2_Recaptcha_Value']");
    By submitButton = By.xpath("//input[@type='submit']");


    public void clickOnLightBitesFieldAndSelectElement(){waitUntilElementToBeClickable(lightBitesField,30);clickOnElement(lightBitesField);
    clickOnElement(lightBitesField);}
    public void clickOnMainMenu(String menu){ selectByVisibleTextFromDropDown(mainMenuField, menu);}
    public void clickOnAllYouCanEatField(String allYouCan){ selectByVisibleTextFromDropDown(allYouCanEatField,allYouCan);}
    public void clickOnTakeAwayField(String takeAway){ selectByVisibleTextFromDropDown(takeAwayField,takeAway);}
    public void clickOnYesIWouldLikeToBecomeAMemberCheckBox(){ clickOnElement(yesIWouldLikeToBecomeAMember);}
    public void clickOnYesIWouldLikeToFindOutMoreCheckBox(){ clickOnElement(yesIWouldLikeToFindOutMoreCheckBox);}
    public void clickOnYesIWouldLikeHelpUsingEmailOrFacebook(){ clickOnElement(yesIWouldLikeHelpUsingEmailOrFacebook);}
    public void enterNameInNameTextField(String name){ sendTextToElement(nameTextField, name);}
    public void enterAddressInAddressTextField(String address){sendTextToElement(addressTextField,address);}
    public void enterPostCodeInPostCodeField(String postCode){sendTextToElement(postCodeField,postCode);}
    public void clickOnHowWouldYouLikeToBeContacted(String toBeContacted){selectByVisibleTextFromDropDown(howWouldYouLikeToBeContacted,toBeContacted);}
    public void enterEmailAddressOrPhoneNumberTextField(String emailOrPhone){ sendTextToElement(emailAddressOrPhoneNumberTextField,emailOrPhone);}
    public void clickOnReCaptchaCheckBox(){ clickOnElement(reCaptchaCheckBox);}
    public void clickOnSubmitButton(){clickOnElement(submitButton);}

}
