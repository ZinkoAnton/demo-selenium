package by.Mirtexno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    public static final String MAIN_PAGE_SITE_FOOTER_COPYRITE_PATH = "//div[@data-id='323']/p/span[1]";
    public static final String MAIN_PAGE_SITE_FOOTER_COPYRITE_TEXT = "ООО «МирТехноЛайн»";
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMainPageSiteFooterCopyriteText() throws InterruptedException {
        WebElement mainPageSiteFooterCopyriteWebElement = driver.findElement(By.xpath(HomePage.MAIN_PAGE_SITE_FOOTER_COPYRITE_PATH));
        int deltaY = 100;
        new Actions(driver)
                .scrollToElement(mainPageSiteFooterCopyriteWebElement)
                .scrollByAmount(0, deltaY)
                .perform();
        Thread.sleep(5000);
        String actual = mainPageSiteFooterCopyriteWebElement.getText();
        return actual;
    }
}
