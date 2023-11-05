package additionalTask;

public class Buckwheat {
    public static int months = 5;

    public static void main(String[] args) {

        int rentPerKg = 100;
        int buckwheatPerMonth = 6;
        int buckwheatWeight = months * buckwheatPerMonth;
        int[] calculations = new int[5];
        calculations[0] = buckwheatWeight * rentPerKg;
        calculations[1] = (buckwheatWeight - buckwheatPerMonth) * rentPerKg;
        calculations[2] = calculations[1] - (buckwheatPerMonth * rentPerKg);
        calculations[3] = calculations[2] - (buckwheatPerMonth * rentPerKg);
        calculations[4] = calculations[3] - -(buckwheatPerMonth * rentPerKg);
        for (int i = 0; i < 5; i++) {
            System.out.println(calculations[i]);

        }
    }
}