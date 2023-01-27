package OOP.Project.repository;

public interface Repository<E, I> {

    E save(E e);

    void delete(E e);

    E findById(I id);
}
