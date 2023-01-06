package OOP.P3.Sem3.service;

import OOP.P3.Sem3.data.GroupStream;
import OOP.P3.Sem3.data.comparators.GroupStreamComparator;

import java.util.List;

public class GroupStreamServiceImpl implements StreamService {
    @Override
    public void sortStreamList(List<GroupStream> groupStreamsList) {
        groupStreamsList.sort(new GroupStreamComparator());
    }
}

