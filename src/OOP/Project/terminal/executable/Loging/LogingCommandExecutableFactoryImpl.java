package OOP.Project.terminal.executable.Loging;

import OOP.Project.data.Student;
import OOP.Project.service.UserService;
import OOP.Project.terminal.Command;
import OOP.Project.terminal.executable.CommandExecutable;
import OOP.Project.terminal.executable.CommandExecutableFactoryImpl;

public class LogingCommandExecutableFactoryImpl extends CommandExecutableFactoryImpl {

    //private static final UserService<Student, Integer> studentService;

    public LogingCommandExecutableFactoryImpl(UserService<Student, Integer> studentService) {
        super(studentService);
    }


    @Override
    public CommandExecutable create(Command input) {
        System.out.println(input);
        CommandExecutable result = super.create(input);
        System.out.println("MyBrain"); // toString переопределить можно
        // реализовать лог с смд
        return result;
    }
}
