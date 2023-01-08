package OOP.P4.Sem4.data;

public class Student extends User implements Comparable<Student> {

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


    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.getBrDate(), this.getBrDate());
        //if (o.getBrDate() > this.getBrDate()) return 1;
        //if (o.getBrDate() < this.getBrDate()) return -1;
        //return 0;
    }
}
