package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;

public class CreateStudentExecutable extends AbstractCommandExecutable {
    private static final String DESCRIPTION = "Команда для создания студента ";

    private final UserService<Student, String> studentService;
    private final Student student;

    public CreateStudentExecutable(UserService<Student, String> studentService, Command command) {
        this.studentService = studentService;
        this.student = new Student(command.getArgument(0),
                command.getArgument(1),
                command.getArgument(2),
                command.getArgument(3),
                command.getArgument(4),
                command.getArgument(5),
                command.getArgument(6));
    }

    // String firstName, String lastName, String passport, String brDate, String id, String course, String groupNumber
    @Override
    public CommandResult execute() {
        studentService.createUser(student);
        return createResult(true);
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION + student.toString() + " ";
    }
}
