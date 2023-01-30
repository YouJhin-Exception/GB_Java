package OOP.Project.db;

import OOP.Project.data.Student;

public class StudentTable extends Table<Student> {
    public Student removeByFirstName(String firstName){
        elements.removeIf(s -> s.getFirstName().equals(firstName));
        return null;
    }
}
