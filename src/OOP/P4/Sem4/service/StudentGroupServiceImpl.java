package OOP.P4.Sem4.service;


import OOP.P4.Sem4.data.Student;
import OOP.P4.Sem4.data.StudentGroup;
import OOP.P4.Sem4.data.Teacher;
import OOP.P4.Sem4.data.comparators.UserComparator;
import OOP.P4.Sem4.repository.Repository;
import OOP.P4.Sem4.util.ReadFromTxt;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StudentGroupServiceImpl {

    private final Repository<StudentGroup, Integer> repository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> repository) {
        this.repository = repository;
    }


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
        studentGroup.getStudentList().sort(new UserComparator());

    }

    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return repository.save(studentGroup);
    }

    public StudentGroup findGroup(int id) {
        return repository.findById(id);
    }

}
