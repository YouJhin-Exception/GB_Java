package OOP.P4.Sem4.service;

import OOP.P4.Sem4.data.GroupStream;

import java.util.List;

public interface StreamService<G extends GroupStream, I> {
    void sortStreamList(List<G> groupStreamsList);

    G save(G g);

    G findById(I id);


}
