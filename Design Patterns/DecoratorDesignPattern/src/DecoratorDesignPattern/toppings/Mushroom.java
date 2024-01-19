package DecoratorDesignPattern.toppings;

import DecoratorDesignPattern.basePizza.BasePizza;

public class Mushroom extends Toppings{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost()+30;
    }
}
