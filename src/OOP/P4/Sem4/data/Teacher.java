package OOP.P4.Sem4.data;

import java.util.List;

public class Teacher extends User {
    private String spec;
    private String cafedra;

    private List<Integer> groups;

    public Teacher(String fName, String lName, String passport, int brDate, String spec, String cafedra, List<Integer> groups) {
        super(fName, lName, passport, brDate);
        this.spec = spec;
        this.cafedra = cafedra;
        this.groups = groups;
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

    public List<Integer> getGroups() {
        return groups;
    }

    public void setGroups(List<Integer> groups) {
        this.groups = groups;
    }
}
