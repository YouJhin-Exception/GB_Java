package OOP.P5.Sem5.service;


import OOP.P5.Sem5.data.Student;
import OOP.P5.Sem5.data.StudentGroup;
import OOP.P5.Sem5.data.Teacher;
import OOP.P5.Sem5.util.ReadFromTxt;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupServiceImpl implements StudentGroupService {

    @Override
    public StudentGroup getGroup() {
        List<Student> students = ReadFromTxt.readStudentsFromTxt();
        Teacher teacher = ReadFromTxt.readTeacherFromTxt();
        return new StudentGroup(teacher, students);

    }

    @Override
    public StudentGroup getGroup(int number) {
        List<Student> students = ReadFromTxt.readStudentsFromTxt();
        Teacher teacher = ReadFromTxt.readTeacherFromTxt();
        return new StudentGroup(teacher, students, number);
    }

    @Override
    public void removeStudent(String firstName, String lastName) {
        Iterator<Student> studentIterator = getGroup().iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                studentIterator.remove();
            }
        }
    }

    @Override
    public void sortStudents(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());

    }


}
