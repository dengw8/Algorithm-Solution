package 第一个只出现一次的字符位置;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("google"));
    }

    public static int FirstNotRepeatingChar(String str) {
        int len = str.length();
        if(len == 0) return -1;

        int[] array = new int['z' + 1];
        Arrays.fill(array, 0);

        for(int i = 0; i < len; i++) {
            array[str.charAt(i)]++;
        }
        for(int i = 0; i < len; i++) {
            if(array[str.charAt(i)] == 1)
                return i;
        }
        return -1;
    }
}
