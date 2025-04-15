package Pizzaria;

public class Calabresa extends PizzaDecorator {

    public Calabresa(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return pizza.getDescricao() + ", Calabresa";
    }

    public float getPreco() {
        return pizza.getPreco() + 3.0f;
    }
}
