package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.StudentService;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;
import OOP.Project.view.TerminalView.CmdView;

public class CreateStudentByNameExecutable extends CmdView implements CommandExecutable {
    private final UserService<Student, String> studentService;
    private final Command command;

    public CreateStudentByNameExecutable(Command command) {
        studentService = new StudentService();
        this.command = command;
    }

    @Override
    public void execute() {
        studentService.createByName(command.getFirstArgument());
        viewExeCommand(command);
    }
}
