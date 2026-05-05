package Observer;

public class Client {
    public static void main(String[] args) {
        Connection alice = new Connection("Alice");
        Connection bob = new Connection("Bob");

        SocialMediaFeed myFeed = new SocialMediaFeed("Client");
        alice.registerObserver(myFeed);
        bob.registerObserver(myFeed);

        alice.setStatus("Working on Observer Pattern");
        bob.setStatus("Reading design patterns");

        System.out.println("-----");
        myFeed.showFeed();
    }
}
