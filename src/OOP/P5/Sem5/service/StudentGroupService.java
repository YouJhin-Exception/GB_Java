package OOP.P5.Sem5.service;

import OOP.P5.Sem5.data.StudentGroup;

public interface StudentGroupService {

    StudentGroup getGroup();
    StudentGroup getGroup(int number);
    void removeStudent(String firstName, String lastName);
    void sortStudents(StudentGroup studentGroup);

}
