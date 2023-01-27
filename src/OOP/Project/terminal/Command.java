package OOP.Project.terminal;

import java.util.List;

public class Command {
    private static final String ADD_COMMAND = "add";// add all commands
    private static final String DEL_COMMAND = "delete";
    private List<String> arguments;
    private String firstCommand; // inCommand

    public String getFirstArgument() {
        return arguments.get(0);  // отделить - мтд
    }

    public boolean isCreateCommand() {
        return firstCommand.equals(ADD_COMMAND);
    }

    public boolean isDeleteCommand() {
        return firstCommand.equals(DEL_COMMAND);
    }

    @Override
    public String toString() {
        return "Command{" +
                "arguments=" + arguments +
                ", firstCommand='" + firstCommand + '\'' +
                '}';
    }
}
