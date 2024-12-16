package a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SiteTest {
    private WebDriver driver;
    private final String BASE_URL = "https://mirtexno.by/";

    @BeforeEach
    public void beforeEach() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        Thread.sleep(2000);
        driver.manage().window().maximize();
    }

    @Test
    public void testOpenSite() {
        String textXPath = "//div[@data-id='323']/p/span[1]";
        By textBy = By.xpath(textXPath);
        WebElement textWebElement = driver.findElement(textBy);
        int deltaY = 100;
        new Actions(driver)
                .scrollToElement(textWebElement)
                .scrollByAmount(0, deltaY)
                .perform();
        String actual = textWebElement.getText();
        Assertions.assertEquals("ООО «МирТехноЛайн»", actual);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
