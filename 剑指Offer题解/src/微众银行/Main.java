package 微众银行;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a, b, c;
        a = in.nextLong();
        b = in.nextLong();
        c = in.nextLong();

        long count = 1 + b - c;
        System.out.println(count);
    }

}
