package Pizzaria;

public class QueijoExtra extends PizzaDecorator {

    public QueijoExtra(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return pizza.getDescricao() + ", Queijo Extra";
    }

    public float getPreco() {
        return pizza.getPreco() + 2.0f;
    }
}
