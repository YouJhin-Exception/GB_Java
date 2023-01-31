package OOP.Project.terminal;

import OOP.Project.terminal.executable.CommandExecutable;
import OOP.Project.terminal.executable.CommandExecutableFactory;
import OOP.Project.terminal.executable.CommandExecutableFactoryImpl;
import OOP.Project.view.TerminalView.CmdView;

import java.util.Scanner;

public class TerminalReader extends CmdView {
    private static TerminalReader terminalReader; //для синглтона
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public TerminalReader() {
        this.commandParser = new CommandParserImpl();
        this.commandExecutableFactory = new CommandExecutableFactoryImpl(); // переделать на loging IMPL
    }

    public static TerminalReader getInstance() {
        if (terminalReader == null) {
            terminalReader = new TerminalReader();
        }
        return terminalReader;
    }

    public void runReader() {
        startDescription(); // изменить
        Scanner inCommand = new Scanner(System.in);
        while (true) {
            String commandLine = inCommand.nextLine();
            if (commandLine.equals("exit")) break;
            Command inParseCommand = commandParser.parseCommand(commandLine);
            CommandExecutable commandExecutable = commandExecutableFactory.create(inParseCommand);
            commandExecutable.execute();
        }
    }

}
