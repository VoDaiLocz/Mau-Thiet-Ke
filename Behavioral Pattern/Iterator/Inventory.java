package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public ItemIterator<Item> inStockIterator() {
        return new InStockItemIterator();
    }

    private class InStockItemIterator implements ItemIterator<Item> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            while (currentIndex < items.size() && !items.get(currentIndex).isInStock()) {
                currentIndex++;
            }
            return currentIndex < items.size();
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                return null;
            }
            return items.get(currentIndex++);
        }
    }
}
