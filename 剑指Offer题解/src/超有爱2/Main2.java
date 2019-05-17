package 超有爱2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(helper(array, array.length, k));
    }

    private static boolean helper(int[] a, int n, int k) {
        if (k == 0) return true;

        if (n == 1) {
            if (a[0] == k) return true;
            else return false;
        }

        return helper(a, n - 1, k - a[n - 1]) || helper(a, n - 1, k);
    }
}
