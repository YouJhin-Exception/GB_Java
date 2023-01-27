package OOP.Project.service;

import OOP.Project.data.StudentGroup;

public interface StudentGroupService {

    StudentGroup getGroup();

    StudentGroup getGroup(int number);

    void removeStudent(String firstName, String lastName);

}
