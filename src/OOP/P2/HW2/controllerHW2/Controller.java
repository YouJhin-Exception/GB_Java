package OOP.P2.HW2.controllerHW2;

import OOP.P2.HW2.dataHW2.StudentGroup;
import OOP.P2.HW2.serviceHW2.DataService;

public class Controller {
    private DataService groupService;

    public Controller(DataService groupService) {
        this.groupService = groupService;
    }
    public StudentGroup createGroup(int groupNumber){
        return groupService.getGroup(groupNumber);
    }
}
