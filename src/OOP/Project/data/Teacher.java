package OOP.Project.data;

import java.util.List;

public class Teacher extends User {
    private String cafedra;
    private List<Integer> groups;

    public Teacher(String firstName, String lastName, String passport, String brDate, int id, String cafedra, List<Integer> groups) {
        super(firstName, lastName, passport, brDate, id);
        this.cafedra = cafedra;
        this.groups = groups;
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

    @Override
    public String toString() {
        return "Teacher-" + super.toString() + " cafedra = " + cafedra + ", groups = " + groups + '}';
    }
}
