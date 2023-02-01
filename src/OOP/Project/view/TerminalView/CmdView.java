package OOP.Project.view.TerminalView;

import OOP.Project.terminal.Command;

public class CmdView implements CommandView<Command> {

    private void addUser(Command command) {
        System.out.println(command.getArguments() + " -> was add");
    }

    private void delUser(Command command) {
        System.out.println(command.getArguments() + " -> was deleted");
    }

    //    private void unknown() {
//        System.out.println("Моя не знать таких команд... обратитесь.... к кому-нибудь...");
//    }
    @Override
    public void viewExeCommand(Command command) {
        switch (command.getInCommand()) {
            case "add", "ad_fn" -> addUser(command);
            case "del_fn" -> delUser(command);
            // default -> unknown();
        }
    }

    public void startDescription() {
        System.out.println("""
                Супер прога с 3мя командами -))
                                
                Действующие команды:
                ad_fn - Добавление по имени
                add - Полное добавление по конструктору(String firstName, String lastName, String passport, String brDate, String id, String course, String groupNumber)
                del_fn - Удаление по имени
                Разделитель - ,\s""");
    }
}