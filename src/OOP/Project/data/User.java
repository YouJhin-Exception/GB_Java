package OOP.Project.data;

public abstract class User {
    private String firstName;
    private String lastName;
    private String passport;
    private String brDate;
    private int id;

//    public User(String lastName) {
//        this.lastName = lastName;
//    }
    public User(String firstName) {
        this.firstName = firstName;
    }

    public User(String firstName, String lastName, String passport, String brDate, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
        this.brDate = brDate;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fNmane) {
        this.firstName = fNmane;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getBrDate() {
        return brDate;
    }

    public void setBrDate(String brDate) {
        this.brDate = brDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{firstName = " + getFirstName() + ", lastName = " + getLastName() + ", Birth Date = " + getBrDate() + ", Passport = " + getPassport() + ", id=" + getId() + "}";
    }
}
