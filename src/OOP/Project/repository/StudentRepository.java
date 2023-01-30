package OOP.Project.repository;

import OOP.Project.data.Student;
import OOP.Project.db.StudentTable;

public class StudentRepository implements UserRepository<Student, Integer> {
    private final StudentTable studentTable;

    public StudentRepository(StudentTable studentTable) {
        this.studentTable = studentTable;
    }

    @Override
    public Student save(Student student) {
        studentTable.save(student);
        return student;
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
        return studentTable.removeByFirstName(firstName);  // void ?
    }

    @Override
    public Student deleteByGroupAndBrsDate(int groupNumber, int brsDate) {
        return null;
    }

}
