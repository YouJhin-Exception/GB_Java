package OOP.Project.repository;


import OOP.Project.data.Teacher;

public class TeacherRepository implements UserRepository<Teacher, Integer> {
    @Override
    public Teacher save(Teacher teacher) {
        return null;
    }

    @Override
    public void delete(Teacher teacher) {
    }

    @Override
    public Teacher findById(Integer id) {
        return null;
    }

    @Override
    public Teacher createByUserName(String firstName) {
        return null;
    }

    @Override
    public Teacher findByLastName(String lastName) {
        return null;
    }

    @Override
    public void deleteByFirstName(String firstName) {
    }

    @Override
    public Teacher deleteByGroupAndBrsDate(int groupNumber, String brsDate) {
        return null;
    }
}
