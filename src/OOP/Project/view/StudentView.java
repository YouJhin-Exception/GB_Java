package OOP.Project.view;


import OOP.Project.data.Student;
import OOP.Project.data.User;

import java.util.List;

public class StudentView extends UserView<Student> {

    @Override
    public User findUser(List<Student> userList) {
        return null;
    }
}
