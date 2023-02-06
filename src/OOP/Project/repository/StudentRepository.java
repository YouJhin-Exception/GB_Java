package OOP.Project.repository;

import OOP.Project.data.Student;
import OOP.Project.db.StudentTable;

public class StudentRepository implements UserRepository<Student, String> {
    private final StudentTable studentTable;

    public StudentRepository() {
        this.studentTable = new StudentTable();
    }

    @Override
    public Student save(Student student) {
        studentTable.save(student);
        return student;  // void ?
    }

    @Override
    public void delete(Student student) {
        studentTable.remove(student);
    }

    @Override
    public Student findById(String id) {
        return null;
    }

    @Override
    public void createByUserName(String firstName) {
        studentTable.save(new Student(firstName));
    }

    @Override
    public Student findByLastName(String lastName) {
        return null;
    }

    public void deleteByFirstName(String firstName) {
        studentTable.removeByFirstName(firstName);
    }

    @Override
    public void deleteByGroupAndBrsDate(String brsDate, String groupNumber) {
        studentTable.removeByGroupAndBrsDate(brsDate, groupNumber);
    }
}
