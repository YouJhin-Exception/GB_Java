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
        this.studentService = new StudentService();  // without super !
        this.command = command;
    }

    @Override
    public void execute() {    // уместно ли здесь new ????
        studentService.deleteUser(new Student("Удаляемый")); //??
        viewExeCommand(command);// проверить
    }
}
