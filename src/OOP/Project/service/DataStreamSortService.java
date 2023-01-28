package OOP.Project.service;

import OOP.Project.data.GroupStream;

import java.util.List;

public interface DataStreamSortService<S extends GroupStream> {
    void sortStreamList(List<S> groupStreamsList);
}
