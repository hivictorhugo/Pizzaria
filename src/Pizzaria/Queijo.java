package Pizzaria;

public class Queijo extends Adicional{
    public Queijo(Pizza pizza){
        super(pizza);
    }

    public float getPreco(){
        return pizza.getPreco() + 6.0f;
    }
}
