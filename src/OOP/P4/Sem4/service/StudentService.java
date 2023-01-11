package OOP.P4.Sem4.service;

import OOP.P4.Sem4.data.Student;
import OOP.P4.Sem4.repository.StudentRepository;

public class StudentService implements DataService<Student, Integer> {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student read(Student student) {
        return null;
    }

    @Override
    public void create(Student student) {

    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student findByLastName(String lastName) {
        return studentRepository.findByLastName(lastName);
    }
}

