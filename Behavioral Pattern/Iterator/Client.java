package Iterator;

public class Client {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItem(new Item("Laptop", true));
        inventory.addItem(new Item("Keyboard", false));
        inventory.addItem(new Item("Mouse", true));

        ItemIterator<Item> iterator = inventory.inStockIterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item);
        }
    }
}
