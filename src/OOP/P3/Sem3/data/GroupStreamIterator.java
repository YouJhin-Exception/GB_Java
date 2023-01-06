package OOP.P3.Sem3.data;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    private GroupStream groups;
    private List<StudentGroup> groupList;
    private int curs;

    public GroupStreamIterator(GroupStream groups) {
        this.groups = groups;
        this.groupList = groups.getStudentGroupList();
    }

    @Override
    public boolean hasNext() {
        return curs < groupList.size() && groupList.get(curs) != null;
    }

    @Override
    public StudentGroup next() {
        return groupList.get(curs++);
    }

    @Override
    public void remove() {
        this.groupList.remove(curs);
    }
}
