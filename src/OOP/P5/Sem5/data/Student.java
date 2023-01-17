package OOP.P5.Sem5.data;

public class Student extends User implements Comparable<Student> {

    private String course;
    public Student(String lastName){
        super(lastName);
    }

    public Student(String firstName, String lastName, String passport, int brDate, int id, String course) {
        super(firstName, lastName, passport, brDate, id);
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
