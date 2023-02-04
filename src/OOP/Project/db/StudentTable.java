package OOP.Project.db;

import OOP.Project.data.Student;

public class StudentTable extends Table<Student> {
//    public StudentTable() {
//        super();
//    }

    public void removeByFirstName(String firstName) {
        elements.removeIf(s -> s.getFirstName().equals(firstName));
    }

    public void remove(Student student) {
        elements.remove(student);
    }

    public void removeByGroupAndBrsDate(String group, String brDate) {
        elements.removeIf(g -> g.getGroupNumber().equals(group) & g.getBrDate().equals(brDate));
    }
}
