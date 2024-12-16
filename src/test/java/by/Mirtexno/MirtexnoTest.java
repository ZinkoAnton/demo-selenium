package by.Mirtexno;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class MirtexnoTest extends BaseTest {

    @Test
    public void testOpenStartPageOnSite() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        String actual = homePage.getMainPageSiteFooterCopyriteText();
        Assertions.assertEquals(HomePage.MAIN_PAGE_SITE_FOOTER_COPYRITE_TEXT, actual);
    }
}
