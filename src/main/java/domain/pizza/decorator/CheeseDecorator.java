package domain.pizza.decorator;

import domain.pizza.IPizza;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 100;
    }
}
