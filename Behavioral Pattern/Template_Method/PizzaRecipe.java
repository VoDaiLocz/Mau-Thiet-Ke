package Template_Method;

public abstract class PizzaRecipe {
    public final void printRecipe() {
        prepareDough();
        addSauce();
        addToppings();
        bake();
    }

    private void prepareDough() {
        System.out.println("Prepare pizza dough");
    }

    private void addSauce() {
        System.out.println("Add tomato sauce");
    }

    protected abstract void addToppings();

    private void bake() {
        System.out.println("Bake pizza");
    }
}
