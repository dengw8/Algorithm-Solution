package 虎牙;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        System.out.println(get(n));
    }

    private static int get(int n) {
        if(n < 2) return 0;
        if(n == 2 || n == 3) return 1;

        return get(n - 2) + get(n - 3);
    }
}
