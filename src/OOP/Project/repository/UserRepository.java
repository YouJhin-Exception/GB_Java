package OOP.Project.repository;

import OOP.Project.data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    void createByUserName(I firstName); // void ?

    E findByLastName(I lastName);

    void deleteByFirstName(I firstName);

    void deleteByGroupAndBrsDate(I brsDate, I groupNumber);

}
