package P4.Sem4.repository;

import P4.Sem4.data.User;

public interface UserRepository<E extends User,I> extends Repository<E,I>  {
    E findByLName(String lname);

}
