package uk.org.wcht.pages;

import org.openqa.selenium.By;
import uk.org.wcht.utility.Utility;

public class AccessibilityPage extends Utility {
    By yourCommunityTab = By.xpath("//a[@class='header__nav-area-title'][contains(text(),'Your community')]");
    By getInvolved = By.xpath("//ul[@class='header__sub-nav js-sub-nav']//a[contains(text(),'Get involved')]");


public void mouseHoverOnYourCommunityTab(){ mouseHoverToElement(yourCommunityTab);}
public void mouseHoverOnGetInvolvedAndClick(){mouseHoverToElementAndClick(getInvolved);}

}
