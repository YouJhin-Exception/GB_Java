package OOP.P2.HW2.dataHW2;

public class Student extends User{

    private String course;

    public Student(String fNmane, String lName, String passport, int brDate, String course) {
        super(fNmane, lName, passport, brDate);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


}
