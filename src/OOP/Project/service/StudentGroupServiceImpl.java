package OOP.Project.service;


import OOP.Project.data.Student;
import OOP.Project.data.StudentGroup;
import OOP.Project.data.Teacher;
import OOP.Project.repository.Repository;
import OOP.Project.util.ReadFromTxt;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupServiceImpl implements StudentGroupService {

    private final Repository<StudentGroup, Integer> repository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> repository) {
        this.repository = repository;
    }

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
         // за имплячь сорт

//    @Override
//    public void sortStudents(StudentGroup studentGroup) {
//        Collections.sort(studentGroup.getStudentList());
//
//    }

    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return repository.save(studentGroup);
    }

    public StudentGroup findGroupById(Integer id) {
        return repository.findById(id);
    }


}
