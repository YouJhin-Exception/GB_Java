package OOP.P2.HW2.ServiceHW2;

import OOP.P2.HW2.DataHW2.StudentGroup;
import OOP.P2.HW2.UtilHW2.ReadFromTxt;


public class StudentGroupServiceImpl implements DataService {

    @Override
    public StudentGroup getGroup(int numb) {
        return new StudentGroup(ReadFromTxt.readTeacher(),ReadFromTxt.readStudent(),numb);
    }
}
