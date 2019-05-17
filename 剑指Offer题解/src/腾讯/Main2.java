package 腾讯;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        int a = 0;
        for(int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            if(array[i] == 1) a++;
        }

        int b = n - a;
        int s1 = 1, s2 = 1;
        for(int i = 0; i < a; i++) {
            s1 *= (n - i);
            s2 *= (i + 1);
        }
        System.out.println(s1 / s2 - b);
    }
}
