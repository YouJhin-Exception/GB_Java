package OOP.P2.Sem2.servise;

import OOP.P2.Sem2.data.User;

public interface DataService {
    User read(User user);

    void create(User user);

}
