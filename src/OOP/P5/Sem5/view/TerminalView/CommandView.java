package OOP.P5.Sem5.view.TerminalView;

import OOP.P5.Sem5.data.User;

public interface CommandView<U extends User> {
    void addUser(U u);

    void delUser(U u);

    void unknown();

}
