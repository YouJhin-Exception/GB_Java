package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.StudentService;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;
import OOP.Project.view.TerminalView.CmdView;

public class CreateStudentExecutable implements CommandExecutable {
    private final UserService<Student, Integer> studentService;
    private final Command command;

    public CreateStudentExecutable(Command command) {
        super(); // nax ????
        this.studentService = new StudentService();
        this.command = command;
    }

    // String firstName, String lastName, String passport, String brDate, int id, String course, int groupNumber
    @Override
    public void execute() {
        studentService.createUser(new Student(command.getFirstArgument(),
                command.getSecondArgument(),
                command.getThirdArgument(),
                command.getFourthArgument(),
                Integer.parseInt(command.getFifthArgument()),
                command.getSixthArgument(),
                Integer.parseInt(command.getSeventhArgument())));

        // можно добавить отображение команды
    }
}
