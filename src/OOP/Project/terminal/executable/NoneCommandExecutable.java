package OOP.Project.terminal.executable;

public class NoneCommandExecutable extends AbstractCommandExecutable {
    private static final String DESCRIPTION = "Неизвестная команда ";

    @Override
    public CommandResult execute() {
        return new CommandResult(getDescription());
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION;
    }
}
