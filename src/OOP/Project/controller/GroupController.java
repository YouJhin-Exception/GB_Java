package OOP.Project.controller;

import OOP.Project.data.StudentGroup;
import OOP.Project.service.StudentGroupService;

public class GroupController implements Controller<StudentGroup, Integer> {
    private final StudentGroupService<StudentGroup, Integer> studentGroupService;

    public GroupController(StudentGroupService<StudentGroup, Integer> studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    @Override
    public StudentGroup save(StudentGroup studentGroup) {
        return studentGroupService.saveGroup(studentGroup);
    }

    @Override
    public StudentGroup findById(Integer id) {
        return studentGroupService.findGroupById(id);
    }
}
