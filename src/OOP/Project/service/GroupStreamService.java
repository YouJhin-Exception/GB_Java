package OOP.Project.service;

import OOP.Project.data.GroupStream;

public interface GroupStreamService<G extends GroupStream, I> {
    G saveGroupStream(G studentGroups);

    G findGroupStreamById(I id);

    void deleteStream(G studentGroups);
}
