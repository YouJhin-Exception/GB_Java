package OOP.P3.Sem3.view;

import OOP.P2.HW2.dataHW2.StudentGroup;
import OOP.P2.HW2.dataHW2.User;

import java.util.List;

public abstract class GroupView {
    public void showBest(List<StudentGroup> studentGroups) {

        System.out.println(findGroup(studentGroups));
    }

    public abstract User findGroup(List<StudentGroup> studentGroups);
}
