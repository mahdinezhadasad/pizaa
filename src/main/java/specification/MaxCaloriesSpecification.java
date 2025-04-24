package specification;

import domain.pizza.IPizza;

public class MaxCaloriesSpecification implements Specification<IPizza> {
    private final int maxCalories;

    public MaxCaloriesSpecification(int maxCalories) {
        this.maxCalories = maxCalories;
    }

    @Override
    public boolean isSatisfiedBy(IPizza pizza) {
        return pizza.getCalories() <= maxCalories;
    }
}
