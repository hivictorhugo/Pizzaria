package Pizzaria;

public class Frango extends PizzaDecorator {

    public Frango(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return pizza.getDescricao() + ", Frango";
    }

    public float getPreco() {
        return pizza.getPreco() + 10.5f;
    }
}

