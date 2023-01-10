package OOP.P4.Sem4.controller;

import OOP.P4.Sem4.data.GroupStream;
import OOP.P4.Sem4.service.GroupStreamServiceImpl;

public class GroupStreamController implements Controller<GroupStream,Integer>{
    private final GroupStreamServiceImpl groupStreamService;


    public GroupStreamController(GroupStreamServiceImpl groupStreamService) {
        this.groupStreamService = groupStreamService;
    }

    @Override
    public GroupStream save(GroupStream studentGroups) {
        return groupStreamService.save(studentGroups);
    }

    @Override
    public GroupStream findById(Integer id) {
        return groupStreamService.findById(id);
    }
}
