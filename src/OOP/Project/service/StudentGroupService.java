package OOP.Project.service;

import OOP.Project.data.StudentGroup;

public interface StudentGroupService<S extends StudentGroup, I> {

    S getGroup();

    S getGroup(int number);

    void removeStudent(String firstName, String lastName);

    S saveGroup(S students);

    S findGroupById(I id);

    void deleteGroup(S students);

}
