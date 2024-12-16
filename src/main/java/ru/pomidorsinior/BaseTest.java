package ru.pomidorsinior;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.pomidorsinior.site.CitiesChooseModalPage;

public class BaseTest {
    WebDriver driver;
    private final String BASE_URL = "https://pomidor-sinior.ru/";

    @BeforeEach
    public void setUpDriver() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get(BASE_URL);

        By buttonCitiesChooseCloseBy = By.xpath(CitiesChooseModalPage.BUTTON_CLOSE_XPATH);
        WebElement buttonCitiesChooseCloseWebElement = driver.findElement(buttonCitiesChooseCloseBy);
        buttonCitiesChooseCloseWebElement.click();
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }


}
