package OOP.Project.controller;

import OOP.Project.data.User;

public interface UserController<U extends User, I> extends Controller<U, I> {
    U findByLastName(I lastName);

}
