package OOP.P4.Sem4.data;

public abstract class User {
    private String firstName;
    private String lastName;
    private String passport;
    private int brDate;

    public User(String fName, String lName, String passport, int brDate) {
        this.firstName = fName;
        this.lastName = lName;
        this.passport = passport;
        this.brDate = brDate;
    }

    public String getfNmane() {
        return firstName;
    }

    public void setfNmane(String fNmane) {
        this.firstName = fNmane;
    }

    public String getlName() {
        return lastName;
    }

    public void setlName(String lName) {
        this.lastName = lName;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public int getBrDate() {
        return brDate;
    }

    public void setBrDate(int brDate) {
        this.brDate = brDate;
    }

}
