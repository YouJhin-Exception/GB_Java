package OOP.P5.Sem5.view.TerminalView;

import OOP.P5.Sem5.data.User;

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
}
