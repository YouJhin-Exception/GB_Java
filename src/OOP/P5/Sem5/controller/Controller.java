package OOP.P5.Sem5.controller;

public interface Controller<E, I> {
    E save(E e);

    E findById(I id);
}
