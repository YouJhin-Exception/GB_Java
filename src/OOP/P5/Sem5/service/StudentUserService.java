package OOP.P5.Sem5.service;

import OOP.P5.Sem5.data.Student;
import OOP.P5.Sem5.data.comparators.UserComparator;
import OOP.P5.Sem5.repository.StudentRepository;

import java.util.Collections;
import java.util.List;

public class StudentUserService implements DataUserService<Student, Integer> {
    private final StudentRepository studentRepository;

    public StudentUserService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public Student createUser(Student user) {
        return studentRepository.save(user);
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student findByLastName(String lastName) {
        return studentRepository.findByLastName(lastName);
    }

    @Override
    public void sortUsers(List<Student> users) {
        Collections.sort(users);
    }

    @Override
    public void sortByName(List<Student> users) {
        users.sort(new UserComparator());
    }


}

