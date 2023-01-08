package P4.Sem4.repository;

public interface Repository<E,I> {

    E save (E e);
    E findById (I id);
}
