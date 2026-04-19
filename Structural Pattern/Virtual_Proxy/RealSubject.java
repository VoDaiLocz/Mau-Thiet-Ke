package Virtual_Proxy;

import java.util.ArrayList;
import java.util.List;

public class RealSubject implements SuperMarket {
    private final List<String> items = new ArrayList<>();

    public RealSubject() {
        System.out.println("Tạo kho hàng thật (RealSubject)");
    }

    @Override
    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public void display() {
        System.out.println("Kho hàng hiện tại: " + items);
    }
}
