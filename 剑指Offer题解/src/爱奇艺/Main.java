package 爱奇艺;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int count = 0;
        int a1 = str.charAt(0) - '0';
        int a2 = str.charAt(1) - '0';
        int a3 = str.charAt(2) - '0';
        int a4 = str.charAt(3) - '0';
        int a5 = str.charAt(4) - '0';
        int a6 = str.charAt(5) - '0';

        int sum1 = a1 + a2 + a3;
        int sum2 = a4 + a5 + a6;

        while(sum1 != sum2) {
            if(sum1 < sum2) {
                int value = sum2 - sum1;
                int min = Math.min(a1, Math.min(a2, a3));
                int max = Math.max(a4, Math.max(a5, a6));
                if(max > 9 - min) {
                    count++;
                    if(max > value) {
                        break;
                    } else {
                        sum2 -= max;
                        if(a4 == max) a4 = 0;
                        else if(a5 == max) a5 = max;
                        else a6 = max;
                    }
                } else {
                    count++;
                    if(9 - min > value) {
                        break;
                    } else {
                        sum1 += (9 - min);
                        if(a1 == min) a1 = 9;
                        else if(a2 == min) a2 = 9;
                        else a3 = 9;
                    }
                }
            }

            else {
                int value = sum1 - sum2;
                int min = Math.min(a4, Math.min(a5, a6));
                int max = Math.max(a1, Math.min(a2, a3));
                if(max > 9 - min) {
                    count++;
                    if(max > value) {
                        break;
                    } else {
                        sum1 -= max;
                        if(a1 == max) a1 = 0;
                        else if(a2 == max) a2 = 0;
                        else a3 = 0;
                    }
                } else {
                    count++;
                    if(9 - min > value) {
                        break;
                    } else {
                        sum2 += (9 - min);
                        if(a4 == min) a4 = 9;
                        else if(a5 == min) a5 = 9;
                        else a6 = 9;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
