package OOP.P3.Sem3.service;


import OOP.P3.Sem3.data.Student;
import OOP.P3.Sem3.data.StudentGroup;
import OOP.P3.Sem3.data.Teacher;
import OOP.P3.Sem3.data.comparator.UserComparator;
import OOP.P3.Sem3.util.ReadFromTxt;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StudentGroupServiceImpl {

    public StudentGroup getGroup() {
        List<Student> students = ReadFromTxt.readStudent();
        Teacher teacher = ReadFromTxt.readTeacher();
        return new StudentGroup(teacher, students);

    }

    public StudentGroup getGroup(int numb) {
        List<Student> students = ReadFromTxt.readStudent();
        Teacher teacher = ReadFromTxt.readTeacher();
        return new StudentGroup(teacher, students, numb);
    }

    public void removeStudent(String firstName) {
        Iterator<Student> group = getGroup().iterator();
        while (group.hasNext()) {
            Student student = group.next();
            if (firstName.equals(student.getfNmane())) {
                group.remove();
            }
        }
    }

    public void sortStudent(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());

    }

    public void sortFNameStudent(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList(), new UserComparator());

    }

}
