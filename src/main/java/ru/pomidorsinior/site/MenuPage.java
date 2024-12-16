package ru.pomidorsinior.site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {


    public static final String MENU_BUTTON_PIZZA = "//a[@href='#block-views-products-block']";

    public static void clickButtonPizza(WebDriver driver) {
        By buttonPizzaBy = By.xpath(MENU_BUTTON_PIZZA);
        WebElement buttonPizzaWebElement = driver.findElement(buttonPizzaBy);
        buttonPizzaWebElement.click();
    }
}
