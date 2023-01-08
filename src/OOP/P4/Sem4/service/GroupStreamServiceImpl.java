package OOP.P4.Sem4.service;

import OOP.P4.Sem4.data.GroupStream;
import OOP.P4.Sem4.data.comparators.GroupStreamComparator;

import java.util.List;

public class GroupStreamServiceImpl implements StreamService {
    @Override
    public void sortStreamList(List<GroupStream> groupStreamsList) {
        groupStreamsList.sort(new GroupStreamComparator());
    }
}

