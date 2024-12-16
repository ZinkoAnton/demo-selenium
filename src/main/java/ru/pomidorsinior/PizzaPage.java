package ru.pomidorsinior;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaPage {

    private WebDriver driver;

    public final String PIZZA_BLOCK_TITLE = "//section[@id='block-views-products-block']//h2";

    public static final String PIZZA_BLOCK_TITLE_TEXT = "Пицца";

    public PizzaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextPizzaBlockTitle() {
        By pizzaBlockTitleBy = By.xpath(PIZZA_BLOCK_TITLE);
        WebElement pizzaBlockTitleWebElement = driver.findElement(pizzaBlockTitleBy);
        pizzaBlockTitleWebElement.isDisplayed();
        pizzaBlockTitleWebElement.getAttribute("hidden");
        return pizzaBlockTitleWebElement.getText();
    }
}
