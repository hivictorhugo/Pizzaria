package Pizzaria;

public class Calabresa extends Adicional{
    public Calabresa(Pizza pizza){
        super(pizza);
    }

    public float getPreco(){
        return pizza.getPreco() + 7.5f;
    }
}
