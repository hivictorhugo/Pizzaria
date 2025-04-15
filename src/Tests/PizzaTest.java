package Tests;

import Pizzaria.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaTest {

    @Test
    public void testPizzaSimples() {
        Pizza pizza = new PizzaSimples();
        assertEquals("Pizza Simples", pizza.getDescricao());
        assertEquals(10.0f, pizza.getPreco());
    }

    @Test
    public void testPizzaComQueijoExtra() {
        Pizza pizza = new QueijoExtra(new PizzaSimples());
        assertEquals("Pizza Simples, Queijo Extra", pizza.getDescricao());
        assertEquals(12.0f, pizza.getPreco());
    }

    @Test
    public void testPizzaComCalabresa() {
        Pizza pizza = new Calabresa(new PizzaSimples());
        assertEquals("Pizza Simples, Calabresa", pizza.getDescricao());
        assertEquals(13.0f, pizza.getPreco());
    }

    @Test
    public void testPizzaComFrango() {
        Pizza pizza = new Frango(new PizzaSimples());
        assertEquals("Pizza Simples, Frango", pizza.getDescricao());
        assertEquals(20.5f, pizza.getPreco());
    }

    @Test
    public void testPizzaComFrangoEQueijoExtra() {
        Pizza pizza = new QueijoExtra(new Frango(new PizzaSimples()));
        assertEquals("Pizza Simples, Frango, Queijo Extra", pizza.getDescricao());
        assertEquals(22.5f, pizza.getPreco());
    }

    @Test
    public void testPizzaComTodosOsAdicionais() {
        Pizza pizza = new Frango(new Calabresa(new QueijoExtra(new PizzaSimples())));
        assertEquals("Pizza Simples, Queijo Extra, Calabresa, Frango", pizza.getDescricao());
        assertEquals(25.5f, pizza.getPreco()); // 10.0 + 2.0 + 3.0 + 10.5 = 25.5
    }
}

