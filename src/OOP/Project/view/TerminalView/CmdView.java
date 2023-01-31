package OOP.Project.view.TerminalView;

import OOP.Project.data.User;

public class CmdView implements CommandView<User> {
    @Override
    public void addUser(User user) {
        System.out.println(user.toString()+" -> was add");
    }

    @Override
    public void delUser(User user) {
        System.out.println(user.toString()+" -> was deleted");
    }

    @Override
    public void unknown() {
        System.out.println("Моя не знать таких команд... обратитесь.... к кому-нибудь...");
    }

    @Override
    public void startDescription() {
        System.out.println("""
                Супер прога с 3мя командами -))
                
                Действующие команды:
                ad_fn - Добавление по фамилии
                add - Полное добавление по конструктору(String firstName, String lastName, String passport, String brDate, int id, String course, int groupNumber)
                del_fn - Удаление по фамилии
                Разделитель - ,\s""");
    }
}
