package OOP.Project.controller;

import OOP.Project.data.Teacher;
import OOP.Project.service.UserService;

public class TeacherController implements UserController<Teacher, Integer> {
    private final UserService<Teacher, Integer> teacherService;

    public TeacherController(UserService<Teacher, Integer> teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherService.createUser(teacher);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherService.findByIdUser(id);
    }

    @Override
    public Teacher findByLastName(String lastName) {
        return teacherService.findByLastNameUser(lastName);
    }
}
