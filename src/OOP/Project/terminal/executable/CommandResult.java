package OOP.Project.terminal.executable;

public class CommandResult {
    private final String description;
    private Boolean isSuccess;

    public CommandResult(String description, Boolean isSuccess) {
        this.description = description;
        this.isSuccess = isSuccess;
    }

    public CommandResult(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        if (isSuccess == null) return description;
        return description + (isSuccess ? "выполнена" : "не выполнена");
    }
}
