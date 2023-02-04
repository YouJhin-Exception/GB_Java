package OOP.Project.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandParserImpl implements CommandParser {
    @Override
    public Command parseCommand(String inputCommand) {
        String[] cmd = inputCommand.split(" "); // подумать о разделителе
        String inCommand = cmd[0];
        List<String> arguments = new ArrayList<>(Arrays.asList(cmd).subList(1, cmd.length));
        return new Command(arguments, inCommand);
    }
}
