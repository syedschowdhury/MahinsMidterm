package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int first = 0;
        int second = 1;
        int fibo;

        for (int i = 0; i<40; i++) {
            fibo = first+second;
            System.out.println(" "+fibo);
            first = second;
            second = fibo;
        }


    }
}
