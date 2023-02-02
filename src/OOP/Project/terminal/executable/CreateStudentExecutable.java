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
        studentService.createUser(new Student(command.getFirstArgument(),
                command.getSecondArgument(),
                command.getThirdArgument(),
                command.getFourthArgument(),
                command.getFifthArgument(),
                command.getSixthArgument(),
                command.getSeventhArgument()));

        viewExeCommand(command);
    }
}
