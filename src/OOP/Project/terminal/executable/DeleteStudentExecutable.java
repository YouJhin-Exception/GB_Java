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
        studentService.deleteUser(new Student(command.getFirstArgument(),
                command.getSecondArgument(),
                command.getThirdArgument(),
                command.getFourthArgument(),
                command.getFifthArgument(),
                command.getSixthArgument(),
                command.getSeventhArgument()));
        viewExeCommand(command);
    }
}
