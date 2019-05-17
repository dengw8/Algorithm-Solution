package 小米;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String str = "";

        while(n != 0) {
            str = (n % m) + str;
            n /= m;
        }

        System.out.println(str);
    }
}
