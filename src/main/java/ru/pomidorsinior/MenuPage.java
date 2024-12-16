package ru.pomidorsinior;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
    private WebDriver driver;

    private final String BUTTON_PIZZA = "//a[@href='/#block-views-products-block']";

    public MenuPage(WebDriver newDriver) {
        this.driver = newDriver;
    }

    public void clickButtonPizza() {
        By buttonPizzaBy = By.xpath(BUTTON_PIZZA);
        WebElement buttonPizzaWebElement = driver.findElement(buttonPizzaBy);
        buttonPizzaWebElement.click();
    }
}
