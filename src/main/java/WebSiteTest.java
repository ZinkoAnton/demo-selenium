import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteTest {
    @Test
    public void testOpenSite() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");

        String textPath = "//div[@class='footer-style__copy']";
        By textByXpath = By.xpath(textPath);
        WebElement textWebElement = driver.findElement(textByXpath);
        String actual = textWebElement.getText();
        Assertions.assertEquals("© 2001—2024 Onlíner", actual);
    }
}
