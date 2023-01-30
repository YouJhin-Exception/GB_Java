package OOP.Project.db;

import OOP.Project.data.Student;

public class StudentTable extends Table<Student> {
    public StudentTable() {
        super();
    }

    public Student removeByFirstName(String firstName){
        Student delStud = new Student(firstName);
        elements.removeIf(s -> s.getFirstName().equals(firstName));
        return delStud; // костыльные костыли, подумать....
    }
}
