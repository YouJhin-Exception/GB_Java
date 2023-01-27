package OOP.Project.data.iterators;

import OOP.Project.data.GroupStream;
import OOP.Project.data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    private final List<StudentGroup> groupList;
    private final GroupStream groupStream;
    private int cursor;

    public GroupStreamIterator(GroupStream groupStream) {
        this.groupStream = groupStream;
        this.groupList = groupStream.getStudentGroupList();

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
