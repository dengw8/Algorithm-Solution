package 扑克牌顺子;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 0};
        System.out.println(isContinuous(array));
    }

    public static boolean isContinuous(int [] numbers) {
        int len = numbers.length;
        if(len == 0) return false;

        int[] flags = new int[14];
        Arrays.fill(flags, 0);

        for(int i = 0; i < len; i++) {
            flags[numbers[i]]++;
        }

        int min  = 13, max = 1;
        for(int i = 1; i < 14; i++) {
            if(flags[i] > 1) return false;

            if(flags[i] == 1) {
                if(min > i) min = i;
                if(max < i) max = i;
            }
        }

        for(int i = min; i <= max; i++) {
            if(flags[i] == 0) flags[0]--;
        }

        return flags[0] >= 0;
    }
}
