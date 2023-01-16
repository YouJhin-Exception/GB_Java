package OOP.P5.Sem5.service;

import OOP.P5.Sem5.data.GroupStream;
import OOP.P5.Sem5.data.StudentGroup;
import OOP.P5.Sem5.data.comparators.GroupStreamComparator;
import OOP.P5.Sem5.repository.Repository;

import java.util.List;

public class GroupStreamServiceImpl implements GroupStreamService {
    private final Repository<GroupStream, Integer> repository;

    public GroupStreamServiceImpl(Repository<GroupStream, Integer> repository) {
        this.repository = repository;
    }


    @Override
    public void sortStreamList(List<GroupStream> groupStreamsList) {
        groupStreamsList.sort(new GroupStreamComparator());
    }

    public GroupStream saveGroupStream(GroupStream groupStream) {
        return repository.save(groupStream);
    }

    public GroupStream findGroupStreamById(Integer id) {
        return repository.findById(id);
    }
}

