package OOP.P5.Sem5.terminal.executable;

import OOP.P5.Sem5.data.Student;
import OOP.P5.Sem5.service.StudentService;

public class CommandExecutableFactory {
    StudentService studentService;

    // String firstName, String lastName, String passport, int brDate, int id, String course
    public CommandExecutable create(String[] input) {
        Student inStudent = new Student(input[1], input[2], input[3], Integer.parseInt(input[4]), Integer.parseInt(input[5]), input[6], Integer.parseInt(input[7]));
        if (input[0].equals("add")) {
            return new CreateStudentExecutable(studentService, new Student(input[1]));
        } else if (input[0].equals("add+")) {
            System.out.println("Saving... " + inStudent); // написать нормальные вьюеры
            return new CreateStudentExecutable(studentService, inStudent);
        } else if (input[0].equals("delete")) {
            return new DeleteStudentExecutable(studentService, inStudent);
        } else if (input[0].equals("delByName")) {
            return new DeleteStudentByNameExecutable(studentService, input[1]);
        } else if (input[0].equals("delByGroupAndDate")) {
            return new DeleteStudentByNumberGroupAndBrsDate(studentService, Integer.parseInt(input[7]), Integer.parseInt(input[4]));

        }
        return null;
    }
}
