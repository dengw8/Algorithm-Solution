package 百度;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = n / 3;
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        sort(a, b, n);

        float s1 = getSum1(a, b, n, num);

        sort(b, a, n);

        float s2 = getSum2(a, b, n, num);

        if(s1 - s2 >= 0.000001) {
            System.out.print(s1);
        } else {
            System.out.print(s2);
        }

        System.out.println("0");

    }

    private static void sort(int []a, int []b, int n) {
        int tem;
        for(int i = 1; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(a[j] < a[j - 1]) {
                    tem  = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tem;

                    tem = b[j];
                    b[j] = b[j - 1];
                    b[j - 1] = tem;
                }
            }
        }
    }

    private static float getSum1(int[] a, int[] b, int n, int num) {
        int w1 = 0, w2 = 0, w3 = 0;
        for(int i = 0; i < n; i++) {
            if(i < num) {
                w2 += b[i];
            } else if(i >= num && i < n - num) {
                w3 += a[i] + b[i];
            } else {
                w1 += a[i];
            }
        }
        return w1 + w2 + (float) w3 / 2;
    }
    private static float getSum2(int[] a, int[] b, int n, int num) {
        int w1 = 0, w2 = 0, w3 = 0;
        for(int i = 0; i < n; i++) {
            if(i < num) {
                w1 += a[i];
            } else if(i >= num && i < n - num) {
                w3 += a[i] + b[i];
            } else {
                w2 += b[i];
            }
        }
        return w1 + w2 + (float) w3 / 2;
    }

}
