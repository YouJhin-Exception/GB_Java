package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;

public class CreateStudentByNameExecutable extends AbstractCommandExecutable {
    private static final String DESCRIPTION = "Команда для создания студента по имени -> ";
    private final UserService<Student, String> studentService;
    private final String firstName;

    public CreateStudentByNameExecutable(Command command, UserService<Student, String> studentService) {
        this.studentService = studentService;
        this.firstName = command.getArgument(0);
    }

    @Override
    public CommandResult execute() {
        studentService.createByName(firstName);
        return createResult(true);
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION + "first Name -> " + firstName+" ";
    }
}
