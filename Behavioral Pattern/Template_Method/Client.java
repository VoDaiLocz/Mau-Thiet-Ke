package Template_Method;

public class Client {
    public static void main(String[] args) {
        PizzaRecipe cheesePizza = new CheesePizzaRecipe();
        PizzaRecipe veggiePizza = new VeggiePizzaRecipe();

        cheesePizza.printRecipe();
        System.out.println("-----");
        veggiePizza.printRecipe();
    }
}
