/**
 * 动态规划
 */


package 美团2017笔试;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 0) System.out.println(0);
        long []dp = new long[n+1];
        dp[0] = 1;
        int[] moneys = {1, 5, 10, 20, 50, 100};
        for(int i = 0; i < 6; i++) {
            for(int j = 1; j <= n; j++) {
                if(j >= moneys[i]) {
                    dp[j] += dp[j - moneys[i]];
                }
            }
        }
        System.out.println(dp[n]);
    }
}
