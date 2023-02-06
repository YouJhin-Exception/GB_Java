package OOP.Project.terminal.Parser;

import OOP.Project.terminal.Command;

import java.util.List;

import static java.util.Arrays.asList;

public class CommandParserImpl implements CommandParser {
    @Override
    public Command parseCommand(String inputCommand) {
        List<String> arguments = asList(inputCommand.split(" "));
        return new Command(arguments);
    }
}
