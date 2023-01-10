package OOP.P4.Sem4.data;

public abstract class User {
    private String fName;
    private String lName;
    private String passport;
    private int brDate;

    public User(String fName, String lName, String passport, int brDate) {
        this.fName = fName;
        this.lName = lName;
        this.passport = passport;
        this.brDate = brDate;
    }

    public String getfNmane() {
        return fName;
    }

    public void setfNmane(String fNmane) {
        this.fName = fNmane;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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
