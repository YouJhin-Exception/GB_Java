package OOP.P4.Sem4.controller;

import OOP.P4.Sem4.data.Student;
import OOP.P4.Sem4.service.StudentService;

public class StudentController implements UserController<Student, Integer> {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student student) {
        return studentService.save(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

    @Override
    public Student findByLastName(String lName) {
        return studentService.findByLastName(lName);
    }
}
