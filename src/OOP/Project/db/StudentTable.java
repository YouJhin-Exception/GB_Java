package OOP.Project.db;

import OOP.Project.data.Student;

public class StudentTable extends Table<Student> {
    public void removeByFirstName(String firstName) {
        elements.removeIf(s -> s.getFirstName().equals(firstName));
        System.out.println(elements);
    }

    public void remove(Student student) {
        elements.remove(student);
    }

    // Либо переделать brDate & groupNumber в int-ы, либо описать String = null
    // т.к. падает с ошибкой при удалении студента с null полями, который создается через -n команду
    public void removeByGroupAndBrsDate(String brDate, String group) {

        elements.removeIf(student -> student.getBrDate().equals(brDate) &&
                student.getGroupNumber().equals(group));
        System.out.println(elements);
    }
}
