package OOP.Project.terminal;

import OOP.Project.terminal.Parser.CommandParser;
import OOP.Project.terminal.executable.CommandExecutable;
import OOP.Project.terminal.executable.CommandResult;
import OOP.Project.terminal.executable.factories.CommandExecutableFactory;
import OOP.Project.view.TerminalView.CmdView;
import OOP.Project.view.TerminalView.CommandView;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader; //для синглтона

    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    private final CommandView<CommandResult> resultView;


    public TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory, CommandView<CommandResult> resultView) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
        this.resultView = resultView;
    }

    public static TerminalReader getInstance(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory, CommandView<CommandResult> resultView) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser,commandExecutableFactory, resultView);
        }
        return terminalReader;
    }

    public void run() {
        Scanner inCommand = new Scanner(System.in);
        while (true) {
            String commandLine = inCommand.nextLine();
            if (commandLine.equals("exit")) break;
            Command inParseCommand = commandParser.parseCommand(commandLine);
            CommandExecutable commandExecutable = commandExecutableFactory.create(inParseCommand);
            CommandResult result = commandExecutable.execute();

            resultView.viewExeCommand(result);

        }
    }

}
