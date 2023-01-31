package OOP.Project.service;

import OOP.Project.data.Student;
import OOP.Project.repository.StudentRepository;
import OOP.Project.repository.UserRepository;

public class StudentService implements UserService<Student, Integer> {
    private final UserRepository<Student, Integer> studentRepository;

    public StudentService() {
        this.studentRepository = new StudentRepository();
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
    public void deleteByGroupAndBrsDate(int groupNumber, String brsDate) {
        studentRepository.deleteByGroupAndBrsDate(groupNumber,brsDate);
    }
}




