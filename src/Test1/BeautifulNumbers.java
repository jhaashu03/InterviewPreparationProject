package Test1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class BeautifulNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        long out_ = solve(l, r);
        System.out.println(out_);


    }

    private static long solve(int l, int r) {
        long sum = 0;
        for (int i = l; i <= r; i++) {
            if (isBeautiful(i)) {
                sum += i;
            }
            ;
        }
        return sum;
    }

    private static boolean isBeautiful(int i) {
        while (true) {
            if (i == 1)
                return true;
            i = sumDigitSquare(i);
            if (i == 4)
                return false;
        }
    }

    private static int sumDigitSquare(int i) {
        int sum = 0;
        while (i > 0) {
            int digit = i % 10;
            sum += Math.pow(digit, 2);
            i = i / 10;
        }
        return sum;
    }

}
