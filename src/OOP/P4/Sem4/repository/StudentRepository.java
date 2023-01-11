package OOP.P4.Sem4.repository;

import OOP.P4.Sem4.data.Student;

public class StudentRepository implements UserRepository<Student, Integer> {
    @Override
    public Student save(Student student) {
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
