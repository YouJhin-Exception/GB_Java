package OOP.P5.Sem5.controller;

import OOP.P5.Sem5.data.Teacher;
import OOP.P5.Sem5.service.TeacherService;

public class TeacherController implements UserController<Teacher, Integer> {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }


    @Override
    public Teacher save(Teacher teacher) {
        return teacherService.createUser(teacher);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherService.findById(id);
    }

    @Override
    public Teacher findByLastName(String lastName) {
        return teacherService.findByLastName(lastName);
    }
}
