package additionalTask;

public class Buckwheat2 {
    public static int months = 5;
    public static int buckwheatPerMonth = 6;
   public static int buckwheatWeight = months * buckwheatPerMonth;

    public static void main(String[] args) {

        int rentPerKg = 100;
        for (int i = 1; i < 2; i++) {
            for (int j = buckwheatWeight; j >= 0; j =  j - 6) {
                int q = j*rentPerKg ;
                return;
                int sumRent = q;

                System.out.println(sumRent);
            }
        }
    }
}