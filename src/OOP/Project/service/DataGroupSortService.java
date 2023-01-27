package OOP.Project.service;

import OOP.Project.data.StudentGroup;

public interface DataGroupSortService<U extends StudentGroup> {
    void sortUsers(U students);

    void sortByName(U students);
}
