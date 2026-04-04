public abstract class CandyStore {
    public void orderCandy() {
        Candy candy = createCandy();
        candy.prepare();
    }

    public abstract Candy createCandy();
}
