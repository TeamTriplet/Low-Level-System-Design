package DecoratorDesignPattern.toppings;

import DecoratorDesignPattern.basePizza.BasePizza;

public class ExtraCheese extends Toppings{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost()+20;
    }
}
