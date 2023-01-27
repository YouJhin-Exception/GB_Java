package OOP.Project.controller;

import OOP.Project.data.StudentGroup;
import OOP.Project.service.StudentGroupService;
import OOP.Project.service.StudentGroupServiceImpl;

public class GroupController implements Controller<StudentGroup, Integer> {
    private final StudentGroupService studentGroupService;


    public GroupController(StudentGroupServiceImpl studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    @Override
    public StudentGroup save(StudentGroup studentGroup) {
        return studentGroupService(studentGroup);
    }

    @Override
    public StudentGroup findById(Integer id) {
        return studentGroupService.findGroupById(id);
    }
}
