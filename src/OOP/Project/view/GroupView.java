package OOP.Project.view;


import OOP.Project.data.StudentGroup;
import OOP.Project.data.User;

import java.util.List;

public abstract class GroupView {
    public void showBest(List<StudentGroup> studentGroups) {

        System.out.println(findGroup(studentGroups));
    }

    public abstract User findGroup(List<StudentGroup> studentGroups);
}
