package factory;

import domain.pizza.BasePizza;
import domain.pizza.IPizza;
import domain.pizza.decorator.CheeseDecorator;
import domain.pizza.decorator.MushroomDecorator;

public class PizzaFactory {
    public static IPizza createMargherita() {
        return new CheeseDecorator(
                new BasePizza("Margherita"));
    }

    public static IPizza createVegan() {
        return new MushroomDecorator(
                new BasePizza("Vegan Delight"));
    }
}