package OOP.P5.Sem5.data;

public class Student extends User implements Comparable<Student> {

    private String course;
    private int groupNumber;
//    public Student(String lastName) {
//        super(lastName);
//    }

    public Student(String firstName) {
        super(firstName);
    }

    public Student(String firstName, String lastName, String passport, String brDate, int id, String course, int groupNumber) {
        super(firstName, lastName, passport, brDate, id);
        this.course = course;
        this.groupNumber = groupNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public int compareTo(Student o) {
        return CharSequence.compare(o.getBrDate(), this.getBrDate());
        //if (o.getBrDate() > this.getBrDate()) return 1;
        //if (o.getBrDate() < this.getBrDate()) return -1;
        //return 0;
    }

    @Override
    public String toString() {
        return "Student-" + super.toString() + " course = " + course + ", groupNumber = " + groupNumber + '}';
    }
}
