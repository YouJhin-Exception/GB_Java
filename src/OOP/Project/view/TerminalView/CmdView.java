package OOP.Project.view.TerminalView;

import OOP.Project.terminal.executable.CommandResult;

public class CmdView implements CommandView<CommandResult> {

    private static final String DESCRIPTION = """
            Действующие команды:
            +n - Добавление по имени
            add - Полное добавление по конструктору(String firstName, String lastName, String passport, String brDate, String id, String course, String groupNumber)
            -n - Удаление по имени               \s
            Разделитель - пробел""";


    @Override
    public void viewExeCommand(CommandResult commandResult) {
        System.out.println(commandResult);
    }

    @Override
    public void startDescription() {
        System.out.println(DESCRIPTION);
    }
}