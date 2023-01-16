package OOP.P5.Sem5.service;

import OOP.P5.Sem5.data.GroupStream;
import OOP.P5.Sem5.data.comparators.GroupStreamComparator;
import OOP.P5.Sem5.repository.GroupStreamRepository;

import java.util.List;

public class GroupStreamServiceImpl implements GroupStreamService {
    private final GroupStreamRepository groupStreamRepository;

    public GroupStreamServiceImpl(GroupStreamRepository groupStreamRepository) {
        this.groupStreamRepository = groupStreamRepository;
    }

    @Override
    public void sortStreamList(List<GroupStream> groupStreamsList) {
        groupStreamsList.sort(new GroupStreamComparator());
    }

    public GroupStream saveGroupStream(GroupStream groupStream) {
        return groupStreamRepository.save(groupStream);
    }

    public GroupStream findGroupStreamById(Integer id) {
        return groupStreamRepository.findById(id);
    }
}

