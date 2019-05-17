package 孩子们的游戏;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(6, 3));
    }

    public static int LastRemaining_Solution(int n, int m) {
        if(n < 1 || m < 1) return -1;
        int[] flags = new int[n];
        Arrays.fill(flags, 0);

        int turn = n, index = -1, step = 0;
        while(turn > 0) {
            index++;
            if(index >= n) index %= n;
            if(flags[index] == 1) continue;
            step++;
            if(step == m) {
                flags[index] = 1;
                step = 0;
                turn--;
            }
        }
        return index;
    }
}
