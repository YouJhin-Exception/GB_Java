package OOP.P5.Sem5.service;

import OOP.P5.Sem5.data.User;

import java.util.List;
public interface DataUserService<U extends User, I> {

    U createUser(U user);

    U findById(I id);

    U findByLastName(String lastName);

    void sortUsers(List<U> users);
    void sortByName(List<U> users);

}
