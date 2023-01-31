package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.StudentService;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;

public class DeleteStudentByNumberGroupAndBrsDate implements CommandExecutable {
    private final UserService<Student,Integer> studentService;
    private final Command command;


    public DeleteStudentByNumberGroupAndBrsDate(Command command) {
        this.studentService = new StudentService();
        this.command = command;
    }

    @Override
    public void execute() {
        studentService.deleteByGroupAndBrsDate(Integer.parseInt(command.getSeventhArgument()),command.getFourthArgument());
        // print output
    }
}
