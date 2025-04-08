package Pizzaria;

public class Frango extends Adicional{
    public Frango(Pizza pizza){
        super(pizza);
    }

    public float getPreco(){
        return pizza.getPreco() + 10.5f;
    }
}
