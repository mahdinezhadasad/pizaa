package domain.pizza.decorator;


import domain.pizza.IPizza;

public abstract class PizzaDecorator implements IPizza {
    protected final IPizza decoratedPizza;

    public PizzaDecorator(IPizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public int getCalories() {
        return decoratedPizza.getCalories();
    }
}
