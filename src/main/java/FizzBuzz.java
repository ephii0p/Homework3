public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if ((i % 3 == 0) & (i % 5 == 0)) {
                System.out.println(i + " FizzBizz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Bizz");
            } else {
                System.out.println(i + " И не Fizz и не Bizz");
            }
        }
    }
}