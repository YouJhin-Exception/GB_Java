package OOP.P2.Sem2.servise;

import OOP.P2.Sem2.data.User;
import OOP.P2.Sem2.util.ReaderFromTxt;
import OOP.P2.Sem2.util.WriterToTxt;

public class TeacherServeceImpl implements DataService {
    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }

    @Override
    public void create(User user) {
        WriterToTxt.write(user);

    }
}
