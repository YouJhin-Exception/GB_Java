package OOP.P2.Sem2.data;

public class Teacher extends User {
    private String cafedra;

    public Teacher(String fio, int brd, String passport, String cafedra) {
        super(fio, brd, passport);
        this.cafedra = cafedra;
    }

    public String getCafedra() {
        return cafedra;
    }

    public void setCafedra(String cafedra) {
        this.cafedra = cafedra;
    }
}
