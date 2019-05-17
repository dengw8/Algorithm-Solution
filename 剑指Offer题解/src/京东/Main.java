package 京东;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n, m, x, y, d;
        long count = 0;

        n = in.nextLong();
        m = in.nextLong();
        x = in.nextLong();
        y = in.nextLong();
        d = in.nextLong();

        for(long i = 1; i <= n; i++) {
            for(long j  = 1; j <= m; j++) {
                if(Math.abs(i - x) + Math.abs(j - y) == d) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
