package OOP.P4.Sem4.repository;

import OOP.P4.Sem4.data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    E findByLastName(String lastName);

}
