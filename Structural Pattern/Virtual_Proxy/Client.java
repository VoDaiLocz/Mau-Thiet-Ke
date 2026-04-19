package Virtual_Proxy;

public class Client {

    public static void main(String[] args) {
        SuperMarket superMarket = new Proxy();

        superMarket.addItem("sữa");
        superMarket.addItem("Thịt bò");
        superMarket.addItem("con gà");

        System.out.println("Sau khi thêm:");
        superMarket.display();
    }
}
