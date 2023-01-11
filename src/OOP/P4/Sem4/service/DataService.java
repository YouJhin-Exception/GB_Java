package OOP.P4.Sem4.service;
import OOP.P4.Sem4.data.User;


public interface DataService<U extends User,I> {

    U read (U user);
    void create (U user);

    U save (U user);
    U findById(I id);
    U findByLname(String Lname);

}
