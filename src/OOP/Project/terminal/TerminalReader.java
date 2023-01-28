package OOP.Project.terminal;

import OOP.Project.terminal.executable.CommandExecutable;
import OOP.Project.terminal.executable.CommandExecutableFactory;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader; //для синглтона
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public static TerminalReader getInstance(CommandParser commandParser1, CommandExecutableFactory commandExecutableFactory1) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser1, commandExecutableFactory1);
        }
        return terminalReader;
    }

    public void runReader(int f) { // нах ф?
        Scanner inCommand = new Scanner(System.in);
        while (true) {
            String commandLine = inCommand.nextLine();
            Command inParseCommand = commandParser.parseCommand(commandLine);
            CommandExecutable commandExecutable = commandExecutableFactory.create(inParseCommand); // сократить до =
            commandExecutable.execute();// нужен ?
        }
    }

}
