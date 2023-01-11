package OOP.P4.Sem4.controller;

import OOP.P4.Sem4.data.Teacher;
import OOP.P4.Sem4.service.TeacherService;

public class TeacherController implements UserController<Teacher,Integer>{
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }


    @Override
    public Teacher save(Teacher teacher) {
        return teacherService.save(teacher);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherService.findById(id);
    }

    @Override
    public Teacher findByLname(String lName) {
        return teacherService.findByLname(lName);
    }
}
