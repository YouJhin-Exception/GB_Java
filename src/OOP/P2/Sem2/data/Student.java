package OOP.P2.Sem2.data;

public class Student extends User {

    private String nGroup;

    public Student(String fio, int brd, String passport, String nGroup) {
        super(fio, brd, passport);
        this.nGroup = nGroup;
    }

    public String getnGroup() {
        return nGroup;
    }

    public void setnGroup(String nGroup) {
        this.nGroup = nGroup;
    }
}
