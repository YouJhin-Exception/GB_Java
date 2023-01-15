package OOP.P5.Sem5.view;


import OOP.P5.Sem5.data.StudentGroup;
import OOP.P5.Sem5.data.User;

import java.util.List;

public abstract class GroupView {
    public void showBest(List<StudentGroup> studentGroups) {

        System.out.println(findGroup(studentGroups));
    }

    public abstract User findGroup(List<StudentGroup> studentGroups);
}
