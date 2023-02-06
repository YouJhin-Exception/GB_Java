package OOP.Project.terminal.executable;

public abstract class AbstractCommandExecutable  implements CommandExecutable{
    protected  abstract String getDescription();

    protected CommandResult createResult(Boolean isSuccess){
        return new CommandResult(getDescription(),isSuccess);
    }
}
