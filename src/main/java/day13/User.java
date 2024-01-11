package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List <User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe (User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User sub: subscriptions) {
            if(sub.username == user.username) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
        return isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString() {
        return username;
    }
}
