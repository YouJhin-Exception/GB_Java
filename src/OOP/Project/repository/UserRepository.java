package OOP.Project.repository;

import OOP.Project.data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    E createByUserName(String firstName);

    E findByLastName(String lastName);

    E deleteByFirstName(String firstName); // void ?

    E deleteByGroupAndBrsDate(int groupNumber, int brsDate);

}
