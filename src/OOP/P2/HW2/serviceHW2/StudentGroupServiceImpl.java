package OOP.P2.HW2.serviceHW2;

import OOP.P2.HW2.dataHW2.Student;
import OOP.P2.HW2.dataHW2.StudentGroup;
import OOP.P2.HW2.dataHW2.Teacher;
import OOP.P2.HW2.utilHW2.ReadFromTxt;

import java.util.List;


public class StudentGroupServiceImpl{
    public StudentGroup getGroup(int numb) {
        List<Student> students = ReadFromTxt.readStudent();
        Teacher teacher = ReadFromTxt.readTeacher();
        return new StudentGroup(teacher,students,numb);
    }
}
