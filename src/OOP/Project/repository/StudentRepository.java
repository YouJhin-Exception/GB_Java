package OOP.Project.repository;

import OOP.Project.data.Student;
import OOP.Project.db.StudentTable;

public class StudentRepository implements UserRepository<Student, Integer> {
    private final StudentTable studentTable;

    public StudentRepository() {
        this.studentTable = new StudentTable();
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

    public void deleteByFirstName(String firstName) {
        studentTable.removeByFirstName(firstName);
    }

    @Override
    public Student deleteByGroupAndBrsDate(int groupNumber, String brsDate) {
        return null; // метод из табле
    }
}
