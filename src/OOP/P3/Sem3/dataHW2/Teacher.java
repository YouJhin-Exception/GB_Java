package OOP.P3.Sem3.dataHW2;

public class Teacher extends User {
    private String spec;
    private String cafedra;

    public Teacher(String fNmane, String lName, String passport, int brDate, String spec, String cafedra) {
        super(fNmane, lName, passport, brDate);
        this.spec = spec;
        this.cafedra = cafedra;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getCafedra() {
        return cafedra;
    }

    public void setCafedra(String cafedra) {
        this.cafedra = cafedra;
    }
}
