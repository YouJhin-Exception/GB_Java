package OOP.P4.Sem4.service;

import OOP.P4.Sem4.data.Teacher;
import OOP.P4.Sem4.repository.TeacherRepository;

public class TeacherService implements DataService<Teacher, Integer> {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher read(Teacher teacher) {
        return null;
    }

    @Override
    public void create(Teacher teacher) {

    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher findByLastName(String lastName) {
        return teacherRepository.findByLastName(lastName);
    }


}
