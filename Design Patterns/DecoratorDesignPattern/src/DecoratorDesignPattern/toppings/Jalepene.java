package DecoratorDesignPattern.toppings;

import DecoratorDesignPattern.basePizza.BasePizza;

public class Jalepene extends Toppings{
    BasePizza basePizza;

    public Jalepene(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost()+40;
    }

}
