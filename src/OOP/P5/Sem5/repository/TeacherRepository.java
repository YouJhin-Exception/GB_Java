package OOP.P5.Sem5.repository;


import OOP.P5.Sem5.data.Teacher;

public class TeacherRepository implements UserRepository<Teacher, Integer> {
    @Override
    public Teacher save(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher delete(Teacher teacher) {
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

    @Override
    public Teacher deleteByFirstName(String firstName) {
        return null;
    }

    @Override
    public Teacher deleteByGroupAndBrsDate(int groupNumber, int brsDate) {
        return null;
    }
}
