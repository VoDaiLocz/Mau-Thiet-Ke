public class ChocolateStore extends CandyStore {
    public Candy createCandy() {
        return new Chocolate();
    }
}
