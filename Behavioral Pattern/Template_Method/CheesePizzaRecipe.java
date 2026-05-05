package Template_Method;

public class CheesePizzaRecipe extends PizzaRecipe {
    @Override
    protected void addToppings() {
        System.out.println("Add mozzarella cheese");
    }
}
