package OOP.P5.Sem5.controller;


import OOP.P5.Sem5.data.GroupStream;
import OOP.P5.Sem5.service.GroupStreamServiceImpl;

public class GroupStreamController implements Controller<GroupStream, Integer> {
    private final GroupStreamServiceImpl groupStreamService;

    public GroupStreamController(GroupStreamServiceImpl groupStreamService) {
        this.groupStreamService = groupStreamService;
    }


    @Override
    public GroupStream save(GroupStream studentGroups) {
        return null;
    }

    @Override
    public GroupStream findById(Integer id) {
        return null;
    }
}