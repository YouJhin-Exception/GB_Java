package OOP.P3.Sem3.data.comparator;

import OOP.P3.Sem3.data.GroupStream;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {
    @Override
    public int compare(GroupStream o1, GroupStream o2) {
        int group1 = o1.getStudentGroupList().size();
        int group2 = o2.getStudentGroupList().size();
        return Integer.compare(group1,group2);
    }
}
