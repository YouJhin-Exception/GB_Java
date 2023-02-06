package OOP.Project.terminal.executable;

import OOP.Project.data.Student;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;

public class DeleteStudentByNumberGroupAndBrsDate extends AbstractCommandExecutable {
    private static final String DESCRIPTION = "Команда для удаления студента по возрасту и номеру группы ";
    private final UserService<Student, String> studentService;
    private final String brDate;
    private final String groupNumber;


    public DeleteStudentByNumberGroupAndBrsDate(Command command, UserService<Student, String> studentService) {
        this.studentService = studentService;
        this.brDate = command.getArguments().get(0);
        this.groupNumber = command.getArguments().get(1);
    }

    @Override
    public CommandResult execute() {
        studentService.deleteByGroupAndBrsDate(brDate, groupNumber);
        return createResult(true);
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION + "Br Date -> " + brDate +" Group Number -> "+groupNumber+" ";
    }
}
