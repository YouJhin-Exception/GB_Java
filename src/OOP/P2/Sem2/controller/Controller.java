package OOP.P2.Sem2.controller;

import OOP.P2.Sem2.data.Student;
import OOP.P2.Sem2.servise.DataService;
import OOP.P2.Sem2.servise.StudentServeceImpl;
import OOP.P2.Sem2.view.UserView;

public class Controller {
    private DataService studentServece;

    public Controller(StudentServeceImpl studentServece) {
        this.studentServece = studentServece;
    }

    public Student createStudent(Student student) {
        studentServece.create(student);
        return (Student) studentServece.read(student);

    }
}
