package OOP.P4.Sem4.service;

import OOP.P4.Sem4.data.GroupStream;
import OOP.P4.Sem4.data.comparators.GroupStreamComparator;

import java.util.List;

public class GroupStreamServiceImpl implements StreamService<GroupStream,Integer> {
    @Override
    public void sortStreamList(List<GroupStream> groupStreamsList) {
        groupStreamsList.sort(new GroupStreamComparator());
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

