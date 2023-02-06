package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;

public class DeleteStudentExecutable extends AbstractCommandExecutable {

    //для протокола... бесполезный класс на данном этапе

    private static final String DESCRIPTION = "Команда для удаления студента по полному конструктору ";
    private final UserService<Student, String> studentService;
    private final Student student;


    public DeleteStudentExecutable(UserService<Student, String> studentService, Command command) {
        this.studentService = studentService;
        this.student = new Student(command.getArgument(0),
                command.getArgument(1),
                command.getArgument(2),
                command.getArgument(3),
                command.getArgument(4),
                command.getArgument(5),
                command.getArgument(6));
    }

    @Override
    public CommandResult execute() {
        studentService.deleteUser(student);
        return createResult(true);
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION + student.toString() + " ";
    }
}
