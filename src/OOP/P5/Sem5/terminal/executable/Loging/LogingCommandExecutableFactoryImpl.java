package OOP.P5.Sem5.terminal.executable.Loging;

import OOP.P5.Sem5.terminal.Command;
import OOP.P5.Sem5.terminal.executable.CommandExecutable;
import OOP.P5.Sem5.terminal.executable.CommandExecutableFactoryImpl;

public class LogingCommandExecutableFactoryImpl extends CommandExecutableFactoryImpl {

    @Override
    public CommandExecutable create(Command input) {
        System.out.println(input);
        CommandExecutable result = super.create(input);
        System.out.println("MyBrain"); // toString переопределить можно
        // реализовать лог с смд
        return result;
    }
}
