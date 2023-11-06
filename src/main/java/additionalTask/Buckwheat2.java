package additionalTask;

public class Buckwheat2 {
    public static int months = 5;
    public static int buckwheatPerMonth = 6;
    public static int buckwheatWeight = months * buckwheatPerMonth;
    public static int rentPerKg = 100;

    public static void main(String[] args) {
        int q = buckwheatWeight * rentPerKg;
        for (int i = 1; i <= 5; i++) {
            for (int j = buckwheatWeight; j >= 0; j = j - 6) {
                j +=q;

            }System.out.println(q);
        }
    }
}
