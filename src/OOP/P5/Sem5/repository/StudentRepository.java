package OOP.P5.Sem5.repository;

import OOP.P5.Sem5.data.Student;

public class StudentRepository implements UserRepository<Student, Integer> {
    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student delete(Student student) {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByLastName(String lastName) {
        return null;
    }
}
