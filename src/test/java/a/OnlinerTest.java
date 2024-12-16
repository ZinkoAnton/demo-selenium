package a;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {
    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void openDriver() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void testOpenLink() {
        String aAboutTheCompanyXPath = "//a[@href='https://blog.onliner.by/about']";
        WebElement aAboutTheCompanyWebElement = driver.findElement(By.xpath(aAboutTheCompanyXPath));
        aAboutTheCompanyWebElement.click();

        String aboutPageHeaderXPath = "//div[@class='news-text']/h1";
        WebElement headerAboutTheCompanyWebElement = driver.findElement(By.xpath(aboutPageHeaderXPath));

        String actualAboutPageHeader = headerAboutTheCompanyWebElement.getText();
        String expectedAboutPageHeader = "Информация о компании";
        Assertions.assertEquals(expectedAboutPageHeader, actualAboutPageHeader);
    }
}
