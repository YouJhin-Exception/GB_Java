package StartJava.Hw1;

public class Tsk1 {
    public static String sumN(int val) {
        return (val * (val + 1) / 2) + "";
    }

    public static int factN(int val) {
        if (val <= 1) {
            return 1;
        } else {
            return val * factN(val - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumN(5));
        System.out.println(factN(6));
    }

}
