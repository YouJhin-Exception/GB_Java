package OOP.P2.HW2.ViewHW2;

import OOP.P2.HW2.DataHW2.StudentGroup;
import OOP.P2.HW2.DataHW2.User;

import java.util.List;

public abstract class GroupView {
    public void showBest(List<StudentGroup> studentGroups){

        System.out.println(findGroup(studentGroups));
    }
    public abstract User findGroup(List<StudentGroup> studentGroups);
}
