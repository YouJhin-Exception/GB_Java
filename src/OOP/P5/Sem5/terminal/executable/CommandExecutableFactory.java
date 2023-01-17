package OOP.P5.Sem5.terminal.executable;

import OOP.P5.Sem5.data.Student;
import OOP.P5.Sem5.service.StudentService;

public class CommandExecutableFactory {
    StudentService studentService;

    public CommandExecutable create(String[] input) {
        if (input[0].equals("add")) {
            return new CreateStudentExecutable(studentService, new Student(input[1]));
        } else {
            return new DeleteStudentExecutable(studentService, new Student(input[1]));
        }
    }

}
