package OOP.P5.Sem5.service;

import OOP.P5.Sem5.data.GroupStream;
import OOP.P5.Sem5.data.comparators.GroupStreamComparator;

import java.util.List;

public class GroupStreamServiceImpl implements GroupStreamService {

    @Override
    public void sortStreamList(List<GroupStream> groupStreamsList) {
        groupStreamsList.sort(new GroupStreamComparator());
    }
}

