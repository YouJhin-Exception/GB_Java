package OOP.P4.Sem4.controller;

import OOP.P4.Sem4.data.Student;
import OOP.P4.Sem4.service.StudentService;

public class StudentController implements UserController<Student,Integer>{
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student student) {
        return studentService.saveStudent(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findStudentById(id);
    }

    @Override
    public Student findByLname(String lName) {
        return studentService.findStudentByLname(lName);
    }
}
