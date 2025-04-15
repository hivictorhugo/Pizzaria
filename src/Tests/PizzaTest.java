package Tests;

import Pizzaria.PizzaSimples;
import Pizzaria.Pizza;
import Pizzaria.QueijoExtra;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaTest {

    @Test
    public void retornarPrecoMassaBase(){
        Pizza pizza = new PizzaSimples();
        assertEquals(1.0f, pizza.getPreco(), 0.01f);

    }

    @Test
    public void retornarPrecoComQueijo(){
            Pizza pizza = new QueijoExtra(new PizzaSimples());
            assertEquals(7.0f, pizza.getPreco(), 0.01);
    }

}
