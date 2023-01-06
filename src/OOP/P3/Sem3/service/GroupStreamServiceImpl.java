package OOP.P3.Sem3.service;

import OOP.P3.Sem3.data.GroupStream;
import OOP.P3.Sem3.data.comparator.GroupStreamComparator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GroupStreamServiceImpl {
    public void sortStreamList(List<GroupStream> groupStreamsList) {
        groupStreamsList.sort(new GroupStreamComparator());
    }
}

