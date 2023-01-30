package OOP.Project.db;

import OOP.Project.data.User;

import java.util.ArrayList;
import java.util.List;

public abstract class Table<E extends User> {
    protected final List<E> elements;

    protected Table() {
        this.elements = new ArrayList<>();
    }

    public E save(E entity) {
        elements.add(entity);
        return entity;
    }
}
