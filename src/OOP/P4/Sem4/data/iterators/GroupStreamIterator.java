package OOP.P4.Sem4.data.iterators;

import OOP.P4.Sem4.data.GroupStream;
import OOP.P4.Sem4.data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> groupList;
    private int cursor;

    public GroupStreamIterator(GroupStream groups) {
        this.groupList = groups.getStudentGroupList();
    }

    @Override
    public boolean hasNext() {
        return cursor < groupList.size() && groupList.get(cursor) != null;
    }

    @Override
    public StudentGroup next() {
        return groupList.get(cursor++);
    }

    @Override
    public void remove() {
        this.groupList.remove(cursor--);
    }
}
