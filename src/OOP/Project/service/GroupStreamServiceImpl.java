package OOP.Project.service;

import OOP.Project.data.GroupStream;
import OOP.Project.data.comparators.GroupStreamComparator;
import OOP.Project.repository.Repository;

import java.util.List;

public class GroupStreamServiceImpl implements GroupStreamService<GroupStream, Integer> {
    private final Repository<GroupStream, Integer> groupStreamRepository;

    public GroupStreamServiceImpl(Repository<GroupStream, Integer> groupStreamRepository) {
        this.groupStreamRepository = groupStreamRepository;
    }

    @Override
    public void sortStreamList(List<GroupStream> groupStreamsList) {
        groupStreamsList.sort(new GroupStreamComparator());
    }

    @Override
    public GroupStream saveGroupStream(GroupStream groupStream) {
        return groupStreamRepository.save(groupStream);
    }

    @Override
    public GroupStream findGroupStreamById(Integer id) {
        return groupStreamRepository.findById(id);
    }

    @Override
    public void deleteStream(GroupStream list) {
        groupStreamRepository.delete(list);
    }

}

