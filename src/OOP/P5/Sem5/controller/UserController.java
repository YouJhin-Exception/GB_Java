package OOP.P5.Sem5.controller;

import OOP.P5.Sem5.data.User;

public interface UserController<U extends User, I> extends Controller<U, I> {
    U findByLastName(String lastName);

}
