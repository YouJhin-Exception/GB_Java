package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;

public class DeleteStudentByFirstNameExecutable extends AbstractCommandExecutable {
    private static final String DESCRIPTION = "Команда для удаления студента по фамилии ";

    private final UserService<Student, String> studentService;
    private final String firstName;


    public DeleteStudentByFirstNameExecutable(UserService<Student, String> studentService, Command command) {
        this.studentService = studentService;
        this.firstName = command.getArguments().get(0);

    }

    @Override
    public CommandResult execute() {
        studentService.deleteByFirstName(firstName);
        return createResult(true);
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION + "first Name -> " + firstName+" ";
    }
}
