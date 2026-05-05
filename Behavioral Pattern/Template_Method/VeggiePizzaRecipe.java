package Template_Method;

public class VeggiePizzaRecipe extends PizzaRecipe {
    @Override
    protected void addToppings() {
        System.out.println("Add mushrooms, olives and bell pepper");
    }
}
