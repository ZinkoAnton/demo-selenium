package ru.pomidorsinior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaTest extends BaseTest {

    @Test
    public void testClickOnPizzaBlock() {

        new MenuPage(driver).clickButtonPizza();

        Assertions.assertEquals(PizzaPageText.PIZZA_BLOCK_TITLE_TEXT, new PizzaPage(driver).getTextPizzaBlockTitle());
    }
}
