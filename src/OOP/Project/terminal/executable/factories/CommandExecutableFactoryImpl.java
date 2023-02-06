package OOP.Project.terminal.executable.factories;

import OOP.Project.data.Student;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;
import OOP.Project.terminal.executable.*;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {

    private final UserService<Student, String> studentService;

    public CommandExecutableFactoryImpl(UserService<Student, String> studentService) {
        this.studentService = studentService;
    }

    @Override
    public CommandExecutable create(Command input) {

        if (input.isCreateFullCommand()) {
            return new CreateStudentExecutable(studentService,input);
        } else if (input.isDeleteCommand()) {
            return new DeleteStudentExecutable(studentService,input);
        } else if (input.isDelByNameCommand()) {
            return new DeleteStudentByFirstNameExecutable(studentService,input);
        } else if (input.isDelByGroupAndDateCommand()) {
            return new DeleteStudentByNumberGroupAndBrsDate(input,studentService);
        } else if (input.isCreateCommand()) {
            return new CreateStudentByNameExecutable(input,studentService);
        }
        return new NoneCommandExecutable();
    }
}
