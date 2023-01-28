package OOP.Project.view;


import OOP.Project.data.User;

import java.util.List;

public abstract class UserView<U extends User> {
    public void showBest(List<U> userList) {
        User user = findUser(userList);
        System.out.println(user);
    }

    public abstract User findUser(List<U> userList);

}
