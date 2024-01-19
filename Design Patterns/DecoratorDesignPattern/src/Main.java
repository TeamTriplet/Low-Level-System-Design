import DecoratorDesignPattern.basePizza.BasePizza;
import DecoratorDesignPattern.basePizza.Margarita;
import DecoratorDesignPattern.basePizza.VegDelightPizza;
import DecoratorDesignPattern.toppings.ExtraCheese;
import DecoratorDesignPattern.toppings.Jalepene;
import DecoratorDesignPattern.toppings.Mushroom;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        BasePizza margarita = new Margarita();
        BasePizza vegDelight = new VegDelightPizza();

        System.out.println(new Jalepene(new ExtraCheese(margarita)).cost());
        System.out.println(new Jalepene(new ExtraCheese(new Mushroom(margarita))).cost());
        System.out.println(new Jalepene(new Mushroom(vegDelight)).cost());
    }
}