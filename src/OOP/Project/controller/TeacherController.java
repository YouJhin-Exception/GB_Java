package OOP.Project.controller;

import OOP.Project.data.Teacher;
import OOP.Project.service.UserService;

public class TeacherController implements UserController<Teacher, String> {
    private final UserService<Teacher, String> teacherService;

    public TeacherController(UserService<Teacher, String> teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherService.createUser(teacher);
    }

    @Override
    public Teacher findById(String id) {
        return teacherService.findByIdUser(id);
    }

    @Override
    public Teacher findByLastName(String lastName) {
        return teacherService.findByLastNameUser(lastName);
    }
}
