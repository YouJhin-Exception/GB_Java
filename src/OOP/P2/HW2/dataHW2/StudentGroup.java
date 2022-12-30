package OOP.P2.HW2.dataHW2;

import java.util.List;

public class StudentGroup {

    private Teacher teacher;
    private List<Student> studentList;
    private int groupNumb;

    public StudentGroup(Teacher teacher, List<Student> studentList, int groupNumb) {
        this.teacher = teacher;
        this.studentList = studentList;
        this.groupNumb = groupNumb;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getGroupNumb() {
        return groupNumb;
    }

    public void setGroupNumb(int groupNumb) {
        this.groupNumb = groupNumb;
    }
}
