package OOP.P4.Sem4.service;


import OOP.P4.Sem4.data.StudentGroup;
import OOP.P4.Sem4.data.User;

public interface DataService<U extends User> {
    StudentGroup getGroup(int numb);

}
