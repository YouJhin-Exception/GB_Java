package OOP.P5.Sem5.controller;

import OOP.P5.Sem5.data.StudentGroup;
import OOP.P5.Sem5.service.StudentGroupServiceImpl;

public class GroupController implements Controller<StudentGroup, Integer> {
    private final StudentGroupServiceImpl studentGroupService;


    public GroupController(StudentGroupServiceImpl studentGroupService) {
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
