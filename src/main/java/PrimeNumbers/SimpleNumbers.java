package PrimeNumbers;

import java.util.Scanner;

public class SimpleNumbers {
    public static boolean primeNumber(int num) {
        boolean primeNumber = true;
        if (num == 1) {
            primeNumber = false;
        }
        else {
            int i = 2;
            while (i != num) {
                if (num % i == 0) {
                    primeNumber = false;
                    break;
                } else
                {
                    primeNumber = true;
                }
                i++;
            }
        }

        return primeNumber;
    }
}
