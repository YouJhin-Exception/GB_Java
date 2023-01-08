package P4.Sem4.controller;


import P4.Sem4.data.GroupStream;
import P4.Sem4.data.StudentGroup;
import P4.Sem4.service.DataService;
import P4.Sem4.service.GroupStreamServiceImpl;
import P4.Sem4.service.StudentGroupServiceImpl;

import java.util.List;

public class Controller {
    private final DataService groupService;
    private final StudentGroupServiceImpl studentGroupService;
    private final GroupStreamServiceImpl groupStreamService;

    public Controller(DataService groupService, StudentGroupServiceImpl studentGroupService, GroupStreamServiceImpl groupStreamService) {
        this.groupService = groupService;
        this.studentGroupService = studentGroupService;
        this.groupStreamService = groupStreamService;    }

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

    public void sortStreamGroup(List<GroupStream> groupStreamList){
        groupStreamService.sortStreamList(groupStreamList);
    }
}
