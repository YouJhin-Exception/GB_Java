package OOP.P4.Sem4.controller;

import OOP.P4.Sem4.data.User;

public interface UserController <U extends User, I> extends Controller<U, I> {
    U findByLname (String lName);

}
