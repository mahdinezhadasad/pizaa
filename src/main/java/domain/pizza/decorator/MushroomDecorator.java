package domain.pizza.decorator;

import domain.pizza.IPizza;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mushrooms";
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 20;
    }
}