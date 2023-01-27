package OOP.Project.controller;

public interface Controller<E, I> {
    E save(E e);

    E findById(I id);
}
