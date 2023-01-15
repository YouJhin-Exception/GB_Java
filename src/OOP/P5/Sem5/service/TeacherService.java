package OOP.P5.Sem5.service;

import OOP.P5.Sem5.data.Teacher;
import OOP.P5.Sem5.data.comparators.UserComparator;
import OOP.P5.Sem5.repository.TeacherRepository;

import java.util.List;

public class TeacherService implements DataService<Teacher, Integer> {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher createUser(Teacher user) {
        return teacherRepository.save(user);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher findByLastName(String lastName) {
        return teacherRepository.findByLastName(lastName);
    }

    @Override
    public void sortUsers(List<Teacher> users) {
        this.sortByName(users);
    }

    @Override
    public void sortByName(List<Teacher> users) {
        users.sort(new UserComparator());
    }


}
