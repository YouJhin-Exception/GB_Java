package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.StudentService;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;
import OOP.Project.view.TerminalView.CmdView;

public class DeleteStudentExecutable extends CmdView implements CommandExecutable {
    private final UserService<Student, String> studentService;
    private final Command command;

    public DeleteStudentExecutable(Command command) {
        this.studentService = new StudentService();
        this.command = command;
    }

    @Override
    public void execute() {
        studentService.deleteUser(new Student(command.getArgument(0),
                command.getArgument(1),
                command.getArgument(2),
                command.getArgument(3),
                command.getArgument(4),
                command.getArgument(5),
                command.getArgument(6)));
        viewExeCommand(command);
    }
}
