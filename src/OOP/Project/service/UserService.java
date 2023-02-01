package OOP.Project.service;

import OOP.Project.data.User;

public interface UserService<U extends User, I> {
    U createUser(U user);

    void deleteUser(U user);

    U findByIdUser(I id);

    U findByLastNameUser(I lastName);

    void deleteByFirstName(I firstName);

    void deleteByGroupAndBrsDate(I groupNumber, I brsDate);

    void createByName(I firstName);
}

