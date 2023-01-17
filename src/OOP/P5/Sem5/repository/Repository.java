package OOP.P5.Sem5.repository;

public interface Repository<E, I> {

    E save(E e);

    E delete(E e);

    E findById(I id);
}
