package OOP.P2.HW2.ControllerHW2;

import OOP.P2.HW2.DataHW2.StudentGroup;
import OOP.P2.HW2.ServiceHW2.DataService;

public class Controller {
    private DataService groupService;

    public Controller(DataService groupService) {
        this.groupService = groupService;
    }
    public StudentGroup createGroup(int groupNumber){
        return groupService.getGroup(groupNumber);
    }
}
