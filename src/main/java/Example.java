public class Example {
    public static void main(String[] args) {
        int i = 0;
        for (;;) {
            if (i < 10) {
                break;
            }

            System.out.println(i);
            i++;
        }
    }
}
