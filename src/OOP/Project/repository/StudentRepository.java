package OOP.Project.repository;

import OOP.Project.data.Student;

public class StudentRepository implements UserRepository<Student, Integer> {
    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public void delete(Student student) {
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student createByUserName(String firstName) {
        return null;
    }

    @Override
    public Student findByLastName(String lastName) {
        return null;
    }

    public Student deleteByFirstName(String firstName) {
        return null;
    }

    @Override
    public Student deleteByGroupAndBrsDate(int groupNumber, int brsDate) {
        return null;
    }

}
