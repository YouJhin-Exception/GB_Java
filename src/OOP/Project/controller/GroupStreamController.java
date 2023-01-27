package OOP.Project.controller;


import OOP.Project.data.GroupStream;
import OOP.Project.service.GroupStreamServiceImpl;

public class GroupStreamController implements Controller<GroupStream, Integer> {
    private final GroupStreamServiceImpl groupStreamService;

    public GroupStreamController(GroupStreamServiceImpl groupStreamService) {
        this.groupStreamService = groupStreamService;
    }


    @Override
    public GroupStream save(GroupStream groupStream) {
        return groupStreamService.saveGroupStream(groupStream);
    }

    @Override
    public GroupStream findById(Integer id) {
        return groupStreamService.findGroupStreamById(id);
    }
}
