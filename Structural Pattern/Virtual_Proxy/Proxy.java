package Virtual_Proxy;

public class Proxy implements SuperMarket {
    private RealSubject realSubject;

    @Override
    public void display() {
        getInstance();
        realSubject.display();
    }

    @Override
    public void addItem(String item) {
        getInstance();
        realSubject.addItem(item);
    }

    public void getInstance() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
    }
}
