package OOP.P5.Sem5.terminal;

import OOP.P5.Sem5.terminal.executable.CommandExecutable;
import OOP.P5.Sem5.terminal.executable.CommandExecutableFactory;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;

    public static TerminalReader getInstance(CommandParser commandParser1) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser1);
        }
        return terminalReader;
    }

    public TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public void getI(int f) {
        Scanner inCommand = new Scanner(System.in);
        for (; ; ) {  // изменил с while
            String commandLine = inCommand.nextLine();
            String[] inParseCommand = commandParser.parseCommand(commandLine);
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.create(inParseCommand);
            commandExecutable.execute();
        }
    }

}
