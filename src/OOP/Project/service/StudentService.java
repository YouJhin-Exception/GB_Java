package OOP.Project.service;

import OOP.Project.data.Student;
import OOP.Project.repository.UserRepository;

public class StudentService implements UserService<Student, Integer> {
    private final UserRepository<Student, Integer> studentRepository;

    public StudentService(UserRepository<Student, Integer> studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createUser(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteUser(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public Student findByIdUser(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student findByLastNameUser(String lastName) {
        return studentRepository.findByLastName(lastName);
    }

    @Override
    public void deleteByFirstName(String firstName) {
        studentRepository.deleteByFirstName(firstName);
    }

    @Override
    public Student deleteByGroupAndBrsDate(Integer groupNumber, Integer brsDate) {
        return studentRepository.deleteByGroupAndBrsDate(groupNumber, brsDate);
    }
}




