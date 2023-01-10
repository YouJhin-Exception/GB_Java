package OOP.P4.Sem4.controller;

import OOP.P4.Sem4.data.StudentGroup;
import OOP.P4.Sem4.service.StudentGroupServiceImpl;

public class GroupController implements Controller<StudentGroup,Integer>{
    private final StudentGroupServiceImpl studentGroupService;


    public GroupController(StudentGroupServiceImpl studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    @Override
    public StudentGroup save(StudentGroup students) {
        return studentGroupService.saveGroup(students);
    }

    @Override
    public StudentGroup findById(Integer id) {
        return studentGroupService.getGroup(id);
    }
}
