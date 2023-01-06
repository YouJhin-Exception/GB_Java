package OOP.P3.Sem3.data.iterators;

import OOP.P3.Sem3.data.Student;
import OOP.P3.Sem3.data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private StudentGroup studentGroup;
    //private Iterator<Student> iterator;
    private List<Student> students;
    private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        //this.iterator = studentGroup.getStudentList().iterator();
        this.students = studentGroup.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return cursor < students.size() && students.get(cursor) != null; // добавил на 0
        //return this.iterator.hasNext();
    }

    @Override
    public Student next() {
        return students.get(cursor++);
        //return this.iterator.next();
    }

    @Override
    public void remove() {
        this.students.remove(cursor);
        cursor--;
        //this.iterator.remove();
    }
}
