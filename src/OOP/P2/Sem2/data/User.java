package OOP.P2.Sem2.data;

public abstract class User {
    private String fio;
    private int brd;
    private String passport;

    public User(String fio, int brd, String passport) {
        this.fio = fio;
        this.brd = brd;
        this.passport = passport;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getBrd() {
        return brd;
    }

    public void setBrd(int brd) {
        this.brd = brd;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
