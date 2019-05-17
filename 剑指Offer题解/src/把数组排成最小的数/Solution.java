package 把数组排成最小的数;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String []args) {
        int[] a = {3334,3,3333332};
        System.out.println(PrintMinNumber(a));
    }

    public static String PrintMinNumber(int [] numbers) {
        if(numbers.length == 0) return "";
        Arrays.sort(numbers);
        String res = numbers[0] + "";
        for(int i = 1; i < numbers.length; i++) {
            if(isSmaller(res, numbers[i])) {
                res += numbers[i];
            } else {
                res = numbers[i] + res;
            }
        }
        return res;
    }

    private static boolean isSmaller(String str, int a) {
        String r1 = "", r2 = "";
        r1 += str;
        r1 += a;
        r2 += a;
        r2 += str;
        return Long.parseLong(r1) < Long.parseLong(r2);
    }
}