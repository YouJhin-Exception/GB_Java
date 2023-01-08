package OOP.P4.Sem4.data;

public abstract class User {
    private String fNmane;
    private String lName;
    private String passport;
    private int brDate;

    public User(String fNmane, String lName, String passport, int brDate) {
        this.fNmane = fNmane;
        this.lName = lName;
        this.passport = passport;
        this.brDate = brDate;
    }

    public String getfNmane() {
        return fNmane;
    }

    public void setfNmane(String fNmane) {
        this.fNmane = fNmane;
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
