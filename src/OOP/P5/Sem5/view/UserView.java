package OOP.P5.Sem5.view;


import OOP.P5.Sem5.data.User;

import java.util.List;

public abstract class UserView {
    public void showBest(List<User> userList) {
        User user = findUser(userList);
        System.out.println(user);
    }

    public abstract User findUser(List<User> userList);

}
