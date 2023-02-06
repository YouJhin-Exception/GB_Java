package OOP.Project.repository;


import OOP.Project.data.Teacher;

public class TeacherRepository implements UserRepository<Teacher, String> {
    @Override
    public Teacher save(Teacher teacher) {
        return null;
    }

    @Override
    public void delete(Teacher teacher) {
    }

    @Override
    public Teacher findById(String id) {
        return null;
    }

    @Override
    public void createByUserName(String firstName) {
    }

    @Override
    public Teacher findByLastName(String lastName) {
        return null;
    }

    @Override
    public void deleteByFirstName(String firstName) {
    }

    @Override
    public void deleteByGroupAndBrsDate(String groupNumber, String brsDate) {
    }
}
