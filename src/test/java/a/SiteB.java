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

public class SiteB {
    private WebDriver driver;
    private final String BASE_URL = "https://mirtexno.by/";

    @BeforeEach
    public void openDriver() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void testOpenSite() {
        String textXPath = "//h2[@class='title_pop_cat']";
        WebElement textWebElement = driver.findElement(By.xpath(textXPath));
        int deltaY = 100;
        new Actions(driver).
                scrollToElement(textWebElement).
                scrollByAmount(0, deltaY).
                perform();
        String actual = textWebElement.getText();
        Assertions.assertEquals("Популярные категории", actual);
    }

    @AfterEach
    public void closeTest() {
        driver.quit();
    }
}
