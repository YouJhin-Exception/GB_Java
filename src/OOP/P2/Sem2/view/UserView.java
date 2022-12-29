package OOP.P2.Sem2.view;

import OOP.P2.Sem2.data.Student;
import OOP.P2.Sem2.data.User;

import java.util.List;

public abstract class UserView {
    void showTheBest(List<User> userList) {
        User user = findTheBest(userList);
        System.out.println(user);


    }

    protected abstract User findTheBest(List<User> userList);
}
