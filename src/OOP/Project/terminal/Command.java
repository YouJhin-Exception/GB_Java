package OOP.Project.terminal;

import java.util.List;

public class Command {
    private static final String ADD_BY_NAME = "ad_fn";
    private static final String ADD_COMMAND = "add";
    private static final String DEL_COMMAND = "del";
    private static final String DEL_BY_NAME = "del_fn";
    private static final String DEL_BY_GROUP_AND_DATE = "del_gd";
    private final List<String> arguments;
    private final String inCommand;

    public Command(List<String> arguments, String inCommand) {
        this.arguments = arguments;
        this.inCommand = inCommand;
    }

    public String getInCommand() {
        return inCommand;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public String getArgument(int index) {
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
        return "Command{" + "arguments=" + arguments + ", firstCommand='" + inCommand + '\'' + '}';
    }
}
