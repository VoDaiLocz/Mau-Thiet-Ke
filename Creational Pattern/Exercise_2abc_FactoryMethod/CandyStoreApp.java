public class CandyStoreApp {
    public static void main(String[] args) {
        CandyStore store = new ChocolateStore();
        store.orderCandy();

        store = new HardCandyStore();
        store.orderCandy();
    }
}
