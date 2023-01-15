package OOP.P5.Sem5.data.comparators;

import OOP.P5.Sem5.data.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return (user1.getLastName().compareTo(user2.getLastName()));
    }
}
