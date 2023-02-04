package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.StudentService;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;
import OOP.Project.view.TerminalView.CmdView;

public class CreateStudentExecutable extends CmdView implements CommandExecutable {
    private final UserService<Student, String> studentService;
    private final Command command;

    public CreateStudentExecutable(Command command) {
        this.studentService = new StudentService();
        this.command = command;
    }

    // String firstName, String lastName, String passport, String brDate, String id, String course, String groupNumber
    @Override
    public void execute() {
        studentService.createUser(new Student(command.getArgument(0),
                command.getArgument(1),
                command.getArgument(2),
                command.getArgument(3),
                command.getArgument(4),
                command.getArgument(5),
                command.getArgument(6)));

        viewExeCommand(command);
    }
}
