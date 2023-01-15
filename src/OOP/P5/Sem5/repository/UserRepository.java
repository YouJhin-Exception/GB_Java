package OOP.P5.Sem5.repository;

import OOP.P5.Sem5.data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    E findByLastName(String lastName);

}
