package OOP.Project.data;

import OOP.Project.data.iterators.GroupStreamIterator;

import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroupList;

    public GroupStream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }
}
