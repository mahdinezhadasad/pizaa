package domain.pizza;

public class BasePizza implements IPizza {
    private final String name;

    public BasePizza(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public int getCalories() {
        return 0;
    }
}