package OOP.Project.controller;

import OOP.Project.data.Student;
import OOP.Project.service.UserService;

public class StudentController implements UserController<Student, Integer> {
    private final UserService<Student, Integer> studentService;

    public StudentController(UserService<Student, Integer> studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student student) {
        return studentService.createUser(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findByIdUser(id);
    }

    @Override
    public Student findByLastName(String lastName) {
        return studentService.findByLastNameUser(lastName);
    }
}
