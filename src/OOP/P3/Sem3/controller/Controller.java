package OOP.P3.Sem3.controller;


import OOP.P3.Sem3.data.StudentGroup;
import OOP.P3.Sem3.service.DataService;
import OOP.P3.Sem3.service.StudentGroupServiceImpl;

public class Controller {
    private DataService groupService;
    private StudentGroupServiceImpl studentGroupService;

    public Controller(StudentGroupServiceImpl studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public Controller(DataService groupService) {
        this.groupService = groupService;
    }

    public StudentGroup createGroup(int groupNumber) {
        return groupService.getGroup(groupNumber);
    }

    public void removeStudent(String firstName) {
        studentGroupService.removeStudent(firstName);

    }

    public void sortStudents(StudentGroup group) {
        studentGroupService.sortStudent(group);
    }

    public void sortStudentsByFName(StudentGroup group) {
        studentGroupService.sortFNameStudent(group);
    }
}
