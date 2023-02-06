package OOP.Project.terminal;

import java.util.ArrayList;
import java.util.List;

public class Command {
    private static final String ADD_BY_NAME = "+n";
    private static final String ADD_COMMAND = "add";
    private static final String DEL_COMMAND = "del";
    private static final String DEL_BY_NAME = "-n";
    private static final String DEL_BY_GROUP_AND_DATE = "-gd";
    private final List<String> arguments;
    private final String inCommand;

    public Command(List<String> commands) {
        this.inCommand = commands.get(0);
        this.arguments = new ArrayList<>(commands);

        if (arguments.size() > 0) {
            arguments.remove(0); // отсекаем команду от студента
        }
    }

    public String getInCommand() {
        return inCommand;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public String getArgument(int index) { // для создания студента
        return arguments.get(index);
    }

    public boolean isCreateCommand() {
        return inCommand.equals(ADD_BY_NAME);
    }

    public boolean isCreateFullCommand() {
        return inCommand.equals(ADD_COMMAND);
    }

    public boolean isDeleteCommand() {
        return inCommand.equals(DEL_COMMAND);
    }

    public boolean isDelByNameCommand() {
        return inCommand.equals(DEL_BY_NAME);
    }

    public boolean isDelByGroupAndDateCommand() {
        return inCommand.equals(DEL_BY_GROUP_AND_DATE);
    }

    @Override
    public String toString() {
        return "Command{" + "arguments=" + arguments + ", Command='" + inCommand + '\'' + '}';
    }
}
