package OOP.Project.db;

import OOP.Project.data.User;

import java.util.ArrayList;
import java.util.List;

public abstract class Table<E extends User> {
    protected List<E> elements;

    protected Table() {
        this.elements = new ArrayList<>();
    }

    public E save(E entity) {
        this.elements.add(entity);
        System.out.println(elements);
        return entity;
    }
}
