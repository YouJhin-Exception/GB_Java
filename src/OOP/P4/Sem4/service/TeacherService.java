package OOP.P4.Sem4.service;

import OOP.P4.Sem4.data.Teacher;
import OOP.P4.Sem4.repository.TeacherRepository;

public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    public Teacher saveTeacher(Teacher teacher){
        return teacherRepository.save(teacher);

    }
    public Teacher findTeacherByLname(String lname){
        return teacherRepository.findByLName(lname);
    }
    public Teacher findTeacherById(int id){
        return teacherRepository.findById(id);
    }

}
