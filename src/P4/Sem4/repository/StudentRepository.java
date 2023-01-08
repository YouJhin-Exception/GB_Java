package P4.Sem4.repository;

import P4.Sem4.data.Student;

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
    public Student findByLName(String lname) {
        return null;
    }
}
