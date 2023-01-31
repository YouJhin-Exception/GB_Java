package OOP.Project.terminal.executable;

public class NoneCommandExecutable implements CommandExecutable {
    @Override
    public void execute() {
        System.out.println("Неизвестная команда - используйте....");
    }
}
