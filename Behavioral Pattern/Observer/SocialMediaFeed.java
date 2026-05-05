package Observer;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements Observer {
    private String ownerName;
    private List<String> statuses = new ArrayList<>();

    public SocialMediaFeed(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void update(String userName, String status) {
        statuses.add(userName + ": " + status);
        System.out.println(ownerName + " feed updated by " + userName);
    }

    public void showFeed() {
        System.out.println(ownerName + "'s feed:");
        for (String status : statuses) {
            System.out.println("- " + status);
        }
    }
}
