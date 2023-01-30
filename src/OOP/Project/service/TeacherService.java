package OOP.Project.service;

import OOP.Project.data.Teacher;
import OOP.Project.repository.UserRepository;

public class TeacherService implements UserService<Teacher, Integer> {
    private final UserRepository<Teacher, Integer> teacherRepository;

    public TeacherService(UserRepository<Teacher, Integer> teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher createUser(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public void deleteUser(Teacher teacher) {
        teacherRepository.delete(teacher);
    }

    @Override
    public Teacher findByIdUser(Integer id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher findByLastNameUser(String lastName) {
        return teacherRepository.findByLastName(lastName);
    }

    @Override
    public void deleteByFirstName(String firstName) {

    }

    @Override
    public Teacher deleteByGroupAndBrsDate(Integer groupNumber, Integer brsDate) {
        return null;
    }
}
