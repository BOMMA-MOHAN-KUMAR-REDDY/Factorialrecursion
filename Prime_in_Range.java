import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 11 and 25 are:");

        for (int n = 11; n <= 25; n++) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(" "+n);
            }
        }
    }
}
