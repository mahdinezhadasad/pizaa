package specification;

import domain.pizza.IPizza;

public class ToppingCountSpecification implements Specification<IPizza> {
    private final int maxToppings;

    public ToppingCountSpecification(int maxToppings) {
        this.maxToppings = maxToppings;
    }

    @Override
    public boolean isSatisfiedBy(IPizza pizza) {
        return pizza.getDescription().split(",").length - 1 <= maxToppings;
    }
}