package OOP.Project.terminal.executable.Loging;

import OOP.Project.terminal.Command;
import OOP.Project.terminal.executable.CommandExecutable;
import OOP.Project.terminal.executable.CommandExecutableFactoryImpl;
import OOP.Project.view.TerminalView.LoggingCmdView;
import OOP.Project.view.TerminalView.LoggingView;

public class LogingCommandExecutableFactoryImpl extends CommandExecutableFactoryImpl {
    private final LoggingView<Command> commandLoggingView;

    public LogingCommandExecutableFactoryImpl() {
        commandLoggingView = new LoggingCmdView();
    }


    @Override
    public CommandExecutable create(Command input) {
        commandLoggingView.startLogging(input);
        CommandExecutable result = super.create(input);
        commandLoggingView.endLogging();
        return result;
    }
}
