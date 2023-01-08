package P4.Sem4.service;

import P4.Sem4.data.GroupStream;
import P4.Sem4.data.comparators.GroupStreamComparator;

import java.util.List;

public class GroupStreamServiceImpl implements StreamService {
    @Override
    public void sortStreamList(List<GroupStream> groupStreamsList) {
        groupStreamsList.sort(new GroupStreamComparator());
    }
}

