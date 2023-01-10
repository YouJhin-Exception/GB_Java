package OOP.P4.Sem4.service;

import OOP.P4.Sem4.data.Student;
import OOP.P4.Sem4.repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);

    }
    public Student findStudentByLname(String lname){
        return studentRepository.findByLName(lname);
    }
    public Student findStudentById(int id){
       return studentRepository.findById(id);
    }
}
