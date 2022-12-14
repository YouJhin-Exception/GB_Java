package OOP.P4.Sem4.data.comparators;

import OOP.P4.Sem4.data.GroupStream;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {
    @Override
    public int compare(GroupStream o1, GroupStream o2) {
        int group1Size = o1.getStudentGroupList().size();
        int group2Size = o2.getStudentGroupList().size();
        return Integer.compare(group1Size,group2Size);
    }
}
