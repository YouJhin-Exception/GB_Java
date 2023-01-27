package OOP.Project.view.TerminalView;

import OOP.Project.data.User;

public interface CommandView<U extends User> {
    void addUser(U u);

    void delUser(U u);

    void unknown();

}
