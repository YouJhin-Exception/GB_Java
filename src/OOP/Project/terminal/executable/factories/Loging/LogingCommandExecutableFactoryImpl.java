package OOP.Project.terminal.executable.factories.Loging;

import OOP.Project.data.Student;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;
import OOP.Project.terminal.executable.CommandExecutable;
import OOP.Project.terminal.executable.factories.CommandExecutableFactoryImpl;

public class LogingCommandExecutableFactoryImpl extends CommandExecutableFactoryImpl {
    public LogingCommandExecutableFactoryImpl(UserService<Student, String> studentService) {
        super(studentService);
    }

    @Override
    public CommandExecutable create(Command input) {
        System.out.println("In command -> " + input);
        return super.create(input);
    }
}
