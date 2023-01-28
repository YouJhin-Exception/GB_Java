package OOP.Project.controller;


import OOP.Project.data.GroupStream;
import OOP.Project.service.GroupStreamService;

public class GroupStreamController implements Controller<GroupStream, Integer> {
    private final GroupStreamService<GroupStream, Integer> groupStreamService;

    public GroupStreamController(GroupStreamService<GroupStream, Integer> groupStreamService) {
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
