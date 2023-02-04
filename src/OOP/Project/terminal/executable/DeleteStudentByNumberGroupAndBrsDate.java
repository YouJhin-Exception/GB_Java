package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.StudentService;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;
import OOP.Project.view.TerminalView.CmdView;

public class DeleteStudentByNumberGroupAndBrsDate extends CmdView implements CommandExecutable {
    private final UserService<Student, String> studentService;
    private final Command command;


    public DeleteStudentByNumberGroupAndBrsDate(Command command) {
        this.studentService = new StudentService();
        this.command = command;
    }

    @Override
    public void execute() {
        studentService.deleteByGroupAndBrsDate(command.getArgument(6), command.getArgument(3));
        viewExeCommand(command);
    }
}
