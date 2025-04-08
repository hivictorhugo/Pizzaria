package Tests;

import Pizzaria.MassaBase;
import Pizzaria.Pizza;
import Pizzaria.Queijo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaTest {

    @Test
    public void retornarPrecoMassaBase(){
        Pizza pizza = new MassaBase();
        assertEquals(1.0f, pizza.getPreco(), 0.01f);

    }

    @Test
    public void retornarPrecoComQueijo(){
            Pizza pizza = new Queijo(new MassaBase());
            assertEquals(7.0f, pizza.getPreco(), 0.01);
    }

}
