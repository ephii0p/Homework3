package PrimeNumbers;

import java.util.Scanner;

public class AppPrimeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int num = scanner.nextInt();
        if (SimpleNumbers.primeNumber(num)) {
            System.out.println("Число" + " " + num + " " + "является простым");
        } else {
            System.out.println("Число" + " " + num + " " + "не является простым");
        }
    }
}
