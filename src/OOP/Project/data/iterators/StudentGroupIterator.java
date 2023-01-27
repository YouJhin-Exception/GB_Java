package OOP.Project.data.iterators;

import OOP.Project.data.Student;
import OOP.Project.data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    //private Iterator<Student> iterator;
    private final List<Student> studentList;
    private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup) {
       this.studentList = studentGroup.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return cursor < studentList.size() && studentList.get(cursor) != null; // добавил на 0
        //return this.iterator.hasNext();
    }

    @Override
    public Student next() {
        return studentList.get(cursor++);
        //return this.iterator.next();
    }

    @Override
    public void remove() {
        this.studentList.remove(cursor);
        cursor--;
        //this.iterator.remove();
    }
}
