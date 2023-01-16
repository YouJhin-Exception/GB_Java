package OOP.P5.Sem5.controller;

import OOP.P5.Sem5.data.Student;
import OOP.P5.Sem5.service.StudentUserService;

public class StudentController implements UserController<Student, Integer> {
    private final StudentUserService studentService;

    public StudentController(StudentUserService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student student) {
        return studentService.createUser(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

    @Override
    public Student findByLastName(String lastName) {
        return studentService.findByLastName(lastName);
    }
}
