package OOP.P4.Sem4.controller;

public interface Controller <E,I>{
    E save (E e);
    E findById (I id);
}
