package P4.Sem4.data;

import P4.Sem4.repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(Student student){
        studentRepository.save(student);

    }
    public Student findStudentByLname(String lname){
        return studentRepository.findByLName(lname);
    }
    public Student findById(int id){
       return studentRepository.findById(id);
    }
}
