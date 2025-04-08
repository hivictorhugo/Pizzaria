package Pizzaria;

public abstract class Adicional implements Pizza{
    protected Pizza pizza;

    public Adicional(Pizza pizza){
        this.pizza = pizza;
    }

}
