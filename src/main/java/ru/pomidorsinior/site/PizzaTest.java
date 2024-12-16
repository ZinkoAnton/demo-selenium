package ru.pomidorsinior.site;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PizzaTest extends BaseTest {

    @Test
    public void test() {
        MenuPage.clickButtonPizza(driver);

        By pizzaBlockTitleBy = By.xpath(PizzaPage.PIZZA_BLOCK_TITLE);
        WebElement pizzaBlockTitleWebElement = driver.findElement(pizzaBlockTitleBy);

        String actualPizzaBlockTitleText = pizzaBlockTitleWebElement.getText();

        Assertions.assertEquals(PizzaPageText.PIZZA_BLOCK_TITLE_TEXT, actualPizzaBlockTitleText);
    }
}
