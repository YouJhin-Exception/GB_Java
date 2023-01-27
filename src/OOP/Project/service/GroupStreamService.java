package OOP.Project.service;

import OOP.Project.data.GroupStream;

import java.util.List;

public interface GroupStreamService<G extends GroupStream,I> {
    G saveGroupStream(G studentGroups);
    G findGroupStreamById(I id);
    void deleteStream(G studentGroups);
    void sortStreamList(List<GroupStream> groupStreamsList); // не стал выносить в инт
}
