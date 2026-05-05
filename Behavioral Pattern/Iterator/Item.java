package Iterator;

public class Item {
    private String name;
    private boolean inStock;

    public Item(String name, boolean inStock) {
        this.name = name;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public boolean isInStock() {
        return inStock;
    }

    @Override
    public String toString() {
        return name + " - " + (inStock ? "in stock" : "out of stock");
    }
}
