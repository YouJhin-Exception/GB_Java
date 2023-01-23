package OOP.P5.Sem5.terminal.executable;

import OOP.P5.Sem5.data.Student;
import OOP.P5.Sem5.service.StudentService;
import OOP.P5.Sem5.view.TerminalView.CmdView;

public class CommandExecutableFactory {
   private StudentService studentService;
   private CmdView cmdView;

    // String firstName, String lastName, String passport, int brDate, int id, String course, int groupNumber
    public CommandExecutable create(String[] input) {
        Student inStudent = new Student(input[1], input[2], input[3], input[4], Integer.parseInt(input[5]), input[6], Integer.parseInt(input[7]));
        switch (input[0]) {
            case "add" -> {
                cmdView.addUser(new Student(input[1]));
                return new CreateStudentExecutable(studentService, new Student(input[1]));
            }
            case "add+" -> {
                cmdView.addUser(inStudent);
                return new CreateStudentExecutable(studentService, inStudent);
            }
            case "delete" -> {
                cmdView.delUser(inStudent);
                return new DeleteStudentExecutable(studentService, inStudent);
            }
            case "delByName" -> {
                cmdView.delUser(inStudent);
                return new DeleteStudentByNameExecutable(studentService, input[1]);
            }
            case "delByGroupAndDate" -> {
                cmdView.delUser(inStudent);
                return new DeleteStudentByNumberGroupAndBrsDate(studentService, Integer.parseInt(input[7]), Integer.parseInt(input[4]));
            }
        }
        cmdView.unknown();
        return null;
    }
}
