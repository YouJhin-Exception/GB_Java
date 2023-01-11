package OOP.P4.Sem4.repository;

import OOP.P4.Sem4.data.Teacher;

public class TeacherRepository implements UserRepository<Teacher, Integer> {
    @Override
    public Teacher save(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher findById(Integer id) {
        return null;
    }

    @Override
    public Teacher findByLastName(String lastName) {
        return null;
    }
}
