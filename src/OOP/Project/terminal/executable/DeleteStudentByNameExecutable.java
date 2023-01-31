package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.StudentService;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;

public class DeleteStudentByNameExecutable implements CommandExecutable {

    private final UserService<Student, Integer> studentService;
    private final Command command;

    public DeleteStudentByNameExecutable(Command command) {
        this.studentService = new StudentService();
        this.command = command;
    }

    @Override
    public void execute() {
        studentService.deleteByFirstName(command.getFirstArgument());
        // print command

    }
}
