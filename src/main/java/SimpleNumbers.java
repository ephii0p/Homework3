import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {

        int i, j;
        boolean simpleNumber;

        for (i = 2; i <= 100; i++) {
            simpleNumber = true;
            for (j = 2; j < i; j++) {
                if ((i % j) != 0)
                    simpleNumber &= true;
                else simpleNumber = false;
            }
            if (simpleNumber) {
                System.out.println("Простое число" + " " + i);
            }
        }
    }
}