package OOP.P4.Sem4.data.comparators;

import OOP.P4.Sem4.data.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return (o1.getfNmane().compareTo(o2.getfNmane()));
    }
}
