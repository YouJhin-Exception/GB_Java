package OOP.Project.service;

import OOP.Project.data.Teacher;
import OOP.Project.repository.UserRepository;

public class TeacherService implements UserService<Teacher, String> {
    private final UserRepository<Teacher, String> teacherRepository;

    public TeacherService(UserRepository<Teacher, String> teacherRepository) {
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
    public Teacher findByIdUser(String id) {
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
    public void deleteByGroupAndBrsDate(String groupNumber, String brsDate) {

    }

    @Override
    public void createByName(String firstName) {

    }
}
